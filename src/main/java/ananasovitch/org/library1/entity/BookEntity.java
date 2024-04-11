package ananasovitch.org.library1.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BookEntity {
    @Id
    private Long id;
    private String bookTitle;
    @ManyToOne
    private AuthorEntity author;
}
