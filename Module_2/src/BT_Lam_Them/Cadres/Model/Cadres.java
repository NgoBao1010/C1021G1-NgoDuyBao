package BT_Lam_Them.Cadres.Model;

public class Cadres {
    private String code;
    private String fullName;
    private String sex;
    private String homeTown;
    private String dayOfBirth;
    private String tech;
    private String level;
    private double coefficSalary;
    private double allowance;

    public Cadres() {
    }

    public Cadres(String code, String fullName, String sex, String homeTown, String dayOfBirth, String tech, String level, double coefficSalary, double allowance) {
        this.code = code;
        this.fullName = fullName;
        this.sex = sex;
        this.homeTown = homeTown;
        this.dayOfBirth = dayOfBirth;
        this.tech = tech;
        this.level = level;
        this.coefficSalary = coefficSalary;
        this.allowance = allowance;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public double getCoefficSalary() {
        return coefficSalary;
    }

    public void setCoefficSalary(double coefficSalary) {
        this.coefficSalary = coefficSalary;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return "Cadres{" +
                "maCanBo='" + code + '\'' +
                ", hoVaTen='" + fullName + '\'' +
                ", gioiTinh='" + sex + '\'' +
                ", queQuan='" + homeTown + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", chuyenMon='" + tech + '\'' +
                ", trinhDo='" + level + '\'' +
                ", heSoLuong=" + coefficSalary +
                ", phuCap=" + allowance +
                '}';
    }
}
