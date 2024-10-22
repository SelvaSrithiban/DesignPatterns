package generics.three;

public class Box<T> {

    private T x;
    private T y;

    Box(T x, T y){
        this.x = x;
        this.y = y;
    }

    T getX(){
        return x;
    }

    T getY(){
        return y;
    }

    @Override
    public String toString() {
        return "Box [x=" + x + ", y=" + y + "]";
    }

    /*@Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Box{" + "x=" + x + ", y=" + y + '}';
    }*/
    
}
