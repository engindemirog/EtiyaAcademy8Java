package com.etiya.rentACar.entities;

import com.etiya.rentACar.core.entities.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="models")
public class Model extends BaseEntity {
    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name="brandId")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name="fuelId")
    private Fuel fuel;

    @ManyToOne
    @JoinColumn(name="transmissionId")
    private Transmission transmission;

    @OneToMany(mappedBy = "model")
    private List<Car> cars;

}
