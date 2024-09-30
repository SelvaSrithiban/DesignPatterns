package decarator;

public class Whip extends AddOn{

    private Beverage beverage;

    Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return beverage.getDescription() + " With Whip";
    }

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return beverage.getCost() + 25;
    }
    
}
