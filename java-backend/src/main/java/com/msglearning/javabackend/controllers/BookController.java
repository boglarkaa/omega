package com.msglearning.javabackend.controllers;

import com.msglearning.javabackend.entity.Book;
import com.msglearning.javabackend.services.BookService;
import com.msglearning.javabackend.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({ControllerConstants.API_PATH_BOOK})
public class BookController {
    private static final String ALL_PATH = "/all";
    private static final String ID_PATH = "/id/{id}";
    private static final String AUTHOR_PATH = "/author/{name}";
    private static final String SAVE_PATH = "/new";
    private static final String COVER_IMAGE_PATH = "/covers/{id}";

    @Autowired
    private BookService bookService;
    @Autowired
    private ImageService imageService;

    @GetMapping(ALL_PATH)
    public List<Book> getAll()
    {
        return bookService.findAll();
    }

    @GetMapping(AUTHOR_PATH)
    public List<Book> getBooksByAuthor(@PathVariable String name)
    {
        return bookService.findByAuthor(name);
    }

    @PostMapping(SAVE_PATH)
    public boolean saveBook(@RequestBody Book book)
    {
        try{
            bookService.save(book);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;
    }



}
