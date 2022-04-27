package com.book.booksys.mapper;
import com.book.booksys.model.CategoryDto;
import jdk.jfr.Category;
import org.mapstruct.factory.Mappers;

import java.util.List;

public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDto categorytoCategoryDto(Category category);
    Category categoriesDtotoCategories(CategoryDto categoryDto);
    List<CategoryDto> toCategoryDto(List<Category> categoryList);
}
