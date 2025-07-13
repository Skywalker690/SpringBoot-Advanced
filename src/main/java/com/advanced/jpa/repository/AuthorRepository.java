package com.advanced.jpa.repository;

import com.advanced.jpa.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author,Integer> {

    List<Author> findAllByFirstNameIgnoreCase (String name);

}
