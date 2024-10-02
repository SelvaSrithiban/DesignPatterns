package strategy.v3;

public class Client {
    public static void main(String[] args) {
        GoogleMap googleMap = new GoogleMap();
        googleMap.findPath(TravelMode.CAR);
    }
}
