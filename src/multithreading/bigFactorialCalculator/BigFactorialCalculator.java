package multithreading.bigFactorialCalculator;

import java.math.BigInteger;

public class BigFactorialCalculator implements Runnable{

    int number;

    public BigFactorialCalculator(int number){
        this.number = number;
    }

    public void compute(){
        BigInteger result = new BigInteger("1");
        for(int i = 1; i <= number; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        compute();
    }


    
}
