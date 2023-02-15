package java_2;

import java.util.Scanner;

public class MiniProject6 {
    public static void main(String[] args) {
        // Switch case kullanarak 4 işlem yapan bir hesap makinesi.
        Scanner s = new Scanner (System.in);
        System.out.println("**********************************************");
        String islemler = "1. Toplama İşlemi\n"
                + "2. Çıkarma İşlemi\n"
                + "3. Çarpma İşlemi\n"
                + "4. Bölme İşlemi" ;
        System.out.println(islemler);
        System.out.println("**********************************************");
        System.out.print(" İşlemi Seçin :");
        String islem = s.nextLine();
        int a;
        int b;

        switch ( islem ) {
            case "1":
                System.out.print(" Birinci Sayı :");
                a = s.nextInt();
                System.out.print(" İkinci Sayı :");
                b = s.nextInt();
                System.out.print(" Değerlerin Toplamı : " + ( a + b ));
                break ;

            case "2":
                System.out.print(" Birinci Sayı :");
                a = s.nextInt();
                System.out.print(" İkinci Sayı :");
                b = s.nextInt();
                System.out.print(" Değerlerin Farkı : " + ( a - b ));
                break ;

            case "3":
                System.out.print(" Birinci Sayı :");
                a = s.nextInt();
                System.out.print(" İkinci Sayı :");
                b = s.nextInt();
                System.out.print(" Değerlerin Çarpımı : " + ( a * b ));
                break ;

            case "4":
                System.out.print(" Birinci Sayı :");
                a = s.nextInt();
                System.out.print(" İkinci Sayı :");
                b = s.nextInt();
                System.out.print(" Değerlerin Bölümü : " + ( ( double )a / b ));
                break ;

            default :
                System.out.println(" Geçersiz İşlem");











        }






    }
}
