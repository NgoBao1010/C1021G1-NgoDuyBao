package Case_Study.Service.Impl;

import Case_Study.Model.Person.Employee;
import Case_Study.Service.IPersonService;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EmployeeServiceImpl implements IPersonService {
    public static final String FILE_EMPLOYEE = "D:\\CodeGym\\bootcamp\\Module_2\\src\\Case_Study\\Data\\EmployeeProfile.csv";
    public static List<Employee> employees = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public EmployeeServiceImpl(){
        employees = read();
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
        Employee employee1 = new Employee("FRM-" + randomCode() + randomChar(),"Bảo","10/10/1995","Male","201705898","0979642710","ngoduybao1010@gmail.com","Cao Đẳng","Giám Đốc",2000);
        Employee employee2 = new Employee("FRM-" + randomCode() + randomChar(),"Hiếu","10/10/1997","Male","201705898","0979642710","ngoduybao1010@gmail.com","Cao Đẳng","Giám Đốc",2000);
        employees.add(employee1);
        employees.add(employee2);
    }

    public Employee creatEmployee() {
        String EMAIL_REGEX = "[2-zA-Z][a-zA-Z0-9]+@gmail.com";
        String inputEmail;
        String PHONENUMBER_REGEX = "0[397][0378][0-9]{7}";
        String inputNumberPhone;
        String regexDate= "[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}";
        String inputDate;
        String inputSex;
        String IDCARD_REGEX = "2[0-9]{8}";
        String inputIDCARD;
        String inputQuatification;

        boolean check;
        double inputSalary = 0;

        System.out.println("Input NAME: ");
        String inputName = scanner.nextLine();

        do {
            check = false;
            System.out.println("Input DATE (MM/DD/YY): ");
            inputDate = scanner.nextLine();

            if(!inputDate.matches(regexDate)) {
                check = true;
                System.out.println("ERROR FORMAT DATE NUMBER: ");
                continue;
            }
            String[] temp = inputDate.split("/");
            if(Integer.parseInt(temp[0]) < 0 || Integer.parseInt(temp[0]) > 12){
                check = true;
                continue;
            }
            if(Integer.parseInt(temp[0]) == 1 || Integer.parseInt(temp[0]) == 3 || Integer.parseInt(temp[0]) == 5 || Integer.parseInt(temp[0]) == 7 ||
                    Integer.parseInt(temp[0]) == 8 || Integer.parseInt(temp[0]) == 10 || Integer.parseInt(temp[0]) == 12 ){
                if(Integer.parseInt(temp[1]) < 0 || Integer.parseInt(temp[1]) > 31) {
                    check = true;
                    continue;
                }
            }else if(Integer.parseInt(temp[0]) == 2){
                if ((Integer.parseInt(temp[2]) % 4 == 0 && Integer.parseInt(temp[2]) % 100 != 0) || Integer.parseInt(temp[2]) % 400 == 0){
                    if(Integer.parseInt(temp[1]) < 0 || Integer.parseInt(temp[1]) > 29) {
                        check = true;
                        continue;
                    }
                }else {
                    if(Integer.parseInt(temp[1]) < 0 || Integer.parseInt(temp[1]) > 28) {
                        check = true;
                        continue;
                    }
                }

            }else if (Integer.parseInt(temp[0]) > 0 || Integer.parseInt(temp[0]) < 13){
                if(Integer.parseInt(temp[1]) < 0 || Integer.parseInt(temp[1]) > 30) {
                    check = true;
                    continue;
                }
            }else {
                check = true;
            }

        }while (check);

        do {
            check = true;
            System.out.println("Input GENDER: ");
            inputSex = scanner.nextLine();
            if(inputSex.toLowerCase().equals("male") || inputSex.toLowerCase().equals("female")){
                break;
            }
        }while (check);

        do {
            check = false;
            System.out.println("Input INDETITY CARD NUMBER: ");
            inputIDCARD = scanner.nextLine();
            if(!inputIDCARD.matches(IDCARD_REGEX)){
                check = true;
                System.out.println("ERROR FORMAT CARD NUMBER: ");
                continue;
            }

        }while (check);


        do {check = false;
            System.out.println("Input NUMBER PHONE: ");
            inputNumberPhone = scanner.nextLine();
            if(!inputNumberPhone.matches(PHONENUMBER_REGEX)) {
                check = true;
                System.out.println("ERROR FORMAT PHONE NUMBER: ");
                continue;
            }
        }while (check);

        do {
            check = false;
            System.out.println("Input EMAIL: ");
            inputEmail = scanner.nextLine();
            if(!inputEmail.matches(EMAIL_REGEX)){
                check = true;
                System.out.println("ERROR FORMAT NUMBER: ");
                continue;
            }
        }while (check);

        do {
            check = true;
            System.out.println("Input QUATIFICATION: ");
            inputQuatification = scanner.nextLine();
            if(inputQuatification.toLowerCase().equals("đại học") || inputQuatification.toLowerCase().equals("cao đẳng") ||
                    inputQuatification.toLowerCase().equals("trung cấp") || inputQuatification.toLowerCase().equals("sau đại học")){
                break;
            }
        }while (check);

        System.out.println("Input POSITION: ");
        String inputPosition = scanner.nextLine();
        System.out.println("Input SALARY: ");
        do {
            check = false;
            try {
                inputSalary = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input SALARY AGAIN: ");
                check = true;
            }
        }while (check);
        Employee employee = new Employee("FRM-" + randomCode() + randomChar(), inputName, inputDate, inputSex, inputIDCARD, inputNumberPhone, inputEmail, inputQuatification, inputPosition, inputSalary);
        return employee;
    }
    @Override
    public void addNew() {
        employees.add(creatEmployee());
        write();
    }

    @Override
    public void display() {
        for (Employee employee: employees){
            System.out.println(employee);
        }
    }

    @Override
    public void edit() {
        System.out.print("Input ID you want to edit: ");
        String editID = scanner.nextLine();
        Employee employeeTemp;
        boolean check = false;
        for (int i = 0; i < employees.size();i++){
            if (employees.get(i).getId().equals(editID)){
                String id = employees.get(i).getId();
                employeeTemp = creatEmployee();
                employeeTemp.setId(id);
                employees.set(i,employeeTemp);
                check = true;
                write();
                break;
            }
        }
        if (!check){
            System.out.println("Can not found this id,please try again!");
        }
    }
    public void write(){
        File file = new File(FILE_EMPLOYEE);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileWriter fileWriter = new FileWriter(FILE_EMPLOYEE);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee : employees){
                bufferedWriter.write(employee.getId() + "," + employee.getFullName() + "," + employee.getDayOfBirth() + "," + employee.getSex() +
                        "," + employee.getIdentityCardNo() + "," + employee.getPhoneNo() + "," +employee.getEmail() + "," + employee.getEducation() + "," + employee.getPoisition() + "," + employee.getSalary());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Employee> read(){
        List<Employee> employeeList = new ArrayList<>();
        File file = new File(FILE_EMPLOYEE);
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data = null;
            while ((data = bufferedReader.readLine()) != null){
                String[] arrData = data.split(",");
                Employee employee = new Employee(arrData[0],arrData[1],arrData[2],arrData[3],arrData[4],arrData[5],arrData[6],arrData[7],
                        arrData[8],Double.parseDouble(arrData[9]));
                employeeList.add(employee);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
}
