package com.example.Mediatek;

import com.example.Mediatek.model.Book;
import com.example.Mediatek.service.BookService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.Assert;

import java.util.List;


@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = MediatekApplication.class)
public class BookTests {

    @Autowired
    private BookService bookService;

    @Test
    public void findAll() throws Exception {
        List<Book> books = bookService.findAll();
        Assert.isTrue(books.size() == 5, "Should be 5 books at initialization");
    }
}
