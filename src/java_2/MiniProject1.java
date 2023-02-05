package java_2;

import java.util.Scanner;

public class MiniProject1 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        // Beden kitle endeksi bulma

        System.out.println(" Lütfen Boyunuzu Giriniz : ( Örnek 1,80 ) ");

        Double boy = s.nextDouble();

        System.out.println(" Lütfen Kilonuzu Giriniz : ");

        int kilo = s.nextInt();

        Double bki = kilo / ( boy * boy);

        System.out.println(" Beden Kitle Endeksi :" + bki);
        

    }
}
