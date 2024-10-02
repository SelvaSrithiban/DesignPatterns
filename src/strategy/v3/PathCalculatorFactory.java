package strategy.v3;

public class PathCalculatorFactory{
    private static PathCalculator pathCalculator = null;
    public static PathCalculator createPathCalculator(TravelMode travelMode){

        if(travelMode.equals(TravelMode.BIKE)){
            pathCalculator = new BikePathCalculator();
            //pathCalculator.findPath();
        }else if(travelMode.equals(TravelMode.CAR)){
            pathCalculator = new CarPathCalculator();
            //pathCalculator.findPath();
        }else if(travelMode.equals(TravelMode.WALK)){
            pathCalculator = new WalkPathCalculator();
            //pathCalculator.findPath();
        }

        return pathCalculator ;
    }
}