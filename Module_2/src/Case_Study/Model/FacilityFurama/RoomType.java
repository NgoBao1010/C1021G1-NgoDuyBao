package Case_Study.Model.FacilityFurama;

import java.util.Objects;

public class RoomType extends Facility{
    private String freeService;

    public RoomType(){}

    public RoomType(String idService, String serviceName, double areaUsable, int rent, int maxPeople, String rentType, String freeService) {
        super(idService,serviceName, areaUsable, rent, maxPeople, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room {" +
                super.toString()+
                ",freeService'" + freeService +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoomType roomType = (RoomType) o;
        return Objects.equals(this.getServiceName(), roomType.freeService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getServiceName());
    }
}
