package APJ_EXAM_C1021G1_NgoDuyBao.Controller;

import APJ_EXAM_C1021G1_NgoDuyBao.service.Impl.ProductServiceImpl;


import java.util.Scanner;

public class BusinessController {
    static Scanner scanner;
    static int choice;

    static void add(){
        ProductServiceImpl productService = new ProductServiceImpl();
        scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Bạn muốn thêm sản phẩm nào");
        do{

            System.out.println("1. Thêm sản phẩm nhập khẩu");
            System.out.println("2. Thêm sản phẩm xuất khẩu");
            try{
                choice = Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.out.println("Vui lòng nhập một số");
                continue;
            }

            switch (choice){
                case 1:
                    productService.addNew(choice);
                    break;
                case 2:
                    productService.addNew(choice);
                    break;
                default:
                    System.out.println("vui lòng chọn số từ 1 đến 2");
                    continue;
            }
            break;
        }while(true);
    }
    static void search() {
        ProductServiceImpl productService = new ProductServiceImpl();
        productService.search();
    }

    static void display(){
        ProductServiceImpl productService = new ProductServiceImpl();
        productService.display();
    }
    static void delete() {
        ProductServiceImpl productService = new ProductServiceImpl();
        int choice = 0;
        scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Bạn muốn xóa sản phẩm nào");
        do{
            System.out.println();
            System.out.println("1. Xoá sản phẩm nhập khẩu");
            System.out.println("2. Xoá sản phẩm xuất khẩu");
            try{
                choice = Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.out.println("Vui lòng nhập một số");
                continue;
            }

            switch (choice){
                case 1:
                    productService.delete();
                    break;
                case 2:
                    productService.delete();
                    break;
                default:
                    System.out.println("vui lòng chọn số từ 1 đến 2");
                    continue;
            }
            break;
        }while(true);
    }
}
