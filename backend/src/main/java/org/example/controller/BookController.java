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

    @PostMapping("/add")
    public void addBook(@RequestBody Book book){
        service.addBook(book);
    }

    @PostMapping("/edit")
    public void editBook(@RequestBody Book book){
        service.updateBook(book);
    }

    @DeleteMapping("/delete")
    public void deleteBook(@RequestBody Book book){
        service.deleteBook(book);
    }

    @GetMapping("/get")
    public List<Book> getBooks(){return service.getAll();}
}
