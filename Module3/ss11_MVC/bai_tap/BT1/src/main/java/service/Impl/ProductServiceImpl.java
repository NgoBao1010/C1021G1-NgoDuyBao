package service.Impl;

import model.Product;
import service.IProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements IProductService {
    private static Map<Integer,Product> productMap = new HashMap<>();
    static {
        productMap.put(1,new Product("Mercedes C300 AMG",100.000,"Mạnh mẽ, kiểu dáng thể thao","Germany"));
        productMap.put(2,new Product("Mercedes C250 AMG",80.000,"Kiểu dáng nữ tính, bo tròn mông","Germany"));
        productMap.put(3,new Product("Mercedes C180 AMG",50.000,"Kiểu dáng thanh mảnh","Germany"));
        productMap.put(4,new Product("Mercedes G63",500.000,"Hùng hổ, mạnh mẽ, nam tính","Germany"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
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

}
