package ParkingLot.models;

import java.time.LocalDateTime;

public class Operator extends BaseModel {
   
    private String name;
    private LocalDateTime dateOfJoining;
    
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
