package itacademy.book.service;

import itacademy.book.entity.Book;
import itacademy.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public Book deleteBookById(Long id) {
        Book book = getBookById(id);
        if (book != null){
            bookRepository.delete(book);
            return book;
        }
        return null;
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Long id, Book book) {
        Book book_1 = getBookById(id);
        book_1.setBookTitle(book.getBookTitle());
        book_1.setBookAuthor(book.getBookAuthor());
        book_1.setBookPrice(book.getBookPrice());
        return saveBook(book_1);
    }
}
