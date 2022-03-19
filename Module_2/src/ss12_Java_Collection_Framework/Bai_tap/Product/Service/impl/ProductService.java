package ss12_Java_Collection_Framework.Bai_tap.Product.Service.impl;

import ss12_Java_Collection_Framework.Bai_tap.Product.Model.Product;
import ss12_Java_Collection_Framework.Bai_tap.Product.Service.IProductService;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private List<Product> productList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.print("Nhập id sản phẩm: ");
        int idProduct = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sản phẩm: ");
        String nameProduct = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        double priceProduct = Double.parseDouble(scanner.nextLine());

        Product product = new Product(idProduct,nameProduct,priceProduct);
        productList.add(product);
    }

    @Override
    public void updateProductId() {
        System.out.print("Nhập id muốn sửa sản phẩm: ");
        int idUpdate = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size();i++){
            if(productList.get(i).getId() == idUpdate){
                System.out.print("Nhập sản phẩm muốn sửa: ");
                String updateNameProduct = scanner.nextLine();
                System.out.print("Nhập giá phẩm muốn sửa: ");
                double updatePriceProduct = Double.parseDouble(scanner.nextLine());
                productList.get(i).setNameProduct(updateNameProduct);
                productList.get(i).setPrice(updatePriceProduct);
            }
        }
        printAll();
    }

    @Override
    public void removeProductID() {
        System.out.print("Nhập id muốn xóa sản phẩm: ");
        int idRemove = Integer.parseInt(scanner.nextLine());
        for (int i = 0;i < productList.size();i++){
            if (productList.get(i).getId() == idRemove){
                productList.remove(productList.get(i));
                printAll();
            }else {
                System.out.println("Không có sản phẩm cần xóa");
            }
        }

    }

    @Override
    public void searchName() {
        System.out.print("Nhập tên sản phẩm muốn tìm: ");
        String nameSearch = scanner.nextLine();
        for (int i = 0;i < productList.size();i++){
            if (productList.get(i).getNameProduct().contains(nameSearch)){
                System.out.println(productList.get(i));
            }else {
                    System.out.println("Không có sản phẩm cần tìm.");
            }
        }
    }

    @Override
    public void printAll() {
        for (Product product:productList) {
            System.out.println(product);
        }
    }

    @Override
    public void UpPrice() {
        Collections.sort(productList);
        printAll();
    }

    @Override
    public void DownPrice() {
        Product product = new Product();
        Collections.sort(productList,product);
        printAll();
    }


}
