package ParkingLot.services;

import java.util.Optional;

import ParkingLot.models.Gate;
import ParkingLot.models.Ticket;
import ParkingLot.models.VehicleType;
import ParkingLot.repositories.*;

public class TicketService {
    private GateRepository gateRepository;
    //private VehicleRepository vehicleRepository;
    //private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository,
            //VehicleRepository vehicleRepository,
            //ParkingLotRepository parkingLotRepository,
            TicketRepository ticketRepository
    ) {
        this.gateRepository = gateRepository;
        //this.vehicleRepository = vehicleRepository;
        //this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(String vehicleNumber,String ownerName,VehicleType vehicleType,int gateId,int parkingLotId){
            //get the corresponding Gate object for gateId
            Optional<Gate> gateOptional = gateRepository.findGateById(gateId);

            if(gateOptional.isEmpty()){
                throw new RuntimeException("Invalid Gate Found");
            }
            Gate gate = gateOptional.get();

    }
    
}
