package java_2;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        /*
        switch ( op ) {
                 case durum1 :
                 islemler
                 break

                 case durum2 :
                 islemler
                 break
                 //
                 //
                 default :
                 islemler
                 break

                 }
                 // Girilen durumda şart sağlandıktan sonra break kullanılmamışsa altındaki kısmı da direkt yazdırır.

         */

        Scanner s = new Scanner (System.in);
        String bolge = s.nextLine();


        switch ( bolge ) {
            case "Marmara" :
                System.out.println(" Öğrencinin Marmara Bölgesi için alacağı burs 600Tl");
                break;

            case "Ege" :
                System.out.println(" Öğrencinin Ege Bölgesi için alacağı burs 400Tl");
                break;

            case "Karadeniz" :
                System.out.println(" Öğrencinin Karadeniz Bölgesi için alacağı burs 350Tl");
                break;





        }















    }
}
