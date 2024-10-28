package com.example.booklibrary.repository;

import com.example.booklibrary.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepo extends JpaRepository<Book, Integer> {

}

