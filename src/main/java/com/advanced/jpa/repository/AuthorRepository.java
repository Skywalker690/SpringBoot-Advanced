package com.advanced.jpa.repository;

import com.advanced.jpa.model.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author,Integer>, JpaSpecificationExecutor<Author> {

    List<Author> findAllByFirstNameIgnoreCase (String name);


    //Direct Update
    @Modifying
    @Transactional
    @Query("update Author a set a.age =:age where a.id= :id")
    void UpdateAuthor(int age , int id);

    @Modifying
    @Transactional
    @Query("update Author a set  a.lastName=:name ")
    void UpdateAllAuthors(String name);

    List<Author> findByNamedQuery(@Param("age") int age);

}
