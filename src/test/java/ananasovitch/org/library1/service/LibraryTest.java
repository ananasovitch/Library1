package ananasovitch.org.library1.service;

import ananasovitch.org.library1.entity.AuthorEntity;
import ananasovitch.org.library1.entity.BookEntity;
import ananasovitch.org.library1.model.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {

    private AuthorEntity author;
    private BookEntity book;
    private AuthorRequest authorRequest;
    private AuthorResponse authorResponse;
    private BookRequest bookRequest;
    private BookResponse bookResponse;
    private GetAuthorBooksResponse getAuthorBooksResponse;

    public LibraryTest() {
        author = new AuthorEntity();
        author.setFirstName("John");
        author.setFamilyName("Doe");
        author.setSecondName("Smith");

        book = new BookEntity();
        book.setBookTitle("Test Book");
        book.setAuthor(author);

        authorRequest = new AuthorRequest();
        authorRequest.setFirstName("John");
        authorRequest.setFamilyName("Doe");
        authorRequest.setSecondName("Smith");

        authorResponse = new AuthorResponse();
        authorResponse.setAuthorId(1L);
        authorResponse.setErrorCode(0);
        authorResponse.setErrorMessage("Success");
        authorResponse.setErrorDetails("Author created successfully");

        bookRequest = new BookRequest();
        bookRequest.setBookTitle("Test Book");
        bookRequest.setAuthorId(1L);

        bookResponse = new BookResponse();
        bookResponse.setBookId(1L);
        bookResponse.setErrorCode(0);
        bookResponse.setErrorMessage("Success");
        bookResponse.setErrorDetails("Book created successfully");

        getAuthorBooksResponse = new GetAuthorBooksResponse();
        getAuthorBooksResponse.setBooks(Arrays.asList(bookResponse));
    }

    @Test
    public void testAuthorEntity() {
        assertEquals("John", author.getFirstName());
        assertEquals("Doe", author.getFamilyName());
        assertEquals("Smith", author.getSecondName());
    }

    @Test
    public void testBookEntity() {
        assertEquals("Test Book", book.getBookTitle());
        assertEquals(author, book.getAuthor());
    }

    @Test
    public void testAuthorRequest() {
        assertEquals("John", authorRequest.getFirstName());
        assertEquals("Doe", authorRequest.getFamilyName());
        assertEquals("Smith", authorRequest.getSecondName());
    }

    @Test
    public void testAuthorResponse() {
        assertEquals(1L, authorResponse.getAuthorId());
        assertEquals(0, authorResponse.getErrorCode());
        assertEquals("Success", authorResponse.getErrorMessage());
        assertEquals("Author created successfully", authorResponse.getErrorDetails());
    }

    @Test
    public void testBookRequest() {
        assertEquals("Test Book", bookRequest.getBookTitle());
        assertEquals(1L, bookRequest.getAuthorId());
    }

    @Test
    public void testBookResponse() {
        assertEquals(1L, bookResponse.getBookId());
        assertEquals(0, bookResponse.getErrorCode());
        assertEquals("Success", bookResponse.getErrorMessage());
        assertEquals("Book created successfully", bookResponse.getErrorDetails());
    }

    @Test
    public void testGetAuthorBooksResponse() {
        assertEquals(1, getAuthorBooksResponse.getBooks().size());
        assertEquals(bookResponse, getAuthorBooksResponse.getBooks().get(0));
    }
}