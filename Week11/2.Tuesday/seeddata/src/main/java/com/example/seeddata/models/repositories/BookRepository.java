package com.example.seeddata.models.repositories;

import com.example.seeddata.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
