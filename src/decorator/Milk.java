package decorator;

public class Milk extends AddOn{

    private Beverage beverage;

    Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return beverage.getDescription() + " With Milk";
    }

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return beverage.getCost() + 15;
    }
    
}
