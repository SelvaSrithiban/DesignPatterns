package ParkingLot.models;

import java.util.List;

public class ParkingLot extends BaseModel {
    
    private String name;
    private List<ParkingFloors> floors;
    private List<Gate> entryGate;
    private List<Gate> exitGate;
    private ParkingLotStatus status;
    private List<VehiclesAllowedLOT> allowedVehicles;
 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<ParkingFloors> getFloors() {
        return floors;
    }
    public void setFloors(List<ParkingFloors> floors) {
        this.floors = floors;
    }
    public List<Gate> getEntryGate() {
        return entryGate;
    }
    public void setEntryGate(List<Gate> entryGate) {
        this.entryGate = entryGate;
    }
    public List<Gate> getExitGate() {
        return exitGate;
    }
    public void setExitGate(List<Gate> exitGate) {
        this.exitGate = exitGate;
    }
    public ParkingLotStatus getStatus() {
        return status;
    }
    public void setStatus(ParkingLotStatus status) {
        this.status = status;
    }
    public List<VehiclesAllowedLOT> getAllowedVehicles() {
        return allowedVehicles;
    }
    public void setAllowedVehicles(List<VehiclesAllowedLOT> allowedVehicles) {
        this.allowedVehicles = allowedVehicles;
    }


}
