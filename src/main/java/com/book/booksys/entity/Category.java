package com.book.booksys.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Category {

    @Id
    private int id;
    private String name;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

