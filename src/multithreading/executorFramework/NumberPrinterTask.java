package multithreading.executorFramework;

public class NumberPrinterTask implements Runnable{
	
	private int num;
	
	NumberPrinterTask(int num){
		this.num = num;
	}
	
	void printNumber() {
		System.out.println("Printing number " + num + " on " + Thread.currentThread().getName());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		printNumber();
		
	}

}