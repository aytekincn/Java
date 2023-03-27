package OOP;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Hesap hesap = new Hesap("Aytekincn","12345", 3000);
        atm.calis(hesap);


    }
}
