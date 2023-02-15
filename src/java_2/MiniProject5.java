package java_2;

import java.util.Scanner;

public class MiniProject5 {
    public static void main(String[] args) {
        // Girilen sayılar arasından en büyüğünü bulma.
        Scanner s = new Scanner (System.in);

        System.out.print(" Birinci Sayıyı Girin :");
        int a = s.nextInt();
        System.out.print(" İkinci Sayıyı Girin :");
        int b = s.nextInt();
        System.out.print(" Üçüncü Sayıyı Girin :");
        int c = s.nextInt();

        int min = -1;

        if ( a <= b && a <= c ) {
            min = a;
        }else if ( b <= a && b <= c ) {
            min = b;
        }else {
            min = c;
        }
        System.out.println(" En Küçük Sayı :" + min);
    }
}
