package singleResponsibility;

public class Bird {

    String name;
    String type;
    String color;
    int weight;
    String gender;
    boolean canFly;
    boolean hasWings;

    void eat(){
    }

    void fly(){
        if(type == "pigeon"){
            //implementation of how pigeon should fly
        }else if(type == "crow"){

        }
    }

    void makeSound(){
        //implementation of making different types of voice for every bird should be written
        if(type == "pigeon"){
            //implementation if how the pigeon should make sound.
        }else if(type == "crow"){

        }
    }



}
