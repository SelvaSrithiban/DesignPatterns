package solid_v5;

public class Eagle extends Bird implements FlyingBird{
    FlyingBehavior fb = new FlyHigh();
    @Override
    void makeSound() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeSound'");
    }
    @Override
    public void fly() {
        // TODO Auto-generated method stub
        fb.makeFly();
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }
    
}
