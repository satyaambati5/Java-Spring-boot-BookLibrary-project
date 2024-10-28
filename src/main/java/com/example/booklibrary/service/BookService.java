package com.example.booklibrary.service;

import com.example.booklibrary.model.Book;

import com.example.booklibrary.repository.BooksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class BookService {
//    List<Book> Books = new ArrayList<>( Arrays.asList(new Book(101, "SoftwareEngineering ", "satya"), new Book(102, "Java", "Vinisika"), new Book(103, "Python", "lakshman Ram")));
    @Autowired
    BooksRepo repo;
    public List<Book> getBooks() {
        return repo.findAll();
    }
    public Book getBookById(int bookId){
        return repo.findById(bookId).orElse(new Book());
//        return Books.stream().filter(p -> p.getId()== bookId).findFirst().orElse(null);
    }

    public void createBook(Book book){
        repo.save(book);
    }
    public void updateBook(Book book){
        repo.save(book);
    }
    public void deleteBook(int prodId){
        repo.deleteById(prodId);
    }
}
