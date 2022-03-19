package ss17_IO_Binary_File_and_Serialization.Bai_tap.Controller;

import ss17_IO_Binary_File_and_Serialization.Bai_tap.Service.IProductService;
import ss17_IO_Binary_File_and_Serialization.Bai_tap.Service.Impl.ProductServiceImpl;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        IProductService productService = new ProductServiceImpl();
        Scanner input = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("--Product Menu--");
            System.out.println("1. List all");
            System.out.println("2. Add new product");
            System.out.println("3. Search product");
            System.out.println("4. Read product");
            System.out.println("9. Exit");
            System.out.print("Input select:");
            choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    productService.print();
                    break;
                case 2:
                    productService.add();
                    break;
                case 3:
                    productService.search();
                    break;
                case 4:
                    productService.readFile();
                    break;
                case 9:
                    System.out.print("Thank you for use we product");
                    break;
                default:
                    System.out.println("Vui lòng nhập lại");
            }
        }while (choice != 9);
    }


}
