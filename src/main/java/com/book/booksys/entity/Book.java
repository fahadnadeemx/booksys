package com.book.booksys.entity;

import javax.persistence.*;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bookname;
    private String author;
    private int price;

    @ManyToOne
    @JoinColumn(name="Cid")
    private Category category;

    public Book(int id, String bookname, String author, int price, Category category) {
        this.id = id;
        this.bookname = bookname;
        this.author = author;
        this.price = price;
        this.category = category;
    }

}

