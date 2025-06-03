package ParkingLot.models;

public class ParkingSlots {
    private String id;
    private int number;
    private ParkingSlotStatus status;
    private VehicleAllowedSlots allowedVehicles;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public ParkingSlotStatus getStatus() {
        return status;
    }
    public void setStatus(ParkingSlotStatus status) {
        this.status = status;
    }
    public VehicleAllowedSlots getAllowedVehicles() {
        return allowedVehicles;
    }
    public void setAllowedVehicles(VehicleAllowedSlots allowedVehicles) {
        this.allowedVehicles = allowedVehicles;
    }

}
