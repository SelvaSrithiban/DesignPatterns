package solid_v4;

import solid_v3.FlyingBird;

public class Eagle extends Bird implements FlyingBird{
    FlyHigh flyHigh = new FlyHigh();
    @Override
    void makeSound() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeSound'");
    }
    @Override
    public void fly() {
        // TODO Auto-generated method stub
        flyHigh.flyHigh();
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }
    
}
