package BT_Lam_Them.Student.Model;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private String sex;
    private String className;
    private String course;

    public Student(int id, String name, String sex, String className, String course) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.className = className;
        this.course = course;
    }

    public Student() {
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", className='" + className + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return getId() - o.getId();
    }
}
