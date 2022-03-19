package BT_Lam_Them.Student.Service;

import BT_Lam_Them.Student.Model.Student;

public interface StudentService {
    void add (Student student);
    void remove (int id);
    void removeInd (int index);
    void search (String id);
    Student[] print();

}
