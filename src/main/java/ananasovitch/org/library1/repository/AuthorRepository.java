package ananasovitch.org.library1.repository;

import ananasovitch.org.library1.entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {
    boolean existsByFirstNameAndFamilyName(String firstName, String familyName);
}

