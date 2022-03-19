package com.codegym.service.impl;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductServiceImpl implements IProductService {
    private static Map<Integer,Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put(1, new Product( "Mercedes C300 AMG","250.000", "Kiểu dáng thể thao, mạnh mẽ", "Germany"));
        productMap.put(2, new Product( "Mercedes C250 AMG","200.000", "Kiểu dáng bo gọn, đẹp đẽ", "Germany"));
        productMap.put(3, new Product( "Mercedes C200 Excutive","180.000", "Kiểu dáng mạnh mẽ", "Germany"));
        productMap.put(4, new Product( "Mercedes C180 AMG","150.000", "Kiểu dáng dành cho gia đình nhỏ", "Germany"));
    }
    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>(productMap.values());
        return productList;
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
       return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id,product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }

    @Override
    public List<Product> searchByName(String nameProduct) {
        List<Product> productList = new ArrayList<>();
        for(Product product : productMap.values()){
            if (product.getProductName().contains(nameProduct)){
                productList.add(product);
            }
        }
        return productList;
    }
}
