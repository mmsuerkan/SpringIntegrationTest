package com.example.springintegrationtest;

import com.example.springintegrationtest.entity.Book;
import com.example.springintegrationtest.service.BookService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = SpringIntegrationTestApplication.class)
@RunWith(SpringRunner.class)
class SpringIntegrationTestApplicationTests {

    @Autowired
    private BookService bookService;

    @Test
    void saveBookTest() {
        Book book = new Book();
        book.setName("Test Book");
        book.setAuthor("Test Author");
        bookService.saveBook(book);
        Assert.assertTrue(book.getId() > 0);
    }

    @Test
    void getAllBookTest() {
        Book book = new Book();
        book.setName("Test Book");
        book.setAuthor("Test Author ");
        bookService.saveBook(book);

        List<Book> books = bookService.getAllBook();
        Assert.assertTrue(books.size() > 0);
    }

}
