package adapter_v0;

public class PhonePeLoan {

    int availPhonePeLoan(int loanAmount, YesBankAPI yesBankAPI){
        int balance = yesBankAPI.checkBalance();

        if(balance >= loanAmount * 0.2){
            return 1;
        }
        return 0;
    }
    
}
