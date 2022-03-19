package ss10_DSA_List.Bai_tap;

public class MyListTest {
    public static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(1,"Bảo");
        Student student2 = new Student(2,"Ling");
        Student student3 = new Student(3,"Thựn");
        Student student4 = new Student(4,"Đợt");
        Student student5 = new Student(5,"Khoa");

        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newStudentList = new MyList<>();
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student4);


        for (int i = 0;i < studentMyList.size(); i++){
            System.out.println(studentMyList.get(i).getName());
            System.out.println(studentMyList.get(i).getId());
        }
//        studentMyList.add(2,student5);
//        System.out.println("-------------------------");
//        for (int i = 0;i < studentMyList.size(); i++){
//            System.out.println(studentMyList.get(i).getName());
//            System.out.println(studentMyList.get(i).getId());
//        }
        System.out.println("------------------------");
        System.out.println(studentMyList.size());

        System.out.println("------------------------");
        System.out.println(studentMyList.indexOf(student2));

        System.out.println("------------------------");
        System.out.println(studentMyList.contains(student1));
        System.out.println(studentMyList.contains(student5));

        System.out.println("------------------------");
        newStudentList = studentMyList.clone();
        for (int i = 0; i < newStudentList.size();i++){
            System.out.println(newStudentList.get(i).getName());
            System.out.println(newStudentList.get(i).getId());
        }

        System.out.println("------------------------");
        newStudentList.remove(0);
        for (int i = 0; i < newStudentList.size();i++){
            System.out.println(newStudentList.get(i).getName());
            System.out.println(newStudentList.get(i).getId());
        }

        studentMyList.clear();
        System.out.println("------------------------");
        for (int i = 0;i < studentMyList.size(); i++){
            System.out.println(studentMyList.get(i).getName());
            System.out.println(studentMyList.get(i).getId());
        }
    }
}
