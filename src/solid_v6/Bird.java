package solid_v6;

public abstract class Bird {

    String name;
    String type;
    String color;
    int weight;
    String gender;
    boolean canFly;
    boolean hasWings;

    
    abstract void makeSound();

    void eat(){
        System.out.println("Bird is eating");
    }

}
