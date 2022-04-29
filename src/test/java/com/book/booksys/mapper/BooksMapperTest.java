package com.book.booksys.mapper;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.book.booksys.entity.Book;
import com.book.booksys.entity.Category;
import com.book.booksys.model.BookDto;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BooksMapperTest {
    public static final Long ID = 1L;
    public static final String bookname = "First Book";
    public static final String author = "Fahad Nadeem";
    public static final Integer price = 100;
    Category category = new Category(1, "Entertainment");

    BookMapper bookMapper = BookMapper.INSTANCE;

    @Test
    public void booktobookDtoReturnsNull() {
        assertNull(bookMapper.mapDto(null));
    }

    @Test
    public void booksTobooksDtoReturnsEmptyObject() {
        assertNotNull(bookMapper.mapDto(new Book()));
    }

    @Test
    public void BooksToBooksDto() {
        // given
        Book book = new Book();
        book.setId(ID);
        book.setBookname(bookname);
        book.setAuthor(author);
        book.setPrice(price);
        book.setCategory(category);

        //when
        BookDto bookDto = bookMapper.mapDto(book);

        //then
        assertNotNull(bookDto);
        assertEquals(ID, bookDto.getId());
        assertEquals(bookname, bookDto.getBookname());
        assertEquals(author, bookDto.getAuthor());
        assertEquals(price, bookDto.getPrice());
        assertEquals(category, bookDto.getCategory());

    }

    @Test
    public void booksDtoToBooksReturnsNull() {
        assertNull(bookMapper.map(null));
    }

    @Test
    public void usersDtoToUsersReturnsEmptyObject() {
        assertNotNull(bookMapper.map(new BookDto()));
    }

    @Test
    public void usersDtoToUsers() {
        // given

        BookDto bookDto = new BookDto();
        bookDto.setId(ID);
        bookDto.setBookname(bookname);
        bookDto.setAuthor(author);
        bookDto.setPrice(price);
        bookDto.setCategory(category);

        //when
        Book book = bookMapper.map(bookDto);
        //then
        assertNotNull(book);
        assertEquals(ID, book.getId());
        assertEquals(bookname, book.getBookname());
        assertEquals(author, book.getAuthor());
        assertEquals(price, book.getPrice());
        assertEquals(category, book.getCategory());

    }

    @Test
    public void toUserDtoReturnsNull() {
        assertNull(bookMapper.mapList(null));
    }

    @Test
    public void toUserDtoReturnsEmptyObject() {
        List<Book> bookList = new ArrayList<>(Arrays.asList());

        assertNotNull(bookMapper.mapList(bookList));
    }

    @Test
    public void toUserDto() {
        // given
        Book book = new Book();
        book.setId(ID);
        book.setBookname(bookname);
        book.setAuthor(author);
        book.setPrice(price);
        book.setCategory(category);

        List<Book> bookList =new ArrayList<>(Arrays.asList(book));
        //when
        List<BookDto> bookDtos = bookMapper.mapList(bookList);

        //then
        assertNotNull(bookDtos);

    }
}
