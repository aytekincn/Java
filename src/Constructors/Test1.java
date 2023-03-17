package Constructors;

public class Test1 {
    public static void main(String[] args) {
        // Bu şekilde yazınca kendi oluşturduğumuz constructor çalışır.
        // Account account1 = new Account();
        Account account1 = new Account();
        // Bu şekilde içine değerleri atadığımız bi obje oluştururuz.


        // account2.paraYatir(500);
        // account2.paraCekme(600);
       // account2.paraCekme(500);

        Account account2 = new Account("Aytekin", "aytekincan92@gmail.com", "535453535");

        account2.bilgileriGoster(); // Hesap bilgilerini alabiliriz bu method ile.

    }
}
