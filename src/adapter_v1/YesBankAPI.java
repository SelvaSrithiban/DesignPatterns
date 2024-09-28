package adapter_v1;

public class YesBankAPI {

    int checkBalance(){
        System.out.println("Balance in my Yes account is - 100");
        return 100;
    }

    void moneyTransfer(int amount, int senderAccount, int receiverAccount){
        System.out.println("Money is being transfeered via Yes Bank");
    }

    
}
