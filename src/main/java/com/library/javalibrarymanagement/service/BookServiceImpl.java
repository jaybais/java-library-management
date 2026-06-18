package com.library.javalibrarymanagement.service;
import com.library.javalibrarymanagement.model.Book;
import com.library.javalibrarymanagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class BookServiceImpl implements BookService {
    
    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public Optional<Book> updateBook(Long id, Book book) {
        return bookRepository.findById(id).map(existing -> {
            existing.setTitle(book.getTitle());
            existing.setAuthor(book.getAuthor());
            existing.setpublishedYear(book.getpublishedYear());
            existing.setGenre(book.getGenre());
            existing.setIsbn(book.getIsbn());
            return bookRepository.save(existing);
        });
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public List<Book> getBooksByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }

    @Override
    public List<Book> getBooksByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    // TODO: uncomment when available field is added to Book entity in Phase 4b
    // @Override
    // public List<Book> getAvailableBooks() {
    //     return bookRepository.findByAvailable(true);
    // }
}
