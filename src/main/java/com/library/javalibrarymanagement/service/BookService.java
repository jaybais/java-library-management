package com.library.javalibrarymanagement.service;

import com.library.javalibrarymanagement.model.Book;
import java.util.List;
import java.util.Optional;

public interface BookService {

    Book saveBook(Book book);

    List<Book> getAllBooks();

    Optional<Book> getBookById(Long id);

    void deleteBook(Long id);

    List<Book> getBooksByAuthor(String author);

    List<Book> getBooksByTitle(String title);

    List<Book> getAvailableBooks();

}
