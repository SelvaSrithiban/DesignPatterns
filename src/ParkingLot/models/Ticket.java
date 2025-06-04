package ParkingLot.models;

import java.time.LocalDateTime;

public class Ticket {

    private int id;
    private String number;
    private Vehicle vehicle;
    private LocalDateTime entryTime;
    private Operator operator;
    private Gate gate;
    private ParkingSlots slot;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public LocalDateTime getEntryTime() {
        return entryTime;
    }
    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }
    public Operator getOperator() {
        return operator;
    }
    public void setOperator(Operator operator) {
        this.operator = operator;
    }
    public Gate getGate() {
        return gate;
    }
    public void setGate(Gate gate) {
        this.gate = gate;
    }
    public ParkingSlots getSlot() {
        return slot;
    }
    public void setSlot(ParkingSlots slot) {
        this.slot = slot;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
}
