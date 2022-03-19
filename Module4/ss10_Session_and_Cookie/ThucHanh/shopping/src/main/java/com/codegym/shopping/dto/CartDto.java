package com.codegym.shopping.dto;

import com.codegym.shopping.model.Product;

import java.util.HashMap;
import java.util.Map;

public class CartDto {
    private Map<Product,Integer> productMap = new HashMap<>();

    public CartDto() {
    }

    public CartDto(Map<Product, Integer> productMap) {
        this.productMap = productMap;
    }

    public Map<Product, Integer> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<Product, Integer> productMap) {
        this.productMap = productMap;
    }
    public void addProduct(Product product){
        if(productMap.containsKey(product)){
            Integer currentValue = productMap.get(product);
            productMap.put(product,currentValue + 1);
        }else {
            productMap.put(product,1);
        }
    }
    public void remove(Product product) {
        if (!checkItemInCart(product)) {
            productMap.put(product, 1);
        } else {
            Map.Entry<Product, Integer> itemEntry = selectItemInCart(product);
            if (itemEntry.getValue() > 1) {
                Integer newQuantity = itemEntry.getValue() - 1;
                productMap.put(itemEntry.getKey(), newQuantity);
            } else {
                productMap.remove(product);
            }
        }
    }
    private boolean checkItemInCart(Product productDto){
        for(Map.Entry<Product,Integer> entry: productMap.entrySet()){
            if (entry.getKey().getId().equals(productDto.getId())){
                return true;
            }
        }
        return false;
    }

    private Map.Entry<Product,Integer> selectItemInCart(Product productDto){
        for(Map.Entry<Product,Integer> entry: productMap.entrySet()){
            if (entry.getKey().getId().equals(productDto.getId())){
                return entry;
            }
        }
        return null;
    }
    public Integer countProductQuantity(){
        Integer productQuantity = 0;
        for (Map.Entry<Product,Integer> entry : productMap.entrySet()){
            productQuantity += entry.getValue();
        }
        return productQuantity;
    }

    public Integer countItemQuantity(){
        return productMap.size();
    }

    public Float countTotalPayment(){
        float payment = 0;
        for (Map.Entry<Product,Integer> entry : productMap.entrySet()){
            payment += entry.getKey().getPrice() * (float) entry.getValue();
        }
        return payment;
    }
}
