package java_2;

import java.util.Scanner;

public class New_S2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi giriniz :");

        if ( scanner.hasNextInt() ) {
            int sayi = scanner.nextInt();
            System.out.println("Sayi :" + sayi);


        }
        else {
            System.out.println("Lütfen bir sayi giriniz :");

        }

    }
}
