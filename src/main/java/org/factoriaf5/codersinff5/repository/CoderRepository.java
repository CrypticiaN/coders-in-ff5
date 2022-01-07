package org.factoriaf5.codersinff5.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface CoderRepository extends CrudRepository<Coder, Long> { }

