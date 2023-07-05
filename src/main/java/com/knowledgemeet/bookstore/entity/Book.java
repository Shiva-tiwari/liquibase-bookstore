package com.knowledgemeet.bookstore.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "AUTHOR_ID")
    private Author author;

}
