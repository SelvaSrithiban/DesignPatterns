package generics.three;

public class BoxTwo<T,U> {

    T x;
    U y;

    @Override
    public String toString() {
        return "BoxTwo [x=" + x + ", y=" + y + "]";
    }

    BoxTwo(T x, U y){
        this.x = x;
        this.y = y;
    }

    T getX(){
        return x;
    }

    U getY(){
        return y;
    }
    
}
