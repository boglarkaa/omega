package com.msglearning.javabackend.services;

import com.msglearning.javabackend.entity.Book;
import com.msglearning.javabackend.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public Book save(Book book) throws Exception{
        return bookRepository.save(book);
    }

    public List<Book> findAll() {
        List<Book> books = bookRepository.findAll();
        if (books.isEmpty())
            return Collections.emptyList();

        return books.stream().collect(Collectors.toList());
    }

    public List<Book> findByAuthor(String author)
    {
        List<Book> books = bookRepository.findByAuthor(author);
        if(books.isEmpty())
            return Collections.emptyList();
        return books;
    }

    public List<Book> findByTitle(String title)
    {
        return bookRepository.findByTitle(title);
    }

    public Map<String,List<Book>> groupByAuthors(){
        List<Book> books = bookRepository.findAll();
        return books.stream().collect(Collectors.groupingBy(Book::getAuthor));
    }

    public Optional<Book> findById(Long id)
    {
        return bookRepository.findById(id);
    }
    public Optional<String> getCoverImage(Long id)
    {
        return bookRepository.findCoverImageById(id);
    }

}