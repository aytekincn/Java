package java_2;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        /*
        for ( baslatma ; kosul ; artırma veya azaltma işlemleri ) {
                Döngü koşulu doğru olduğu sürece burası çalışır.

                }



        int a;
        for (a = 1; a <= 10; a += 1  ) {
            System.out.println( a );
        }
----------------------------------------------------------------
        */

        /*for ( int a = 0; a <= 10; a++) {
            System.out.println("a :" + a );
        }
-----------------------------------------------------------------
         */

        /* for ( int a = 10; a >= 0; a-- ) {
            System.out.println( a );
        }
----------------------------------------------------------------
         */

        /* int a = 0;
        for ( ; a < 5; a++) {
            System.out.println(" Java Class ");
        }
-----------------------------------------------------------------
         */

        /* int a = 0;
        int b = 10;
        for ( ; a < 10 && b > 0; a++ , b--) {
            System.out.println(" a :" + a);
            System.out.println(" b :" + b);
        }

         */

        Scanner s = new Scanner (System.in);
        System.out.println(" Bir Sayı Girin : ");

        int faktoriyel = 1;
        int sayi = s.nextInt();
        for ( int a = 1; a <= sayi; a++) {
            faktoriyel *= a;
            System.out.println("Faktoriyel Değeri : " + faktoriyel);

        }
        System.out.println(" Sayının Faktoriyeli : " + faktoriyel);
















    }
}
