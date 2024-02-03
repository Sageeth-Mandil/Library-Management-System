package org.example.service;

import org.example.dto.Book;
import java.util.List;

public interface BookService {
    void addBook(Book book);
    void updateBook(Book book);
    void deleteBook(Book book);
    List<Book> getAll();
}
