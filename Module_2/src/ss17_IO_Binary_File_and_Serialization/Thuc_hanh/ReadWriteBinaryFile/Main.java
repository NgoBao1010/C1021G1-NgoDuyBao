package ss17_IO_Binary_File_and_Serialization.Thuc_hanh.ReadWriteBinaryFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String FILE_INPUT = "D:\\CodeGym\\bootcamp\\Module_2\\src\\ss17_IO_Binary_File_and_Serialization\\Thuc_hanh\\ReadWriteBinaryFile\\student.txt";

    public static void writeFile (String path, List<Student> students){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Student> readFile (String path){
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            students = (List<Student>) objectInputStream.readObject();
            objectInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"Bảo","ĐN"));
        studentList.add(new Student(2,"Hoàng","BĐ"));
        studentList.add(new Student(3,"Linh","ĐN"));
        studentList.add(new Student(4,"Hiếu","QN"));
        writeFile(FILE_INPUT,studentList);
        List<Student> readFileStudent = readFile(FILE_INPUT);
        for (Student student : readFileStudent){
            System.out.println(student);
        }
    }
}
