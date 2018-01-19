package com.tbc.java9.api;

import com.tbc.java9pa.service.BookService;
import com.tbc.java9pa.service.author.AuthorService;

import java.util.logging.Logger;

public class BooksController {

    private static final Logger LOG = Logger.getLogger(BooksController.class.getName());
    public void displayAllBooks() {
        LOG.info("Displaying all books");

        BookService bookService = new BookService();
        bookService.getAllBooks().forEach(book -> System.out.println("Book Name: "+book.getName()));
    }

    public void displayAllAuthors() {

        LOG.info("Displaying all Authors ");
        AuthorService bookService = new AuthorService();
        bookService.getAllAuthors().forEach(author -> System.out.println("Author Name: "+author.getName()));
    }

    public static void main(String[] args) {
        BooksController booksController = new BooksController();

        booksController.displayAllBooks();
        booksController.displayAllAuthors();
    }
}
