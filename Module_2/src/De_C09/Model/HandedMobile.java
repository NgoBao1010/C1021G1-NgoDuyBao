package De_C09.Model;

public class HandedMobile extends Mobile{
    private String quocGiaXachTay;
    private String Status;

    public HandedMobile() {
    }

    public HandedMobile(String mobileName, int price, int quantily, String brand, String quocGiaXachTay, String status) {
        super(mobileName, price, quantily, brand);
        this.quocGiaXachTay = quocGiaXachTay;
        Status = status;
    }

    public String getQuocGiaXachTay() {
        return quocGiaXachTay;
    }

    public void setQuocGiaXachTay(String quocGiaXachTay) {
        this.quocGiaXachTay = quocGiaXachTay;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "HandedMobile{" + super.toString() +
                ", quocGiaXachTay='" + quocGiaXachTay + '\'' +
                ", Status='" + Status + '\'' +
                '}';
    }
}
