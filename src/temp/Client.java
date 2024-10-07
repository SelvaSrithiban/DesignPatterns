package temp;

import java.beans.FeatureDescriptor;

public class Client {
    public static void main(String[] args) {
        //System.out.println("Hello World");
        //Student st = new Student();
        //st.studentWorking();

        FlyingBehavior fly = new FlyLow();
        fly.flyLow();

        FlyingBehavior.flyHigh();

        Fly f2 = new FlyHigh();
        f2.fly();

        D outer = new D();

        // Instantiating the inner class
        D.E inner1 = outer.new E();
        inner1.myAbstractMethod();

        a1 a = new a2();

        Ab ab = new Ab();

        
    }
}
