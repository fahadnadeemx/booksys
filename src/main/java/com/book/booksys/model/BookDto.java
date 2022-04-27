package com.book.booksys.model;

import com.book.booksys.entity.Category;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @NotBlank(message = "Book Name is mandatory")
    private String bookname;

    @NotNull
    @NotBlank(message = "Author Name is mandatory")
    private String author;

    @NotNull
    private int price;

    @ManyToOne
    @JoinColumn(name = "Cid")
    private Category category;

}