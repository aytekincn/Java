package Constructors;

public class Test1 {
    public static void main(String[] args) {
        // Bu şekilde yazınca kendi oluşturduğumuz constructor çalışır.
        // Account account1 = new Account();
        Account account2 = new Account( "3242435", 1000.0, "Aytekin", "aytekincan92@gmail.com", "5435423443");
        /* Bu şekilde içine değerleri atadığımız bi obje oluştururuz.

         */
        // account2.paraYatir(500);
        // account2.paraCekme(600);
        account2.paraCekme(500);


    }
}
