package strategy.v2;

public class GoogleMap{

    void findPath(TravelMode travelMode){
    if(travelMode.equals(TravelMode.BIKE)){
        PathCalculator pathCalculator = new BikePathCalculator();
        pathCalculator.findPath();
    }else if(travelMode.equals(TravelMode.CAR)){
        PathCalculator pathCalculator = new CarPathCalculator();
        pathCalculator.findPath();
    }else if(travelMode.equals(TravelMode.WALK)){
        PathCalculator pathCalculator = new WalkPathCalculator();
        pathCalculator.findPath();
    }
}

}

