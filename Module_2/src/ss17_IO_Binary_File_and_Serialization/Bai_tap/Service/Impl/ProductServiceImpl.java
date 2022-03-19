package ss17_IO_Binary_File_and_Serialization.Bai_tap.Service.Impl;

import ss17_IO_Binary_File_and_Serialization.Bai_tap.Model.Product;
import ss17_IO_Binary_File_and_Serialization.Bai_tap.Service.IProductService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ProductServiceImpl implements IProductService {
    public static final String FILE_IP = "D:\\CodeGym\\bootcamp\\Module_2\\src\\ss17_IO_Binary_File_and_Serialization\\Bai_tap\\product.txt";
    private List<Product> list = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public int random(){
        int num = 0;
        Random rd = new Random();
        num = rd.nextInt(25) + 65;
        return num;
    }
    public String randomCode(){
        String result = "";
        for (int i = 0; i < 3;i++){
            int num = random();
            result += (char) num;
        }
        return result;
    }

    @Override
    public void add() {
        System.out.print("Nhập tên sản phẩm: ");
        String nameProduct = scanner.nextLine();
        System.out.print("Nhập nơi sản xuất: ");
        String whereProduction = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product("VN-" + randomCode(),nameProduct,whereProduction,price);
        list.add(product);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_IP);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void search() {
        System.out.print("Nhập tên sản phẩm muốn tìm: ");
        String nameSearch = scanner.nextLine();
        for (int i = 0;i < list.size();i++){
            if (list.get(i).getNameProduct().equals(nameSearch)){
                System.out.println(list.get(i));
            }else {
                System.out.println("Không có sản phẩm cần tìm.");
            }
        }
    }

    @Override
    public void print() {
        for (Product product : list) {
            System.out.println(product);
        }
    }

    @Override
    public void readFile() {
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(FILE_IP);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (Product product : productList){
            System.out.println(product);
        }
    }


}
