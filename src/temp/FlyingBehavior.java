package temp;

public interface FlyingBehavior {
    int HIGH_LIMIT = 100;
    int lowLimit = 10;

    static void flyHigh(){
        System.out.println("Bird is flying" + HIGH_LIMIT);
    }

    default void flyLow(){
        System.out.println("Bird is flying" + lowLimit);
    }
}
