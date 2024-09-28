package adapter_v1;

public interface BankAPI {
    
    int getBalance();
    boolean transfer(int amount, int receiverAccount);
}
