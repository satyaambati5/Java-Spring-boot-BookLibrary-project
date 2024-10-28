package com.example.booklibrary.controller;

import com.example.booklibrary.model.Book;
import com.example.booklibrary.service.BookService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController

public class BookController {
    @Autowired
    BookService service;
    @GetMapping("/")
    public String  home(HttpServletRequest request){
        return "Welcome to Satya Book Library"+ request.getSession().getId();
    }

    @GetMapping("/books")
    public List<Book> getBooks(){
        return service.getBooks();
    }
    @GetMapping("/books/{bookId}")
    public Book getBookById(@PathVariable int bookId){
        return service.getBookById(bookId);
    }
    @PostMapping("/books")
    public void createBook(@RequestBody Book book){
        System.out.println(book);
        service.createBook(book);
    }
    @PutMapping("/update")
    public void updateBook(Book book){
        service.updateBook(book);
    }
    @DeleteMapping("/delete/{prodId}")
    public void deleteBook(int prodId){
        service.deleteBook(prodId);
    }

}
