package adapter_v1;

public class PhonePe {

    BankAPI bankAPI;
    FastTag fastTag;
    PhonePeLoan phonePeLoan;


    PhonePe(BankAPI bankAPI){
        this.bankAPI = bankAPI;
        fastTag = new FastTag();
        phonePeLoan = new PhonePeLoan();
    }
    public boolean rechargeFastTag(int amount){
        int response = fastTag.fastTagRecharge(200, bankAPI);
        if(response == 1){
            System.out.println("FastTag is successfully recharged");
            return true;
        }
        System.out.println("FastTag is not recharged");
        return false;
    }

    public boolean availLoan(int loanAmount){
        int response = phonePeLoan.availPhonePeLoan(500, bankAPI);
        if(response == 1){
            System.out.println("You can avail the loan.");
            return true;
        }
        System.out.println("You are not eligible for the loan");
        return false;

    }

    public void phonePeTrasfer(int amount){
        bankAPI.transfer(100, 345666);

    }
    
}
