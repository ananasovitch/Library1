package ananasovitch.org.library1.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.awt.print.Book;
import java.util.List;

@XmlRootElement(name = "books")
public class Books {
    private List<Book> books;

    @XmlElement(name = "book")
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
