package com.advanced.jpa.model;


import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@MappedSuperclass
public class BaseEntity {

    private LocalDate createdAt;
    private LocalDate lastModifiedAt;
    private LocalDate createdBy;
    private String lastModifiedBy;

}
