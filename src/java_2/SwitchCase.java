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
        int islem = s.nextInt();

        switch ( islem ) {
            case 1 :
                System.out.println(" 1.İşlem ");
                break;
            case 2 :
                System.out.println(" 2.İşlem ");
                break;
            case 3 :
                System.out.println(" 3.İşlem ");
                break;
            default :
                System.out.println(" Geçersiz İşlem ");
                // son kısımdan sonra break koymaya gerek çünkü sonrasında kontrol edeceği bir yapı yok






        }















    }
}
