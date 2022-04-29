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
    public static final Long id = 1L;
    public static final String bookname = "First Book";
    public static final String author = "Fahad Nadeem";
    public static final Integer price = 100;
    Category category = new Category(1, "Entertainment");

    IBookMapper bookMapper = IBookMapper.INSTANCE;

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
        book.setId(id);
        book.setBookname(bookname);
        book.setAuthor(author);
        book.setPrice(price);
        book.setCategory(category);

        //when
        BookDto bookDto = bookMapper.mapDto(book);

        //then
        assertNotNull(bookDto);
        assertEquals(id, bookDto.getId());
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
        bookDto.setId(id);
        bookDto.setBookname(bookname);
        bookDto.setAuthor(author);
        bookDto.setPrice(price);
        bookDto.setCategory(category);

        //when
        Book book = bookMapper.map(bookDto);
        //then
        assertNotNull(book);
        assertEquals(id, book.getId());
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
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1L, "first", "first", 10, category));
        bookList.add(new Book(2L, "second", "first", 20, category));
        bookList.add(new Book(3L, "third", "first", 30, category));

        //when
        List<BookDto> bookDtos = bookMapper.mapList(bookList);

        //then
        assertEquals(3,bookDtos.size());
        assertNotNull(bookDtos);
    }
}
