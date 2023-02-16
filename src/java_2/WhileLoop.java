package java_2;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        /*
        while ( döngü koşulu ) {
                   Koşul doğru olduğu sürece çalışır.

         */

        /*int a = 0;
        while ( a <= 10) {
            System.out.println("a :" + a); // Sout kısmında da artırma azaltma komutu verilebilir.
            a++;

-----------------------------------------------------------------------------------------------------
            int i = 0;
            while ( i < 10  ) {

                       System.out.println ( " i :" + i) ;
                       // Sonrasında herhangi bir işlem verilmediği için sonsuz döngüye girer.



         */
        Scanner s = new Scanner (System.in);
        System.out.println(" Bir Sayı Girin :");
        int sayi = s.nextInt();
        int factoriyel = 1;

        while ( sayi > 0 ) {
            factoriyel *= sayi;
            sayi--;

        }
        System.out.println(" Factoriyel Değeri :" + factoriyel);





    }
}
