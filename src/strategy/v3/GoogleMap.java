package strategy.v3;

public class GoogleMap{

    void findPath(TravelMode travelMode){
    PathCalculatorFactory.createPathCalculator(travelMode).findPath();
}

}

