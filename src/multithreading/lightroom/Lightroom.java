package multithreading.lightroom;

public class Lightroom {
    
    public static void main(String[] args) {
        System.out.println("Light room is running on the " + Thread.currentThread().getName());

        //Thread creation
        Thread t1 = new Thread(new ImageProcess());
        Thread t2 = new Thread(new SycnPhotos());

        //Launch the Thread
        t1.start();
        t2.start();
    }
}
