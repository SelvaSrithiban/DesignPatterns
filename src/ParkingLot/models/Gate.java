package ParkingLot.models;

import java.util.List;

public class Gate extends BaseModel {
      
    private int number;
    private GateStatus status;
    private List<Operator> operators;
    private GateType gateType;
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public GateStatus getStatus() {
        return status;
    }
    public void setStatus(GateStatus status) {
        this.status = status;
    }
    public List<Operator> getOperators() {
        return operators;
    }
    public void setOperators(List<Operator> operators) {
        this.operators = operators;
    }
    public GateType getGateType() {
        return gateType;
    }
    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }


}
