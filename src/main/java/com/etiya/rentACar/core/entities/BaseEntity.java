package com.etiya.rentACar.core.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="createdDate")
    private LocalDateTime createdDate;
    @Column(name="updatedDate")
    private LocalDateTime updatedDate;
    @Column(name="deletedDate")
    private LocalDateTime deletedDate;
}
