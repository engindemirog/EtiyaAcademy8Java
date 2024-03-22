package com.etiya.rentACar.business.concretes;

import com.etiya.rentACar.business.abstracts.BrandService;
import com.etiya.rentACar.business.dtos.requests.CreateBrandRequest;
import com.etiya.rentACar.business.dtos.responses.CreatedBrandResponse;
import com.etiya.rentACar.dataAccess.abstracts.BrandRepository;
import com.etiya.rentACar.entities.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@AllArgsConstructor
@Service
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;

    @Override
    public CreatedBrandResponse add(CreateBrandRequest createBrandRequest) {
        //todo : Business rules

        //mapping
        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());
        brand.setCreatedDate(LocalDateTime.now());

        Brand createdBrand =   this.brandRepository.save(brand);

        //mapping
        CreatedBrandResponse createdBrandResponse = new CreatedBrandResponse();
        createdBrandResponse.setId(createdBrand.getId());
        createdBrandResponse.setName(createdBrand.getName());
        createdBrandResponse.setCreatedDate(createdBrand.getCreatedDate());

        return createdBrandResponse;
    }
}
//Tüm entityler için