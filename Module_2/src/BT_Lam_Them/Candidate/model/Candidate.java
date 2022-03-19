package BT_Lam_Them.Candidate.model;

public class Candidate {
    private int id;
    private String name;
    private String dateOfBirth;
    private double pointEnglish,pointMath,pointLiterature;

    public Candidate(int id, String name, String dateOfBirth, double pointEnglish,double pointMath,double pointLiterature) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.pointEnglish = pointEnglish;
        this.pointMath = pointMath;
        this.pointLiterature = pointLiterature;
    }

    public Candidate() {
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getPointEnglish() {
        return this.pointEnglish;
    }

    public void setPointEnglish(int pointEnglish) {
        this.pointEnglish = pointEnglish;
    }
    public double getPointMath() {
        return this.pointMath;
    }

    public void setPointMath(int pointMath) {
        this.pointMath = pointMath;
    }
    public double getPointLiterature() {
        return this.pointLiterature;
    }

    public void setPointLiterature(int pointLiterature) {
        this.pointLiterature = pointLiterature;
    }
    public double getPoint15(){
        return this.pointEnglish + this.pointMath + this.pointLiterature;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", pointEnglish=" + pointEnglish +
                ", pointMath=" + pointMath +
                ", pointLiterature=" + pointLiterature +
                ",total point: " + this.getPoint15() +
                '}';
    }
}
