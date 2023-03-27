package OOP;

import java.util.Scanner;

public class Login {
    // Void kısmından sonra type gelmediği için public boolean yazarız.
    public boolean Login ( Hesap hesap ) {
        Scanner s = new Scanner(System.in);

        System.out.println("Kullanıcı adı : " );
        String kullanici_adi = s.nextLine();
        System.out.println("Şifre :");
        String parola = s.nextLine();

        // Hesap classı içindeki bilgilere eşitlemek için get kısmını burada girdi aldığımız kısma eşitleriz.
        if ( hesap.getKullanici_adi().equals ( kullanici_adi ) && hesap.getKullanici_sifre().equals ( parola ) ) {
            return true;

        }else {
            return false;
        }






    }




}
