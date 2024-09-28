package adapter_v1;

import javax.swing.plaf.synth.SynthStyle;

public class SBIBankAPI {

    int balanceCheck(){
        System.out.println("Balance in my SBI account is - 100");
        return 100;
    }

    void transferMoney(int amount, int senderAccount, int receiverAccount){
        System.out.println("Money is being transfeered via SBI Bank");
    }
    
}
