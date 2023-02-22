package java_2;

import java.util.Scanner;

public class Break_Continue {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        while ( true ) {
            System.out.print("Bir Sayı Girin :");
            int islem = s.nextInt();
            if ( islem == -1 ) {
                System.out.println("İşlem sonlandı..." + islem );
            

            }
            System.out.print("İkinci Sayıyı Girin :");
            int islem2 = s.nextInt();
            int toplam = islem + islem2;

            System.out.println("Toplamı : " + toplam  );

        }


    }
}
