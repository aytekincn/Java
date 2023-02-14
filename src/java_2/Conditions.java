package java_2;

import java.util.Scanner;

public class Conditions {
    public static void main (String [] args){
        /* if ( koşul ) {
        Koşul sağlanınca ( true ) bu blok çalışır


        }

        else {
              Bu bloğun üstündeki herhangi bir koşul sağlanmayınca bu blok çalışır.

              }
         */
        Scanner s = new Scanner (System.in);

        System.out.println("Lütfen Yaşınızı giriniz : ");

        int yas = s.nextInt();

        if ( yas < 18 ) {

            System.out.println("Bu mekana giremezsiniz...");

        }else {

            System.out.println("Bu mekana girebilirsiniz.");
        }






    }
}
