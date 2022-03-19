package Case_Study.Controller;

import Case_Study.Service.IPersonService;
import Case_Study.Service.Impl.CustomerServiceImpl;
import Case_Study.Service.Impl.EmployeeServiceImpl;
import Case_Study.Service.Impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner= new Scanner(System.in);
    static int choice;
    static boolean checkChoice;
    static void displayMainMenu(){
        do{

            checkChoice = false;
            System.out.println("Furama resort management menu");
            System.out.println("1. Employee management");
            System.out.println("2. Customer management");
            System.out.println("3. Facility management");
            System.out.println("4. Booking management");
            System.out.println("5. Promotion management");
            System.out.println("6 Exit");
            System.out.print("Enter your selection: ");

            try{
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("look at the list carefully");
                checkChoice = true;
                continue;
            }

            switch (choice){
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagement();
                    break;
                case 5:
                    promotionManagement();
                    break;
                case 6:
                    System.exit(0);

                default:
                    System.out.println("look at the list carefully");
                    checkChoice = true;
                    continue;
            }
        }while(checkChoice);
    }

    static void employeeManagement(){
        IPersonService iPersonService = new EmployeeServiceImpl();

        do {
            checkChoice = false;
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employees");
            System.out.println("3. Edit employees");
            System.out.println("4. Return main menu");
            System.out.print("Enter your selection: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("look at the list carefully");
                checkChoice = true;
                continue;
            }
            switch (choice){
                case 1:
                    iPersonService.display();
                    checkChoice = true;
                    continue;
                case 2:
                    iPersonService.addNew();
                    checkChoice = true;
                    continue;
                case 3:
                    iPersonService.edit();
                    checkChoice = true;
                    continue;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("look at the list carefully");
                    checkChoice = true;
                    continue;
            }
        } while (checkChoice);

    }

    static void customerManagement() {
        IPersonService iPersonService = new CustomerServiceImpl();
        do {
            checkChoice = false;
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customers");
            System.out.println("3. Edit customers");
            System.out.println("4. Return main menu");
            System.out.print("Enter your selection: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("look at the list carefully");
                checkChoice = true;
                continue;
            }
            switch (choice) {
                case 1:
                    iPersonService.display();
                    checkChoice = true;
                    continue;
                case 2:
                    iPersonService.addNew();
                    checkChoice = true;
                    continue;
                case 3:
                    iPersonService.edit();
                    checkChoice = true;
                    continue;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("look at the list carefully");
                    checkChoice = true;
                    continue;
            }
        } while (checkChoice);
    }

    private static void displayFaci(FacilityServiceImpl iFacilityService) {
        do {
            checkChoice = false;
            System.out.println("1.Display villa..");
            System.out.println("2.Display house..");
            System.out.println("3.Display room...");
            System.out.println("4.Back to Menu....");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Input only number,please a smart consumer.");
                checkChoice = true;
                continue;
            }

            switch (choice){
                case 1:
                    iFacilityService.displayVilla();
                    break;
                case 2:
                    iFacilityService.displayHouse();
                    break;
                case 3:
                    iFacilityService.displayRoom();
                    break;
                case 4:
                    facilityManagement();
                    continue;
                default:
                    System.out.println("Error---------");
                    break;
            }
        }while (checkChoice);
    }

    private static void addNew(FacilityServiceImpl iFacilityService) {
        do {
            checkChoice = false;
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Room");
            System.out.println("4. Back to menu");
            System.out.print("Enter your selection: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Err-----");
                checkChoice = true;
                continue;
            }
            switch (choice){
                case 1:
                    iFacilityService.add(1);
                    checkChoice = true;
                    continue;
                case 2:
                    iFacilityService.add(2);
                    checkChoice = true;
                    continue;
                case 3:
                    iFacilityService.add(3);
                    checkChoice = true;
                    continue;
                case 4:
                    facilityManagement();
                    checkChoice = true;
                    continue;
                default:
                    System.out.println("Error---------");
                    checkChoice = true;
                    continue;
            }
        }while (checkChoice);
    }

    static void facilityManagement(){
        FacilityServiceImpl iFacilityService = new FacilityServiceImpl();
        do {
            checkChoice = false;
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            System.out.print("Enter your selection: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("look at the list carefully");
                checkChoice = true;
                continue;
            }
            switch (choice){
                case 1:
                    displayFaci(iFacilityService);
                    checkChoice = true;
                    continue;
                case 2:
                    addNew(iFacilityService);
                    checkChoice = true;
                    continue;
                case 3:
                    iFacilityService.listMaintenance();
                    checkChoice = true;
                    continue;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("look at the list carefully");
                    checkChoice = true;
                    continue;
            }
        } while (checkChoice);
    }

    static void bookingManagement(){
        do {
            checkChoice = false;
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contracts");
            System.out.println("4. Display list contract");
            System.out.println("5. Edit contract");
            System.out.println("6. Return main menu");
            System.out.print("Enter your selection: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("look at the list carefully");
                checkChoice = true;
                continue;
            }
            switch (choice){
                case 1:
                    //
                    checkChoice = true;
                    continue;
                case 2:
                    //
                    checkChoice = true;
                    continue;
                case 3:
                    //
                    checkChoice = true;
                    continue;
                case 4:
                    //
                    checkChoice = true;
                    continue;
                case 5:
                    //
                    checkChoice = true;
                    continue;
                case 6:
                    displayMainMenu();
                    break;

                default:
                    System.out.println("look at the list carefully");
                    checkChoice = true;
                    continue;
            }
        } while (checkChoice);

    }

    static void promotionManagement() {
        do {
            checkChoice = false;
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
            System.out.print("Enter your selection: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("look at the list carefully");
                checkChoice = true;
                continue;
            }
            switch (choice) {
                case 1:
                    //
                    checkChoice = true;
                    continue;
                case 2:
                    //
                    checkChoice = true;
                    continue;
                case 3:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("look at the list carefully");
                    checkChoice = true;
                    continue;
            }
        } while (checkChoice);
    }
    public static void main(String[] args) {
        displayMainMenu();
    }
}
