package com.example.warmup;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;

//This is the universe where we use Lombok
//Notice how we don't have to write getters and setters
//And we don't have to write constructors. We just use annotations
@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Date publishedDate;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    private int likes;
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}
