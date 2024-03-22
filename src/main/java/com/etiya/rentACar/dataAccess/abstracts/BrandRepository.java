package com.etiya.rentACar.dataAccess.abstracts;

import com.etiya.rentACar.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand,Integer> {
}

