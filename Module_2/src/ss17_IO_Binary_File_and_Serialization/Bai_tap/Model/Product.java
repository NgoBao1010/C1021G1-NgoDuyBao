package ss17_IO_Binary_File_and_Serialization.Bai_tap.Model;

import java.io.Serializable;

public class Product implements Serializable {
    private String codeProduct;
    private String nameProduct;
    private String whereProduction;
    private double price;

    public Product(String codeProduct, String nameProduct, String whereProduction, double price) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.whereProduction = whereProduction;
        this.price = price;
    }

    public Product() {
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getWhereProduction() {
        return whereProduction;
    }

    public void setWhereProduction(String whereProduction) {
        this.whereProduction = whereProduction;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "codeProduct='" + codeProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", whereProduction='" + whereProduction + '\'' +
                ", price=" + price +
                '}';
    }
}
