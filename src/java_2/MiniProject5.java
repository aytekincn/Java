package java_2;

import java.util.Scanner;

public class MiniProject5 {
    public static void main(String[] args) {
        // Girilen sayılar arasından en büyüğünü bulma.
        Scanner s = new Scanner (System.in);

        System.out.println(" Birinci Sayıyı Girin :");
        int a = s.nextInt();
        System.out.println(" İkinci Sayıyı Girin :");
        int b = s.nextInt();
        System.out.println(" Üçüncü Sayıyı Girin :");
        int c = s.nextInt();

        int maks = -1;

        if ( a >= b && a >= c ) {
            maks = a;
        }else if ( b >= a && b >=c ) {
            maks = b;
        }else {
            maks = c;
        }
        System.out.println(" En Büyük Sayı :" + maks);
    }
}
