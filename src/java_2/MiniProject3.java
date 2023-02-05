package java_2;

import java.util.Scanner;

public class MiniProject3 {
    // İki tane girilen sayıyı değiştirme.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print (" Birinci Sayı :");
        int birinci_sayi = s.nextInt();

        System.out.print (" İkinci Sayi :");
        int ikinci_sayi = s.nextInt();

        System.out.println("Değiştirilmeden önceki sayılar --> " + "Birinci Sayı :" + birinci_sayi + " İkinci Sayı :" + ikinci_sayi);

        int gecici = birinci_sayi;
        birinci_sayi = ikinci_sayi;
        ikinci_sayi = gecici;

        System.out.println("Değiştirilikten sonraki sayılar --> "+ "Birinci sayı :" + birinci_sayi +  "İkinci Sayi :" + ikinci_sayi );

    }
}
