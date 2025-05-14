package PackageName.book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("/book")
public class BookController {

    @GetMapping("/all")
    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<Book>();
        var bookA = new Book("blanche neige", "Grimm", 1812);
        var bookB = new Book("cendrillon", "Grimm", 1867);
        var bookc = new Book("L'aiguille Creuse", "Leblanc", 1909);

        books.add(bookA);
        books.add(bookB);
        books.add(bookc);
        
        return books;
    }
}
