package ss12_Java_Collection_Framework.Bai_tap.Product.Model;

import java.util.Comparator;

public class Product implements Comparable<Product>,Comparator<Product> {
    private int id;
    private String nameProduct;
    private double price;

    public Product() {
    }

    public Product(int id, String nameProduct, double price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if (this.price > o.getPrice()){
            return 1;
        }else if (this.price < o.getPrice()){
            return -1;
        }else {
            return 0;
        }
    }
    @Override
    public int compare(Product product1, Product product2) {
        if(product1.getPrice() > product2.getPrice()){
            return -1;
        }else if (product1.getPrice() < product2.getPrice()){
            return 1;
        }else {
            return 0;
        }
    }
}
