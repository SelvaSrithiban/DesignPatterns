package generics.two;

import org.omg.CORBA.IntHolder;

public class BoxDemo {
    public static void main(String[] args) {

        Box b1 = new Box(5, 10);
        Box b2 = new Box("Hello", 10);
        
        //Type casting needs to be done
        //Object v1 = b1.getX();
        //System.out.println(v1 + 5);

        Integer v1 = (Integer)b1.getX();
        System.out.println(v1 + 5);
        //System.out.println(b1);

        Integer v2 = (Integer)b2.getX(); //This line would throw an Runtime Exception
        System.out.println(v2 + 5);    
        //System.out.println(b1);

     

        
    }
}
