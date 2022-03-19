package BT_Lam_Them.Student.Service.impl;

import BT_Lam_Them.Candidate.model.Candidate;
import BT_Lam_Them.Student.Model.Student;
import BT_Lam_Them.Student.Service.StudentService;

public class StudentServiceImpl implements StudentService {
    private static Student[] studentList = new Student[5];
    static {
      studentList[0] = new Student(1,"Bảo","Male","JavaFullstack","C1021G1");
      studentList[1] = new Student(3, "Linh", "Male","JavaFullstack" , "C1021G1");
      studentList[2] = new Student(5, "Đạt", "Male","JavaFullstack" , "C0721G1");
      studentList[3] = new Student(2, "Thựn", "Female","JavaFullstack" , "C1021G1");
      studentList[4] = new Student(4, "Khoa", "Male","JavaFullstack" , "C0921G1");
    }
    @Override
    public void add(Student student) {
        Student[] newList = new Student[studentList.length + 1];
        newList[newList.length-1] = student;

        for (int i = 0;i < studentList.length;i++){
            newList[i] = studentList[i];
        }
        studentList = newList;
    }

    @Override
    public void remove(int id) {
        for (int i = 0;i < studentList.length;i++){
            if (studentList[i].getId() == id ){
                studentList[i] = null;
            }
        }
    }

    @Override
    public void removeInd(int index) {
            for (int i = 0;i < studentList.length;i++){
                if (i == index ){
                    studentList[i] = null;
                }
            }

    }


    public boolean checkNum(String id) {
        for (int j = 0; j < id.length(); j++) {
            if (Character.isLetter(id.charAt(j))){
                return true;
            }
        }
        return false;
    }
    @Override
    public void search(String id) {
        for (int i = 0; i < studentList.length; i++){
                if(checkNum(id) == true){
                    if(studentList[i].getName().equals(id)) {
                        System.out.println(studentList[i]);
                    }
                }else if(studentList[i].getId() == Integer.parseInt(id)) {
                    System.out.println(studentList[i]);
                }
            }
        }

    @Override
    public Student[] print() {
        return studentList;
    }
}
