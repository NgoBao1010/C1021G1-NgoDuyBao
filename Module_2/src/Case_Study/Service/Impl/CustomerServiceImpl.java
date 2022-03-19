package Case_Study.Service.Impl;

import Case_Study.Model.Person.Customer;
import Case_Study.Service.IPersonService;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CustomerServiceImpl implements IPersonService {
    public static final String CUSTOMER_PROFILE = "D:\\CodeGym\\bootcamp\\Module_2\\src\\Case_Study\\Data\\CustomerProfile.csv";
    public static List<Customer> customers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public CustomerServiceImpl(){
        customers = read();
    }
    public static int random(){
//        int num = 0;
//        Random rd = new Random();
//        num = rd.nextInt(25) + 65;
//        return num;
        int code = (int) Math.floor(((Math.random() * 25) + 65));
        return code;
    }
    public static String randomChar(){
        String result = "";
        for (int i = 0; i < 2;i++){
            int num = random();
            result += (char) num;
        }
        return result;
    }
    public static String randomCode(){
        String result = "";
        for (int i = 0; i < 2;i++){
            int num = random();
            result += num;
        }
        return result;
    }
    static {
        Customer customer1 = new Customer("CTM-" + randomCode() + randomChar(),"Bảo", "10/10/1995", "male", "206216875","0935654789","Ngoduybao@gmail.com", "diamond", "danang");
        Customer customer2 = new Customer("CTM-" + randomCode() + randomChar(),"Linh", "01/07/1992", "male", "206216875","0935654789","Đanguylinh@gmail.com", "platinum", "quangnam");
        Customer customer3 = new Customer("CTM-" + randomCode() + randomChar(),"Hoàng", "10/10/1996", "male", "20527875","0777123654","Nguyenanhhoang@gmail.com", "member", "hanoi");
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
    }

    public Customer creatCustomer() {
        String regexEmail = "[2-zA-Z][a-zA-Z0-9]+@gmail.com";
        String inputEmail;
        String regexPhone = "0[397][0378][0-9]{7}";
        String inputNumberPhone;
        String regexDate = "[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}";
        String inputDate;
        String inputGender;
        String regexCardNumber = "2[0-9]{8}";
        String inputIndetityCardNumber;
        String inputCustomerType;
        String inputAddress;
        boolean check;

        System.out.println("Input NAME: ");
        String inputName = scanner.nextLine();

        do {
            check = false;
            System.out.println("Input DATE (MM/DD/YY): ");
            inputDate = scanner.nextLine();

            if (!inputDate.matches(regexDate)) {
                check = true;
                System.out.println("ERROR FORMAT DATE NUMBER: ");
                continue;
            }
            String[] temp = inputDate.split("/");
            if (Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 12) {
                check = true;
                System.out.println("ERROR FORMAT DATE: ");
                continue;
            }
            if (Integer.parseInt(temp[0]) == 1 || Integer.parseInt(temp[0]) == 3 || Integer.parseInt(temp[0]) == 5 || Integer.parseInt(temp[0]) == 7 ||
                    Integer.parseInt(temp[0]) == 8 || Integer.parseInt(temp[0]) == 10 || Integer.parseInt(temp[0]) == 12) {
                if (Integer.parseInt(temp[1]) < 0 || Integer.parseInt(temp[1]) > 31) {
                    check = true;
                    System.out.println("ERROR FORMAT DATE: ");
                    continue;
                }
            } else if (Integer.parseInt(temp[0]) == 2) {
                if ((Integer.parseInt(temp[2]) % 4 == 0 && Integer.parseInt(temp[2]) % 100 != 0) || Integer.parseInt(temp[2]) % 400 == 0) {
                    if (Integer.parseInt(temp[1]) < 0 || Integer.parseInt(temp[1]) > 29) {
                        check = true;
                        System.out.println("ERROR FORMAT DATE: ");
                        continue;
                    }
                } else {
                    if (Integer.parseInt(temp[1]) < 0 || Integer.parseInt(temp[1]) > 28) {
                        check = true;
                        System.out.println("ERROR FORMAT DATE: ");
                        continue;
                    }
                }

            } else if (Integer.parseInt(temp[0]) > 0 || Integer.parseInt(temp[0]) < 13) {
                if (Integer.parseInt(temp[1]) < 0 || Integer.parseInt(temp[1]) > 30) {
                    check = true;
                    continue;
                }
            } else {
                check = true;
            }

        } while (check);

        do {
            check = true;
            System.out.println("Input GENDER: ");
            inputGender = scanner.nextLine();
            if (inputGender.toLowerCase().equals("male") || inputGender.toLowerCase().equals("female")) {
                break;
            }
        } while (check);

        do {
            check = false;
            System.out.println("Input INDETITY CARD NUMBER: ");
            inputIndetityCardNumber = scanner.nextLine();
            if (!inputIndetityCardNumber.matches(regexCardNumber)) {
                check = true;
                System.out.println("ERROR FORMAT CARD NUMBER: ");
                continue;
            }

        } while (check);


        do {
            check = false;
            System.out.println("Input NUMBER PHONE: ");
            inputNumberPhone = scanner.nextLine();
            if (!inputNumberPhone.matches(regexPhone)) {
                check = true;
                System.out.println("ERROR FORMAT PHONE NUMBER: ");
                continue;
            }
        } while (check);

        do {
            check = false;
            System.out.println("Input EMAIL: ");
            inputEmail = scanner.nextLine();
            if (!inputEmail.matches(regexEmail)) {
                check = true;
                System.out.println("ERROR FORMAT EMAIL: ");
                continue;
            }
        } while (check);

        do {
            check = true;
            System.out.println("Input CUMTOMER TYPE: ");
            inputCustomerType = scanner.nextLine();
            if (inputCustomerType.toLowerCase().equals("diamond") || inputCustomerType.toLowerCase().equals("platinium") ||
                    inputCustomerType.toLowerCase().equals("gold") || inputCustomerType.toLowerCase().equals("silver")) {
                break;
            }
        } while (check);

        System.out.println("Input ADDRESS: ");
        inputAddress = scanner.nextLine();

        Customer customer = new Customer("CTM-" + randomCode() + randomChar(), inputName, inputDate, inputGender,
                inputIndetityCardNumber, inputNumberPhone, inputEmail, inputCustomerType, inputAddress);
        return customer;
    }
    public void write(){
        File file = new File(CUSTOMER_PROFILE);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer : customers){
                bufferedWriter.write(customer.getId() + "," + customer.getFullName()+ "," + customer.getDayOfBirth() + "," + customer.getSex() +
                        "," + customer.getIdentityCardNo() + "," + customer.getPhoneNo() + "," + customer.getEmail()+ "," + customer.getCustomerType() +
                        "," + customer.getAddress());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static List<Customer> read(){
        List<Customer> customerList = new ArrayList<>();
        File file = new File(CUSTOMER_PROFILE);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data = null;
            while ((data = bufferedReader.readLine()) != null){
                String[] arrData = data.split(",");
                Customer customer = new Customer(arrData[0],arrData[1],arrData[2],arrData[3],arrData[4],arrData[5],arrData[6],arrData[7],
                        arrData[8]);
                customerList.add(customer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public void addNew() {
        customers.add(creatCustomer());
        write();
    }

    @Override
    public void display() {
        for (Customer customer: customers){
            System.out.println(customer);
        }
    }

    @Override
    public void edit() {
        System.out.print("Input ID you want to edit: ");
        String editID = scanner.nextLine();
        Customer customerTemp;
        boolean check = false;
        for (int i = 0; i < customers.size();i++){
            if (customers.get(i).getId().toLowerCase().equals(editID)){
                String id = customers.get(i).getId();
                customerTemp = creatCustomer();
                customerTemp.setId(id);
                customers.set(i,customerTemp);
                check = true;
                write();
                break;
            }
        }
        if (!check){
            System.out.println("Can not found this id,please try again!");
        }

    }
}
