package generics.inheritance_generics;

public class Main {

    public static void playWithAnimal(Animal a){
        a.makeSound();
    }
    
    public static void main(String[] args) {
        Lion l = new Lion();
        Animal c = new Cat();
        playWithAnimal(l);
        playWithAnimal(c);
    }
}
