package adapter_v1;

public class YesBankAPIAdapter implements BankAPI{
    YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public int getBalance() {
        // TODO Auto-generated method stub
        return yesBankAPI.checkBalance();
    }

    @Override
    public boolean transfer(int amount, int receiverAccount) {
        // TODO Auto-generated method stub
        int senderAccount = 123455;
        try{
            yesBankAPI.moneyTransfer(100, senderAccount, receiverAccount);
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
}
