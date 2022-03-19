package model.service;

public class Service {
    private int idService;
    private String nameService;
    private int areaService;
    private double costService;
    private int maxPeople;
    private String roomStandard;
    private String description;
    private double poolArea;
    private int numberOfFloors;
    private int idRentType;
    private String nameRentType;
    private double costRentType;
    private int idServiceType;
    private String nameServiceType;

    public Service() {
    }

    public Service(int idService, String nameService, int areaService, double costService, int maxPeople, String roomStandard, String description, double poolArea, int numberOfFloors, int idRentType, String nameRentType, double costRentType, int idServiceType, String nameServiceType) {
        this.idService = idService;
        this.nameService = nameService;
        this.areaService = areaService;
        this.costService = costService;
        this.maxPeople = maxPeople;
        this.roomStandard = roomStandard;
        this.description = description;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
        this.idRentType = idRentType;
        this.nameRentType = nameRentType;
        this.costRentType = costRentType;
        this.idServiceType = idServiceType;
        this.nameServiceType = nameServiceType;
    }

    public Service(String nameService, int areaService, double costService, int maxPeople, String roomStandard, String description, double poolArea, int numberOfFloors, int idRentType, int idServiceType) {
        this.nameService = nameService;
        this.areaService = areaService;
        this.costService = costService;
        this.maxPeople = maxPeople;
        this.roomStandard = roomStandard;
        this.description = description;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
        this.idRentType = idRentType;
        this.idServiceType = idServiceType;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getAreaService() {
        return areaService;
    }

    public void setAreaService(int areaService) {
        this.areaService = areaService;
    }

    public double getCostService() {
        return costService;
    }

    public void setCostService(double costService) {
        this.costService = costService;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
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

    public int getIdServiceType() {
        return idServiceType;
    }

    public void setIdServiceType(int idServiceType) {
        this.idServiceType = idServiceType;
    }

    public String getNameServiceType() {
        return nameServiceType;
    }

    public void setNameServiceType(String nameServiceType) {
        this.nameServiceType = nameServiceType;
    }
}
