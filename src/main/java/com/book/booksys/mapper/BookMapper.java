package com.book.booksys.mapper;
import com.book.booksys.entity.Book;
import com.book.booksys.model.BookDto;
import org.mapstruct.factory.Mappers;

import java.util.List;

public interface BookMapper{
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookDto booktoBookDto(Book book);
    Book booksDtoTobooks(BookDto bookDto);
    List<BookDto> toBookDto(List<Book> bookList);
}
