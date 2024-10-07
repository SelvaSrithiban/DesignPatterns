package multithreading.lightroom;

public class ImageProcess implements Runnable {

    public void denoise(){
        System.out.println("Denoising the image on the thread " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        //Run executes the new thread
        System.out.println("Processing the image");
        denoise();
    }
    
}
