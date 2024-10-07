package multithreading.lightroom;

public class SycnPhotos implements Runnable{

    void syncPhotosToCloud(){
        System.out.println("Photos is syncing on the thread " + Thread.currentThread().getName());

    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        syncPhotosToCloud();
    }
    
}
