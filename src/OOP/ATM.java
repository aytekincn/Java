package OOP;

import java.util.Scanner;

public class ATM {

    public void calis ( Hesap hesap ) {
        Login login = new Login();

        Scanner s = new Scanner (System.in);
        System.out.println("Bankamıza hoşgeldiniz...");
        System.out.println("**************************");
        System.out.println("Kullanıcı Girişi :");
        System.out.println("***************************");
        int giris_hakki = 3;

        while ( true ) {
            if ( login.Login(hesap) ) {
                System.out.println("Giriş başarılı...");
                break;
            }
            else {
                System.out.println("Yanlış şifre veya kullanıcı adı....");
                giris_hakki -= 1;
                System.out.println("Kalan giriş hakkı : " + giris_hakki );
            }
            if ( giris_hakki == 0 ) {
                System.out.println("Giriş hakkınız bitti...");
                return;
                // Break yerine return kullanıp methodu sadece o anlık durdurabiliriz.
            }





        }
        System.out.println("******************************");
        String islemler = "1.Bakiye Görüntüle\n"
                + "2.Para Yatırma\n"
                + "3.Para Çekme\n"
                + "İşlemi sonlandırmak için q ya basınız...";
        System.out.println(islemler);
        System.out.println("******************************");

        while ( true ) {
            System.out.println("İşlemi Seçiniz....");
            String islem = s.nextLine();

            if ( islem.equals("q") ){
                System.out.println("Sistemden Çıkılıyor...");
                break;
            }
            else if ( islem.equals("1") ) {
                System.out.println( "Bakiyeniz : "  + hesap.getBakiye() );
            }else if ( islem.equals("2") ) {
                System.out.print("Yatırmak istediğiniz tutarı giriniz : ");
                int miktar = s.nextInt();
                s.nextLine();
                hesap.paraYatir( miktar );

            }else if ( islem.equals("3") ) {
                System.out.print("Çekmek istediğiniz tutarı giriniz : ");
                int miktar = s.nextInt();
                s.nextLine();
                hesap.paraCekme( miktar );
            }else {
                System.out.println("Geçersiz işlem....");
            }
        }


    }


}
