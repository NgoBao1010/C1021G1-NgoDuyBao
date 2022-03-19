package BT_Lam_Them.Cadres.Controller;

import BT_Lam_Them.Cadres.Model.Cadres;
import BT_Lam_Them.Cadres.Service.ICadresService;
import BT_Lam_Them.Cadres.Service.impl.CadresService;


import java.util.Scanner;

public class CadresController {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ICadresService cadresService = new CadresService();
        Cadres[] cadresList = null;
        int select;
        do {
            System.out.println("--Cadres Menu--");
            System.out.println("1. Print List all");
            System.out.println("2. Add new");
            System.out.println("3. Count cadres female");
            System.out.println("4. Total salary");
            System.out.println("5. Technique list");
            System.out.println("9. Exit");
            System.out.print("Input select:");
            select = Integer.parseInt(inp.nextLine());

            switch (select){
                case 1:
                    cadresService.print();
                    break;
                case 2:
                    cadresService.addList();
                    break;
                case 3:
                    cadresService.countFemale();
                    break;
                case 4:
                    cadresService.totalSalary();
                    break;
                case 5:
                    cadresService.itList();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Err!!!--------");

            }
        }while (select != 9);
    }
}
