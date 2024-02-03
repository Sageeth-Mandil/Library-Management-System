package org.example.service.impl;

import org.example.dto.Book;
import org.example.entity.BookEntity;
import org.example.repository.BookRepository;
import org.example.service.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository repository;

    ModelMapper mapper;
    @Bean
    public void setup(){
        this.mapper=new ModelMapper();
    }
    @Override
    public void addBook(Book book) {
        BookEntity entity = mapper.map(book, BookEntity.class);
        repository.save(entity);
    }

    @Override
    public void deleteBook(Book book) {
        BookEntity entity = mapper.map(book, BookEntity.class);
        repository.delete(entity);
    }

    @Override
    public List<Book> getAll() {
        Iterable<BookEntity> iterable;
        iterable = repository.findAll();
        Iterator iterator = new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };


        return null;
    }
}
