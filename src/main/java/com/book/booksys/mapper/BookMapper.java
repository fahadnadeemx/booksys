package com.book.booksys.mapper;
import com.book.booksys.entity.Book;
import com.book.booksys.model.BookDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BookMapper{
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);
//Book to Book DTO
    BookDto mapDto(Book book);
    // Book DTO to Book
    Book map(BookDto bookDto);

    List<BookDto> mapList(List<Book> bookList);
}
