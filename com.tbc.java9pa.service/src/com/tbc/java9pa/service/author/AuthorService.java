package com.tbc.java9pa.service.author;

import com.tbc.java9.repository.AuthorRepository;
import com.tbc.java9pa.domain.Author;

import java.util.List;

public class AuthorService {

    public List<Author> getAllAuthors() {

        return AuthorRepository.getAllAuthors();
    }
}
