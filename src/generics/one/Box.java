package generics.one;

public class Box {

    private int x;
    private int y;

    Box(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Box{" + "x=" + x + ", y=" + y + '}';
    }
    
}
