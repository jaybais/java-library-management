package com.library.javalibrarymanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.javalibrarymanagement.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    // List<Book> findByAvailable(boolean available); // TODO: uncomment when available field is added to Book entity in Phase 4b

}
