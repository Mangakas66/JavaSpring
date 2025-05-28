package com.example.Mediatek.service;

import com.example.Mediatek.model.Book;
import com.example.Mediatek.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@CrossOrigin(origins = "http://localhost:4200") // TODO do better
@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping(("/"))
    public List<Book> findAll() {
        return (List<Book>) bookRepository.findAll();
    }

    @GetMapping("/{id}")
    public Book findById(@RequestParam long id) {
        return bookRepository.findById(id).orElseThrow();
    }

    @PostMapping("/")
    void addBook(@RequestBody Book book) {
        bookRepository.save(book);
    }

    @DeleteMapping("/{id}")
    void deleteBook(@PathVariable long id) {
        bookRepository.deleteById(id);
    }
}
