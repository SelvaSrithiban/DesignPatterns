package adapter_v1;

public class PhonePeLoan {

    int availPhonePeLoan(int loanAmount, BankAPI bankAPI){
        int balance = bankAPI.getBalance();

        if(balance >= loanAmount * 0.2){
            return 1;
        }
        return 0;
    }
    
}
