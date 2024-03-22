package com.etiya.rentACar.business.abstracts;

import com.etiya.rentACar.business.dtos.requests.CreateBrandRequest;
import com.etiya.rentACar.business.dtos.responses.CreatedBrandResponse;
import com.etiya.rentACar.entities.Brand;

public interface BrandService {
    CreatedBrandResponse add(CreateBrandRequest brand);
}
