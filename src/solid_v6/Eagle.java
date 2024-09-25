package solid_v6;

import solid_v5.FlyingBehavior;

public class Eagle extends Bird implements FlyingBird{
    FlyingBehavior fb;

    Eagle(FlyingBehavior fb){
        this.fb = fb;
    }

    void setFlyingBehavior(FlyingBehavior fb){
        this.fb = fb;
    }


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
