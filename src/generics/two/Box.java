package generics.two;

public class Box {

    private Object x;
    private Object y;

    Box(Object x, Object y){
        this.x = x;
        this.y = y;
    }

    Object getX(){
        return x;
    }

    Object getY(){
        return y;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Box{" + "x=" + x + ", y=" + y + '}';
    }
    
}
