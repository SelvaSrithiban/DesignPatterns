package adapter_v1;

public class BankAPIFactory {
    
    public static BankAPI createBankAPI(String bank){
        
        if(bank.equals("Yes")){
            return new YesBankAPIAdapter();
        }else if(bank.equals("SBI")){
            return new SBIBankAPIAdapter();
        }

        return null;
    }
}
