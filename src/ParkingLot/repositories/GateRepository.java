package ParkingLot.repositories;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

import ParkingLot.models.Gate;

public class GateRepository {
    private Map<Integer, Gate> gates = new TreeMap<>();

    public Optional<Gate> findGateById(int gateId){
        if(gates.containsKey(gateId)){
            return Optional.of(gates.get(gateId));
        }
        return Optional.empty();
    }
}
