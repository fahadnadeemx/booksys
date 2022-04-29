package com.book.booksys.model;

import com.book.booksys.entity.Category;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDto {
    @Id
    @GeneratedValue
    @JsonProperty("id")
    private Long id;

    @NotNull
    @NotBlank(message = "Book Name is mandatory")
    @JsonProperty("bookname")
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