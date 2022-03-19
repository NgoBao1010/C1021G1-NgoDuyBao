package com.codegym.th1.repository;

import com.codegym.th1.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IProvinceRepo extends PagingAndSortingRepository<Province,Long> {
}
