package APJ_EXAM_C1021G1_NgoDuyBao.model;

public class NhapKhau extends SanPham{
    private double giaNhap;
    private String tinhThanhNhap;
    private double thueNhapKhau;

    public NhapKhau() {
    }

    public NhapKhau(String maSanPham, String tenSanPham, double giaBan, int soLuong, String nhaSanXuat, double giaNhap, String tinhThanhNhap, double thueNhapKhau) {
        super(maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaNhap = giaNhap;
        this.tinhThanhNhap = tinhThanhNhap;
        this.thueNhapKhau = thueNhapKhau;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public String getTinhThanhNhap() {
        return tinhThanhNhap;
    }

    public void setTinhThanhNhap(String tinhThanhNhap) {
        this.tinhThanhNhap = tinhThanhNhap;
    }

    public double getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(double thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    @Override
    public String toString() {
        return "NhapKhau{" + super.toString() +
                ", giaNhap=" + giaNhap +
                ", tinhThanhNhap='" + tinhThanhNhap + '\'' +
                ", thueNhapKhau=" + thueNhapKhau +
                '}';
    }
}
