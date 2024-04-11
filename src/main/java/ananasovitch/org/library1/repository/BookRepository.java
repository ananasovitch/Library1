package ananasovitch.org.library1.repository;

import ananasovitch.org.library1.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
    List<BookEntity> findByAuthorId(Long authorId);
}