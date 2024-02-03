package org.example.service.impl;

import org.example.dto.Book;
import org.example.entity.BookEntity;
import org.example.repository.BookRepository;
import org.example.service.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

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
    public void updateBook(Book book) {
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
        List<Book> list = new ArrayList<>();
        Iterable<BookEntity> itemEntityList = repository.findAll();
        Iterator<BookEntity> iterator = itemEntityList.iterator();

        while(iterator.hasNext()){
            BookEntity itemEntity1 = iterator.next();
            Book item = mapper.map(itemEntity1, Book.class);
            list.add(item);
        }

        return list;
    }
}
