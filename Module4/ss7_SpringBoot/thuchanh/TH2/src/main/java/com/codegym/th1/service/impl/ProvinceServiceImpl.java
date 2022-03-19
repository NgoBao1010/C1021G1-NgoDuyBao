package com.codegym.th1.service.impl;

import com.codegym.th1.model.Province;
import com.codegym.th1.repository.IProvinceRepo;
import com.codegym.th1.service.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProvinceServiceImpl implements IProvinceService {

    @Autowired
    private IProvinceRepo provinceRepo;
    @Override
    public Optional<Province> findById(Long id) {
        return provinceRepo.findById(id);
    }

    @Override
    public void save(Province province) {
        provinceRepo.save(province);
    }

    @Override
    public void remove(Long id) {
        provinceRepo.deleteById(id);
    }

    @Override
    public Iterable<Province> findAll() {
        return provinceRepo.findAll();
    }
}
