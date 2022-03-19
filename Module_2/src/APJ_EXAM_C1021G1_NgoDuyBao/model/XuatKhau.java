package APJ_EXAM_C1021G1_NgoDuyBao.model;

public class XuatKhau extends SanPham{
    private double giaXuatKhau;
    private String quocGiaNhap;

    public XuatKhau() {
    }

    public XuatKhau(String maSanPham, String tenSanPham, double giaBan, int soLuong, String nhaSanXuat, double giaXuatKhau, String quocGiaNhap) {
        super(maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhap = quocGiaNhap;
    }

    public double getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(double giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGiaNhap() {
        return quocGiaNhap;
    }

    public void setQuocGiaNhap(String quocGiaNhap) {
        this.quocGiaNhap = quocGiaNhap;
    }

    @Override
    public String toString() {
        return "XuatKhau{" + super.toString() +
                ", giaXuatKhau=" + giaXuatKhau +
                ", quocGiaNhap='" + quocGiaNhap + '\'' +
                '}';
    }
}
