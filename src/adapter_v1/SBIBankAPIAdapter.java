package adapter_v1;

public class SBIBankAPIAdapter implements BankAPI{
    SBIBankAPI sbiBankAPI = new SBIBankAPI();
    @Override
    public int getBalance() {
        // TODO Auto-generated method stub
        return sbiBankAPI.balanceCheck();
    }

    @Override
    public boolean transfer(int amount, int receiverAccount) {
        // TODO Auto-generated method stub
        int senderAccount = 123455;
        try{
            sbiBankAPI.transferMoney(100, senderAccount, receiverAccount);
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
}
