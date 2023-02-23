package java_2;

import java.util.Scanner;

public class MiniProject8 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.println("Bankamıza Hoşgeldiniz... Faiz oranı %6 ");
        int anapara, vade;

        System.out.print("Yatırmak İstediğiniz Tutar :");
        anapara = s.nextInt();

        System.out.print("Kaç Yıl Vadeli Yatırmak İstiyorsunuz ? ");
        vade = s.nextInt();

        double toplampara = anapara;
        double faizOrani = 0.06;

        for ( int a = 1 ; a <= vade ; a++ ) {
            toplampara = ( toplampara * faizOrani ) + toplampara;
            System.out.println( a + ". yılın sonunda toplam para :" + ( int ) toplampara );

        }

    }
}
