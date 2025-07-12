package com.advanced.jpa.model;


import jakarta.persistence.MappedSuperclass;

import java.time.LocalDate;

@MappedSuperclass
public class BaseEntity {

    private LocalDate createdAt;
    private LocalDate lastModifiedAt;
    private LocalDate createdBy;
    private String lastModifiedBy;

}
