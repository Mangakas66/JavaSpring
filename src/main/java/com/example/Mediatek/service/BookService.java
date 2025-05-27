package com.example.Mediatek.service;

import com.example.Mediatek.model.Book;
import com.example.Mediatek.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping(("/"))
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
