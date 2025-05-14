package PackageName.book;

import java.util.UUID;

public class Book {
    private UUID id = UUID.randomUUID();
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        setTitle(title);
        setAuthor(author);
        setYear(year);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
