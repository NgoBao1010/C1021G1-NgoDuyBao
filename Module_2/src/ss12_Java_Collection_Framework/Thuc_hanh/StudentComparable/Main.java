package ss12_Java_Collection_Framework.Thuc_hanh.StudentComparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Bảo",27,"ĐN");
        Student student2 = new Student("Linh",29,"ĐN");
        Student student3 = new Student("Hiếu",24,"QN");
        Student student4 = new Student("Thuận",18,"QN");

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        Collections.sort(list);
        for (Student student: list){
            System.out.println(student);
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("So sánh theo tuổi: ");
        for (Student student : list){
            System.out.println(student);
        }
    }
}
