package adapter_v1;

import java.util.Scanner;

public class Client {
    static BankAPI bankAPI;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    String bank = scanner.nextLine();
    bankAPI = BankAPIFactory.createBankAPI(bank);
    PhonePe phonePe = new PhonePe(bankAPI);
    phonePe.rechargeFastTag(200);
    phonePe.availLoan(500);
    phonePe.phonePeTrasfer(10);
    }
    
}
