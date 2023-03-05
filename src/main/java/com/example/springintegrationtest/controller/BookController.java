package com.example.springintegrationtest.controller;

import com.example.springintegrationtest.entity.Book;
import com.example.springintegrationtest.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> tumKitaplariGetir() {
        return bookService.getAllBook();
    }

    @PostMapping
    public Book kitapKaydet(@RequestBody Book book) {
        return bookService.saveBook(book);
    }
}

