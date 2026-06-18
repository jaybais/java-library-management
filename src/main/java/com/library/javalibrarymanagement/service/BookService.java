package com.library.javalibrarymanagement.service;
import java.util.List;
import java.util.Optional;

import com.library.javalibrarymanagement.model.Book;
public interface BookService {
    Book addBook(Book book);
    List<Book> getAllBooks();
    Optional<Book> getBookById(Long id);
    Optional<Book> updateBook(Long id, Book book);
    void deleteBook(Long id);
    List<Book> getBooksByAuthor(String author);
    List<Book> getBooksByTitle(String title);
    // TODO: uncomment when available field is added to Book entity in Phase 4b
    //  List<Book> getAvailableBooks();
}
