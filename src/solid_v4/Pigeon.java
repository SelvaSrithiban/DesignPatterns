package solid_v4;

public class Pigeon extends Bird implements FlyingBird{
    FlyLow flylow = new FlyLow();

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        flylow.flyLow();
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }

    @Override
    void makeSound() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeSound'");
    }

}
