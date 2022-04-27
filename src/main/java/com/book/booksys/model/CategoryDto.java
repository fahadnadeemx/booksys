package com.book.booksys.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryDto {

    @Id
    private int id;

    @NotNull
    @NotBlank(message = "Category Name is mandatory")
    private String name;

}