package com.example.warmup.controllers;

import com.example.warmup.Book;
import com.example.warmup.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/books")
public class BookController {
    private final BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    //HTTP Verbs
    //getAllX, getXById, createX, updateX, deleteX
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(){
        var books = this.bookRepository.findAll();

        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@Valid @RequestBody Book book){
        var book2 = this.bookRepository.save(book);

        return new ResponseEntity<>(book2, HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id){
        //find the book with the id. If the book exists delete it, otherwise give back an error code
        //find the book with the id
        var book = this.bookRepository.findById(id);

        if(book.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            //delete the book because we found it
            this.bookRepository.delete(book.get());
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<Book> updateBook(@Valid @RequestBody Book book, @PathVariable Long id){
        //find out if the book is in our database
        var foundBook = this.bookRepository.findById(id);

        //if it isn't give them a 404 Not Found
        if(foundBook.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            //if it is, update the properties of the book that we allow to update
            var updatedBook = foundBook.get();

            updatedBook.setPrice(book.getPrice());
            updatedBook.setLikes(book.getLikes());

            //save the book
            var updatedBookFromDatabase = this.bookRepository.save(updatedBook);

            //give them back a 200 and the book in its updated form
            return new ResponseEntity<>(updatedBookFromDatabase, HttpStatus.OK);
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id){
        //check if the book is in the database
        var book = this.bookRepository.findById(id);

        //if it isnt, give them a 404 not found
        if(book.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        else{
            //if it is, give them the book
            return new ResponseEntity<>(book.get(), HttpStatus.OK);
        }
    }
}
