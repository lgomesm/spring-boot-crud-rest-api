package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class BookController {

    @Autowired
    public BookRepository bookRepository;

    //Get all of the books
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        bookList = bookRepository.findAll();
        return bookList;
    }

}
