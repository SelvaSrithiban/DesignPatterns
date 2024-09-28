package adapter_v0;

public class Client {
    public static void main(String[] args) {
    PhonePe phonePe = new PhonePe();
    phonePe.rechargeFastTag(200);
    phonePe.availLoan(500);
    }
}
