package De_C09.Model;

public abstract class Mobile {
    private int idMobile;
    private static int autoId = 0;
    private String mobileName;
    private int price;
    private int quantily;
    private String brand;

    public Mobile(String mobileName, int price, int quantily, String brand) {
        autoId++;
        this.idMobile = autoId;
        this.mobileName = mobileName;
        this.price = price;
        this.quantily = quantily;
        this.brand = brand;
    }

    public Mobile() {
    }



    public int getIdMobile() {
        return idMobile;
    }

    public void setIdMobile(int idMobile) {
        this.idMobile = idMobile;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantily() {
        return quantily;
    }

    public void setQuantily(int quantily) {
        this.quantily = quantily;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "idMobile=" + idMobile +
                ", mobileName='" + mobileName + '\'' +
                ", price=" + price +
                ", quantily=" + quantily +
                ", brand='" + brand + '\'' ;
    }
}
