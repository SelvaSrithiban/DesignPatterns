package ParkingLot.models;

import java.time.LocalDateTime;

public class Operator {
    private int id;
    private String name;
    private LocalDateTime dateOfJoining;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDateTime getDateOfJoining() {
        return dateOfJoining;
    }
    public void setDateOfJoining(LocalDateTime dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }
}
