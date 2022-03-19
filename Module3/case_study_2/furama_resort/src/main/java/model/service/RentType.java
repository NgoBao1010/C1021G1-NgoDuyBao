package model.service;

public class RentType {
    private int idRentType;
    private String nameRentType;
    private double costRentType;

    public RentType(int idRentType, String nameRentType, double costRentType) {
        this.idRentType = idRentType;
        this.nameRentType = nameRentType;
        this.costRentType = costRentType;
    }

    public RentType() {
    }

    public int getIdRentType() {
        return idRentType;
    }

    public void setIdRentType(int idRentType) {
        this.idRentType = idRentType;
    }

    public String getNameRentType() {
        return nameRentType;
    }

    public void setNameRentType(String nameRentType) {
        this.nameRentType = nameRentType;
    }

    public double getCostRentType() {
        return costRentType;
    }

    public void setCostRentType(double costRentType) {
        this.costRentType = costRentType;
    }
}
