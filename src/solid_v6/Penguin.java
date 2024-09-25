package solid_v6;

public class Penguin extends Bird implements Swimmer{

    @Override
    void makeSound() {
        // TODO Auto-generated method stub
        System.out.println("Penguin is making the sound");
        throw new UnsupportedOperationException("Unimplemented method 'makeSound'");
    }

    @Override
    public void swim() {
        // TODO Auto-generated method stub
        System.out.println("Penguin is swimming");
        throw new UnsupportedOperationException("Unimplemented method 'swim'");
    }

}
