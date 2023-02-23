package java_2;

import java.util.Scanner;

public class Methods1 {
    public static void faktoriyel () {

        Scanner s = new Scanner (System.in);
        System.out.print ("Bir sayı girin :");
        int sayi = s.nextInt();
        int faktoriyel = 1;

        while ( sayi > 0 ) {
            faktoriyel *= sayi;
            sayi--;
        }
        System.out.println("Faktoriyel :" + faktoriyel);


    }
    public static void main(String[] args) {
        /*
        Erişim belirleyici ( Opsiyonel )  Ekstra_Özellikler Dönüş_Tipi Fonksiyon_Adı (Parametreler) {
        // Burası Fonksiyon Bloğu

        // Fonksiyonun Yapacağı İşlemler Burada Olacak.
        }

         */
        faktoriyel(); // Hafızaya kaydettiğimiz işlemi veya başka bir şeyi direkt olarak kullanabiliri main metodu içinde.
        faktoriyel(); // Art arda da bu metodları kullanabiliriz.



    }

}
