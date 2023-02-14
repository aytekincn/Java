package java_2;

import java.util.Scanner;

public class Conditions2 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        // Girilen değere göre alınan harf notunu ekrana yazdırma.
        System.out.print("Lütfen Notunuzu Girin :");
        int not = s.nextInt();

        if ( not >= 90 ) {
            System.out.println("Notunuz AA'dır");

        }else if ( not >= 80 ) {
            System.out.println("Notunuz BB'dir ");

        }else if ( not >= 70 ) {
            System.out.println("Notunuz CC'dir");

        }else if ( not >= 60) {
            System.out.println("Notunuz DC'dir");

        }else {
            System.out.println("Kaldınız, Notunuz FF'dir");
        }





    }
}
