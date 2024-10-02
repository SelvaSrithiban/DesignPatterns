package strategy.v2;

public class Client {
    public static void main(String[] args) {
        GoogleMap googleMap = new GoogleMap();
        googleMap.findPath(TravelMode.CAR);
    }
}
