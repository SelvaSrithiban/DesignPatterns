package ParkingLot.models;

import java.util.List;

public class ParkingFloors extends BaseModel{
    private String name;
    private int floorNumber;
    private List<ParkingSlots> slots;
    private ParkingFloorStatus status;
    private VehiclesAllowedFloor allowedVehicles;
    
    public int getFloorNumber() {
        return floorNumber;
    }
    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
    public List<ParkingSlots> getSlots() {
        return slots;
    }
    public void setSlots(List<ParkingSlots> slots) {
        this.slots = slots;
    }
    public ParkingFloorStatus getStatus() {
        return status;
    }
    public void setStatus(ParkingFloorStatus status) {
        this.status = status;
    }
    public VehiclesAllowedFloor getAllowedVehicles() {
        return allowedVehicles;
    }
    public void setAllowedVehicles(VehiclesAllowedFloor allowedVehicles) {
        this.allowedVehicles = allowedVehicles;
    }

}
