package org.factoriaf5.codersinff5.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;

public interface CoderRepository {

    Coder save(Coder coder);

    void deleteAll();

    @Repository
    public interface BookRepository extends CrudRepository<Book, Long> { }
}
