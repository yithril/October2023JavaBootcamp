package com.example.seeddata.models.helper;

import com.example.seeddata.models.Book;
import com.example.seeddata.models.repositories.BookRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder implements CommandLineRunner {
    @Value("${app.seed-database:false}")
    private boolean seedDatabase;

    private final BookRepository bookRepository;

    public DatabaseSeeder(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (seedDatabase) {
            Faker faker = new Faker();

            for (int i = 0; i < 10; i++) {
                var book = new Book();
                book.setAuthor(faker.book().author());
                book.setGenre(faker.book().genre());
                book.setTitle(faker.book().title());
                book.setPublisher(faker.book().publisher());

                this.bookRepository.save(book);
            }

            System.out.println("Database has been seeded");
        } else {
            System.out.println("Database seeding is skipped");
        }
    }
}
