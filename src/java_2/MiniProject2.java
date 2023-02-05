package java_2;

import java.util.Scanner;

public class MiniProject2 {
    // Bir aracın yakıtı ve gittiği yolu alıp kaç tl ödemesi gerektiğini yazma.
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.print (" Aracınızın kilometre başına kaç kuruş yaktığını giriniz : (Örnek 0,32) :");
        Double kurus = s.nextDouble();

        System.out.print (" Kaç kilometre yol gittiğinizi yazınız :");
        int km =  s.nextInt();


        System.out.println("Ödemeniz gerek tutar :" + ( kurus * km ) + "'tl dir.");

    }
}
