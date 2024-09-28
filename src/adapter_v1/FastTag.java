package adapter_v1;

public class FastTag {
    
    
    int fastTagRecharge(int amount, BankAPI bankAPI){
        int balance = bankAPI.getBalance();
        if(amount > balance){
            return 0;
        }else if(amount < balance){
            return 1;
        }else if(amount == balance){
            return 1;
        }
        return 0;
    }
}
