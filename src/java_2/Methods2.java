package java_2;

import java.util.Scanner;

public class Methods2 {
    public static void toplama ( int a, int b, int c) {
        // Fonksiyonların içine parametre yollayabiliriz. Göndereceğimiz parametrenin türünü belirleriz.

        System.out.println("Toplam :" + ( a + b + c ) );
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Sıra sıra üç tane sayı girin :");

        toplama(s.nextInt(), s.nextInt(), s.nextInt());

    }
}
