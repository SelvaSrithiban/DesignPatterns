package solid_v5;

public class Pigeon extends Bird implements FlyingBird{
    FlyingBehavior fb = new FlyLow();

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        fb.makeFly();
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }

    @Override
    void makeSound() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeSound'");
    }

}
