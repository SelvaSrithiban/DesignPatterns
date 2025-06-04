package ParkingLot.models;

import java.time.LocalDateTime;
import java.util.List;

public class Bill extends BaseModel{
    
    private Ticket ticket;
    private LocalDateTime exitTime;
    private Operator operator;
    private Gate gate;
    private float amount;
    private List<Payment> payment;

    public Ticket getTicket() {
        return ticket;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    public LocalDateTime getExitTime() {
        return exitTime;
    }
    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
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
    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }
    public List<Payment> getPayment() {
        return payment;
    }
    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }

}
