package ParkingLot.models;

import java.time.LocalDateTime;

public class Payment {
    	
    private int id;
    private PaymentMode mode;
    private PaymentStatus status;
    private LocalDateTime time;
    private float amount;
    private String referenceNumber;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public PaymentMode getMode() {
        return mode;
    }
    public void setMode(PaymentMode mode) {
        this.mode = mode;
    }
    public PaymentStatus getStatus() {
        return status;
    }
    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
    public LocalDateTime getTime() {
        return time;
    }
    public void setTime(LocalDateTime time) {
        this.time = time;
    }
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
    public String getReferenceNumber() {
        return referenceNumber;
    }
    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }
}
