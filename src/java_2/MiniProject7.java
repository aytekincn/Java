package java_2;

import java.util.Scanner;

public class MiniProject7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int giris_hakki = 3;
        String sys_kullanici_adi ="Aytekin Can";
        String sys_parola = "297862";
        System.out.println("******************************");
        System.out.println("Kullanıcı Girişine Hoş Geldiniz");
        System.out.println("******************************");

        while (true) {
            System.out.print("Kullanıcı Adı = ");
            String kullanici = s.nextLine();

            System.out.println("Parola = ");
            String parola = s.nextLine();

            if ( kullanici.equals ( sys_kullanici_adi ) && parola.equals ( sys_parola ) ) {
                System.out.println("Hoşgeldiniz " + kullanici);
                break;

            } else if ( kullanici.equals ( sys_kullanici_adi ) && !parola.equals ( sys_parola ) ) {
                System.out.println("Parolanız Yanlış Tekrar Deneyin ");
                giris_hakki = ( giris_hakki - 1 );
                System.out.println("Giriş Hakkınız :" + giris_hakki );

            } else if ( !kullanici.equals(sys_kullanici_adi ) && parola.equals ( sys_parola ) ) {
                System.out.println("Kullanıcı Adı Yanlış Tekrar Deneyin ");
                giris_hakki = ( giris_hakki - 1 );
                System.out.println("Giriş Hakkınız :" + giris_hakki );

            }else {
                System.out.println("Kullanıcı Adınız ve Parolanız Yanlış ");
                giris_hakki = ( giris_hakki - 1 );
                System.out.println("Giriş Hakkınız :" + giris_hakki );

            } if ( giris_hakki == 0 ) {
                System.out.println ( "Bir Süre Sonra Tekrar Deneyin....");
                break;

             }


            }
    }

}



