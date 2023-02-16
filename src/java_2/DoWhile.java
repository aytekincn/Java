package java_2;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        /*
        do {
                // Koşul doğru olduğu sürece
                // Whiledan farkı en az bir kere kesin çalışması. Koşulu kontrol etmeden.
                } while ( koşul) ;
         */
        //-----------------------------------------------------
        /*int a = 0;

        do {
            System.out.println(" a : " + a);
            a++;

        }while ( a <= 10);

         */
        // Girilen sayının rakamlarının toplamı.
        Scanner s = new Scanner (System.in);
        System.out.println(" Bir Sayı Girin :");
        int sayi = s.nextInt();
        int toplam = 0;

        do {
            toplam += sayi % 10;
            sayi /= 10;

        } while ( sayi > 0 );
        System.out.println("Rakamların Toplamı : " + toplam);




    }
}
