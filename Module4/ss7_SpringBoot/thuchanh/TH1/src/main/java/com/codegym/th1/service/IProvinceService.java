package com.codegym.th1.service;

import com.codegym.th1.model.Customer;
import com.codegym.th1.model.Province;

public interface IProvinceService extends IGeneralService<Province> {
    Iterable<Province> findAll();
}
