package BT_Lam_Them.Student.Controller;

import BT_Lam_Them.Student.Model.Student;
import BT_Lam_Them.Student.Service.StudentService;
import BT_Lam_Them.Student.Service.impl.StudentServiceImpl;

import java.util.Arrays;
import java.util.Scanner;

public class StudentController {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentService studentService = new StudentServiceImpl();
        Student[] studentList = null;

        int select;
        do {
            System.out.println("--Student Menu--");
            System.out.println("1. Print List all");
            System.out.println("2. Add new");
            System.out.println("3. Delete");
            System.out.println("4. Delete Index");
            System.out.println("5. Search");
            System.out.println("6. Sort");
            System.out.println("9. Exit");

            System.out.print("Input Select:");
            select = Integer.parseInt(input.nextLine());

            switch (select){
                case 1:
                    studentList = studentService.print();
                    for (Student students : studentList) {
                        if (students == null){
                            continue;
                        }
                        System.out.println(students);
                    }
                    break;
                case 2:
                    System.out.print("Input Id: ");
                    int id = Integer.parseInt(input.nextLine());
                    System.out.print("Input Full Name: ");
                    String name = input.nextLine();
                    System.out.print("Input Sex: ");
                    String sex = input.nextLine();
                    System.out.print("Input className: ");
                    String className = input.nextLine();
                    System.out.print("Input Course: ");
                    String course = input.nextLine();
                    Student newList = new Student(id, name, sex, className, course);
                    studentService.add(newList);
                    break;
                case 3:
                    System.out.print("Input id you want delete:");
                    int idDel = Integer.parseInt(input.nextLine());
                    studentService.remove(idDel);
                    studentList = studentService.print();
                    for (Student students : studentList) {
                        if (students == null){
                            continue;
                        }
                        System.out.println(students);
                    }
                    break;
                case 4:
                    System.out.print("Input index you want delete:");
                    int indexDel = Integer.parseInt(input.nextLine());
                    studentService.removeInd(indexDel);
                    studentList = studentService.print();
                    for (Student students : studentList) {
                        if (students == null){
                            continue;
                        }
                        System.out.println(students);
                    }
                    break;
                case 5:
                    System.out.print("Input search: ");
                    String search = input.nextLine();
                    studentService.search(search);
                    break;
                case 6:
                    Arrays.sort(studentService.print());
                    studentList = studentService.print();
                    for (Student students : studentList) {
                        if (students == null){
                            continue;
                        }
                        System.out.println(students);
                    }
                    break;
                case 9:
                    break;
                default:
                    System.out.print("input err!");
            }
        }while (select != 9);
    }
}
