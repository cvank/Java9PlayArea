package com.tbc.java9.repository;

import com.tbc.java9pa.domain.Author;

import java.util.List;

public class AuthorRepository {

    public static List<Author> getAllAuthors() {
        return List.of(new Author(1, "Collin"), new Author(2,"Rolling"));
    }
}
