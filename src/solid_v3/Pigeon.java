package solid_v3;

public class Pigeon extends Bird implements Flyable{

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("Pigeon is flying");
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }

    @Override
    void makeSound() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeSound'");
    }

}
