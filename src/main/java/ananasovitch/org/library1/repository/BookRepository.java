package ananasovitch.org.library1.repository;

import ananasovitch.org.library1.entity.BookEntity;


import java.util.List;

public interface BookRepository {
    List<BookEntity> findAll();
    BookEntity findById(Long id);
    void save(BookEntity book);
    void update(BookEntity book);
    void deleteById(Long id);
    List<BookEntity> findByAuthorId(Long authorId);
}