package com.example.warmup.controllers;

import com.example.warmup.Book;
import com.example.warmup.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(){
        var books = this.bookRepository.findAll();

        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        var book2 = this.bookRepository.save(book);

        return new ResponseEntity<>(book2, HttpStatus.CREATED);
    }
}
