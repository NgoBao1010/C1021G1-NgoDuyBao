package Case_Study.Model.FacilityFurama;

import java.util.Objects;

public class HouseType extends Facility{
    private String roomStandard;
    private  int quantityOfFloor;

    public HouseType() {
    }

    public HouseType(String idService,String serviceName, double areaUsable, int rent, int maxPeople, String rentType, String roomStandard, int quantityOfFloor) {
        super(idService,serviceName, areaUsable, rent, maxPeople, rentType);
        this.roomStandard = roomStandard;
        this.quantityOfFloor = quantityOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getQuantityOfFloor() {
        return quantityOfFloor;
    }

    public void setQuantityOfFloor(int quantityOfFloor) {
        this.quantityOfFloor = quantityOfFloor;
    }

    @Override
    public String toString() {
        return "House {" +
                super.toString()+
                " ,roomStandard :" + roomStandard +
                ", quantityOfFloor :" + quantityOfFloor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HouseType houseType = (HouseType) o;
        return Objects.equals(this.getRoomStandard(), houseType.roomStandard) && Objects.equals(this.getServiceName(), houseType.getServiceName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getRoomStandard(),this.getServiceName());
    }
}
