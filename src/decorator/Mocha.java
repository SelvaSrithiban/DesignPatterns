package decorator;

public class Mocha extends AddOn{

    private Beverage beverage;

    Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return beverage.getDescription() + " With Mocha";
    }

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return beverage.getCost() + 20;
    }
    
}
