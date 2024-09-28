package adapter_v1;

public class PhonePe {

    YesBankAPI yesBankAPI;
    FastTag fastTag;
    PhonePeLoan phonePeLoan;

    PhonePe(){
        yesBankAPI = new YesBankAPI();
        fastTag = new FastTag();
        phonePeLoan = new PhonePeLoan();
    }
    public boolean rechargeFastTag(int amount){
        int response = fastTag.fastTagRecharge(200, yesBankAPI);
        if(response == 1){
            System.out.println("FastTag is successfully recharged");
            return true;
        }
        System.out.println("FastTag is not recharged");
        return false;
    }

    public boolean availLoan(int loanAmount){
        int response = phonePeLoan.availPhonePeLoan(500, yesBankAPI);
        if(response == 1){
            System.out.println("You can avail the loan.");
            return true;
        }
        System.out.println("You are not eligible for the loan");
        return false;

    }
    
}
