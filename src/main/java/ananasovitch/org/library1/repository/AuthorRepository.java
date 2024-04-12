package ananasovitch.org.library1.repository;

import ananasovitch.org.library1.entity.AuthorEntity;

import java.util.List;

import java.util.List;

public interface AuthorRepository {
    List<AuthorEntity> findAll();
    AuthorEntity findById(Long id);
    void save(AuthorEntity author);
    void update(AuthorEntity author);
    void deleteById(Long id);
}