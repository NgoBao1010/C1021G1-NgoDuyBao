package ss12_Java_Collection_Framework.Thuc_hanh.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Bảo",27,"ĐN");
        Student student2 = new Student("Linh",29,"ĐN");
        Student student3 = new Student("Thuận",18,"QN");
        Student student4 = new Student("Hiếu",24,"QN");

        Map<Integer,Student> studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student4);
        studentMap.put(5,student2);

        for (Map.Entry<Integer, Student> studen: studentMap.entrySet()){
            System.out.println(studen.toString());
        }

        System.out.println("...........Set");
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student2);

        for(Student student : students){
            System.out.println(student.toString());
        }
    }
}
