package ss12_Java_Collection_Framework.Bai_tap.Product.Controller;

import ss12_Java_Collection_Framework.Bai_tap.Product.Service.IProductService;
import ss12_Java_Collection_Framework.Bai_tap.Product.Service.impl.ProductService;

import java.util.Collections;
import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        IProductService product = new ProductService();
        Scanner inp = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("--Product Menu--");
            System.out.println("1. List all");
            System.out.println("2. Add new product");
            System.out.println("3. Remove product");
            System.out.println("4. Update product");
            System.out.println("5. Search product");
            System.out.println("6. Up Price product");
            System.out.println("7. Down Price product");
            System.out.println("9. Exit");
            System.out.print("Input select:");
            select = Integer.parseInt(inp.nextLine());

            switch (select){
                case 1:
                    product.printAll();
                    break;
                case 2:
                    product.add();
                    break;
                case 3:
                    product.removeProductID();
                    break;
                case 4:
                    product.updateProductId();
                    break;
                case 5:
                    product.searchName();
                    break;
                case 6:
                    product.UpPrice();
                    break;
                case 7:
                    product.DownPrice();
                    break;
                case 9:
                    System.out.print("Thank you for use we product");
                    break;
                default:
                    System.out.print("Err------");
            }
        }while (select != 9);
    }
}
