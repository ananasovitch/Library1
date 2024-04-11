package ananasovitch.org.library1.service;

import ananasovitch.org.library1.entity.AuthorEntity;
import ananasovitch.org.library1.model.SaveAuthorRequest;
import ananasovitch.org.library1.model.SaveAuthorResponse;
import ananasovitch.org.library1.repository.AuthorRepository;
import ananasovitch.org.library1.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LibraryService {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @Autowired
    public LibraryService(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public SaveAuthorResponse saveAuthor(SaveAuthorRequest request) {
        if (authorRepository.existsByFirstNameAndFamilyName(request.getFirstName(), request.getFamilyName())) {
            throw new IllegalArgumentException("Author already exists");
        }

        AuthorEntity author = new AuthorEntity();
        author.setFirstName(request.getFirstName());
        author.setFamilyName(request.getFamilyName());
        author.setSecondName(request.getSecondName());

        AuthorEntity savedAuthor = authorRepository.save(author);

        SaveAuthorResponse response = new SaveAuthorResponse();
        response.setAuthorId(savedAuthor.getId());
        return response;
    }
}