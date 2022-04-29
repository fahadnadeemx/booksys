package com.book.booksys.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Category {

    @Id
    private Long id;
    private String name;

    public Category(int id, String name) {
        this.id = Long.valueOf(id);
        this.name = name;
    }
}

