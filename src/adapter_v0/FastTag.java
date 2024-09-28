package adapter_v0;

public class FastTag {
    
    
    int fastTagRecharge(int amount, YesBankAPI yesBankAPI){
        int balance = yesBankAPI.checkBalance();
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
