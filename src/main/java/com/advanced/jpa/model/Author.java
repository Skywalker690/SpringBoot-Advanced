package com.advanced.jpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Author {

    @Id
    @GeneratedValue
            /*(strategy = GenerationType.SEQUENCE,
            generator = "author_sequence"
    )
    @SequenceGenerator(name = "author_sequence",
            sequenceName = "author_sequence",
            allocationSize = 1
    )

             */

    private Integer id;
    @Column(
        length = 35
    )
    private String firstName;

    private String lastName;
    @Column(
        unique = true,nullable = false

    )
    private String email;

    private int age;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;


}


