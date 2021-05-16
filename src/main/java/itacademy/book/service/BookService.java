package itacademy.book.service;

import itacademy.book.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAll();
    Book getBookById(Long id);
    Book deleteBookById(Long id);
    Book saveBook(Book book);
    Book updateBook(Long id,Book book);
}
