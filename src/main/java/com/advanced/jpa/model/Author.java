package com.advanced.jpa.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder
@NamedQuery(
        name = "Author.findByNamedQuery",
        query = "select a from Author a where a.age>=:age"

)
public class Author extends BaseEntity{

    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String lastName;
    @Column(unique = true,nullable = false)
    private String email;
    private int age;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;


}


