package model.employee;

public class Employee {
    private int idEmployee;
    private String nameEmployee;
    private String birthday;
    private String idCardEmployee;
    private double salary;
    private String phoneEmployee;
    private String emailEmployee;
    private String addressEmployee;
    private int idPosition;
    private String namePosition;
    private int idEducation;
    private String nameEducation;
    private int idDivision;
    private String nameDivision;
    private String username;

    public Employee() {
    }

    public Employee(String nameEmployee, String birthday, String idCardEmployee, double salary, String phoneEmployee, String emailEmployee, String addressEmployee, int idPosition, int idEducation, int idDivision) {
        this.nameEmployee = nameEmployee;
        this.birthday = birthday;
        this.idCardEmployee = idCardEmployee;
        this.salary = salary;
        this.phoneEmployee = phoneEmployee;
        this.emailEmployee = emailEmployee;
        this.addressEmployee = addressEmployee;
        this.idPosition = idPosition;
        this.idEducation = idEducation;
        this.idDivision = idDivision;
    }

    public Employee(int idEmployee, String nameEmployee, String birthday, String idCardEmployee, double salary, String phoneEmployee, String emailEmployee, String addressEmployee, int idPosition, int idEducation, int idDivision) {
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.birthday = birthday;
        this.idCardEmployee = idCardEmployee;
        this.salary = salary;
        this.phoneEmployee = phoneEmployee;
        this.emailEmployee = emailEmployee;
        this.addressEmployee = addressEmployee;
        this.idPosition = idPosition;
        this.idEducation = idEducation;
        this.idDivision = idDivision;
    }

    public Employee(int idEmployee, String nameEmployee, String birthday, String idCardEmployee, double salary, String phoneEmployee, String emailEmployee, String addressEmployee, int idPosition, String namePosition, int idEducation, String nameEducation, int idDivision, String nameDivision) {
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.birthday = birthday;
        this.idCardEmployee = idCardEmployee;
        this.salary = salary;
        this.phoneEmployee = phoneEmployee;
        this.emailEmployee = emailEmployee;
        this.addressEmployee = addressEmployee;
        this.idPosition = idPosition;
        this.namePosition = namePosition;
        this.idEducation = idEducation;
        this.nameEducation = nameEducation;
        this.idDivision = idDivision;
        this.nameDivision = nameDivision;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdCardEmployee() {
        return idCardEmployee;
    }

    public void setIdCardEmployee(String idCardEmployee) {
        this.idCardEmployee = idCardEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhoneEmployee() {
        return phoneEmployee;
    }

    public void setPhoneEmployee(String phoneEmployee) {
        this.phoneEmployee = phoneEmployee;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

    public int getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(int idPosition) {
        this.idPosition = idPosition;
    }

    public String getNamePosition() {
        return namePosition;
    }

    public void setNamePosition(String namePosition) {
        this.namePosition = namePosition;
    }

    public int getIdEducation() {
        return idEducation;
    }

    public void setIdEducation(int idEducation) {
        this.idEducation = idEducation;
    }

    public String getNameEducation() {
        return nameEducation;
    }

    public void setNameEducation(String nameEducation) {
        this.nameEducation = nameEducation;
    }

    public int getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(int idDivision) {
        this.idDivision = idDivision;
    }

    public String getNameDivision() {
        return nameDivision;
    }

    public void setNameDivision(String nameDivision) {
        this.nameDivision = nameDivision;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
