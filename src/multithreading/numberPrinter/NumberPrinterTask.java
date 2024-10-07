package multithreading.numberPrinter;

public class NumberPrinterTask implements Runnable{

    private int data;

    NumberPrinterTask(int data){
        this.data = data;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("Number " + data + " On " + Thread.currentThread().getName());
    }
    
}
