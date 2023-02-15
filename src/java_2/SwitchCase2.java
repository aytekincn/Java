package java_2;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.print("Hangi Bölgede Okuduğunuzu Giriniz :");
        String bolge = s.nextLine();


        switch ( bolge ) {
            case "Marmara" :
                System.out.println(" Öğrencinin Marmara Bölgesi için alacağı burs 600Tl");
                break;
            case "marmara" :
                System.out.println("Öğrencinin Marmara Bölgesi için alacağı burs 600Tl");
                break;

            case "Ege" :
                System.out.println(" Öğrencinin Ege Bölgesi için alacağı burs 400Tl");
                break;

            case "Karadeniz" :
                System.out.println(" Öğrencinin Karadeniz Bölgesi için alacağı burs 350Tl");
                break;

            case "Doğu Anadolu" :
                System.out.println(" Öğrencinin Doğu Anadolu Bölgesi için alacağı burs 700Tl");





        }
    }
}
