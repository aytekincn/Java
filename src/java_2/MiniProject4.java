package java_2;

import java.util.Scanner;

public class MiniProject4 {
    // Dik üçgenin hipotenüsünü bulma.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int b;

        System.out.print("Birinci Kenar :");
        a = s.nextInt();
        System.out.print("İkinci Kenar :");
        b = s.nextInt();

        double h = Math.sqrt( a * a + b * b);
        System.out.print("Hipotenüs :" + h );


    }
}
