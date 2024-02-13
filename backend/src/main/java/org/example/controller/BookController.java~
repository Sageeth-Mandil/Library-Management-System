package org.example.controller;

import org.example.dto.Book;
import org.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService service;

    @PostMapping
    public void addBook(@RequestBody Book book){
        service.addBook(book);
    }

    @PostMapping
    public void editBook(@RequestBody Book book){
        service.updateBook(book);
    }

    @DeleteMapping
    public void deleteBook(@RequestBody Book book){
        service.deleteBook(book);
    }

    @GetMapping
    public List<Book> getBooks(){return service.getAll();}
}
