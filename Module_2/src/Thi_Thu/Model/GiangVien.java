package Thi_Thu.Model;

public class GiangVien extends Person{
    private String chuyenMon;

    public GiangVien() {
    }

    public GiangVien(String id, String name, String dayOfBirth, String gender, String chuyenMon) {
        super(id, name, dayOfBirth, gender);
        this.chuyenMon = chuyenMon;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    @Override
    public String toString() {
        return "GiangVien{" + super.toString() +
                ", chuyenMon='" + chuyenMon + '\'' +
                '}';
    }
}
