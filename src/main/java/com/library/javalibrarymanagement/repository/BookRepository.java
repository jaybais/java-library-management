package com.library.javalibrarymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.library.javalibrarymanagement.model.Book;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    List<Book> findByAvailable(boolean available);

}
