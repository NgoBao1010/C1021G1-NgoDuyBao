package De_C09.Model;

public class AuthMobile extends Mobile{
    private int thoiHanBaoHanh;
    private String phamViBaoHanh;

    public AuthMobile() {
    }

    public AuthMobile(String mobileName, int price, int quantily, String brand, int thoiHanBaoHanh, String phamViBaoHanh) {
        super(mobileName, price, quantily, brand);
        this.thoiHanBaoHanh = thoiHanBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public int getThoiHanBaoHanh() {
        return thoiHanBaoHanh;
    }

    public void setThoiHanBaoHanh(int thoiHanBaoHanh) {
        this.thoiHanBaoHanh = thoiHanBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return phamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        this.phamViBaoHanh = phamViBaoHanh;
    }

    @Override
    public String toString() {
        return "AuthMobile{" + super.toString() +
                ", thoiHanBaoHanh=" + thoiHanBaoHanh +
                ", phamViBaoHanh='" + phamViBaoHanh + '\'' +
                '}';
    }
}
