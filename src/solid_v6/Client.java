package solid_v6;

import solid_v5.FlyHigh;
import solid_v5.FlyLow;
import solid_v5.FlyingBehavior;

public class Client {

    public static void main(String[] args) {
        Bird b = new Owl();
        b.eat();
        FlyingBehavior fb = new FlyHigh();
        Eagle eagle1 = new Eagle(fb);

        eagle1.setFlyingBehavior(new FlyLow());

    }
    
}
