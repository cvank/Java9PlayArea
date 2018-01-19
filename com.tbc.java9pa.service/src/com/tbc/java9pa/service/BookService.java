package com.tbc.java9pa.service;

import com.tbc.java9.repository.BookRepository;
import com.tbc.java9pa.domain.Book;

import java.util.List;

public class BookService {

    public List<Book> getAllBooks() {

        return BookRepository.getBooks();
    }
}
