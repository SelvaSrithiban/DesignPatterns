package ParkingLot.models;

public class Vehicle {
    private String carLicenseNumber;
    private String driverLicenseNumber;
    private VehicleType VehicleType;
    public String getCarLicenseNumber() {
        return carLicenseNumber;
    }
    public void setCarLicenseNumber(String carLicenseNumber) {
        this.carLicenseNumber = carLicenseNumber;
    }
    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }
    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }
    public VehicleType getVehicleType() {
        return VehicleType;
    }
    public void setVehicleType(VehicleType vehicleType) {
        VehicleType = vehicleType;
    }

}
