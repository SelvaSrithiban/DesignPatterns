package solid_v4;

public class Owl extends Bird implements FlyingBird{

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }

    @Override
    void makeSound() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeSound'");
    }

    void eat(){
        System.out.println("Owl is eating");
    }

}
