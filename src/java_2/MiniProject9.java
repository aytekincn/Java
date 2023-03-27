package java_2;

import java.util.Scanner;

public class MiniProject9 {
    public static int cıkarma ( int a, int b ) {
        return ( a - b);
    }public static int toplama ( int a, int b ) {
        return ( a + b );
    }public static double bolme ( int a, int b ) {
        return ( (double)  a / b  );

    }public static int carpma ( int a, int b) {
        return ( a * b );

    }public static int toplama ( int a, int b, int c ) {
        return ( a + b + c);
    }public static int carpma ( int a, int b, int c ) {
        return ( a * b * c );
    }
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        String islemler = "1. Toplama İşlemi\n"
                + "2. Çıkarma İşlemi\n"
                + "3.Bölme İşlemi\n"
                + "4.Çarpma İşlemi\n"
                + "Çıkış için q ya basın...";

        System.out.println("********************************");
        System.out.println(islemler);
        System.out.println("********************************");

        while ( true ) {
            System.out.print("Yapmak istediğiniz işlemi seçin :");
            String islem = s.nextLine();

            if ( islem.equals( "q" ) ) {
                System.out.println("Programdan çıkılıyor..." );
                break;

            }else if ( islem.equals("1") ) {
                System.out.println("Kaç sayı toplayacaksınız 2 veya 3 ?");
                int kacsayi = s.nextInt();

                if ( kacsayi == 2) {
                    System.out.print("Birinci sayıyı girin :");
                    int a = s.nextInt();
                    System.out.print("İkinci sayıyı girin :");
                    int b = s.nextInt();
                    System.out.println("Sayıların toplamı : " + toplama(a, b) + " 'dir.");
                    s.nextLine();
                }else if ( kacsayi == 3 ) {
                    System.out.print("Birinci sayıyı girin :");
                    int a = s.nextInt();
                    System.out.print("İkinci sayıyı girin :");
                    int b = s.nextInt();
                    System.out.print("Üçüncü sayıyı girin :");
                    int c = s.nextInt();
                    System.out.println("Sayıların toplamı : " + toplama(a, b, c) + " 'dir." );

                }else {
                    System.out.println("Bunun için uygun metod bulunmuyor...");
                    s.nextLine();
                }
            }else if ( islem.equals("2")) {
                System.out.print("Birinci sayıyı girin : ");
                int a = s.nextInt();
                System.out.print("İkinci sayıyı girin :");
                int b = s.nextInt();
                System.out.println("Sayıların farkı : " + cıkarma(a, b) );

            }else if ( islem.equals("3") ) {
                System.out.print("Birinci sayıyı giriniz :");
                int a = s.nextInt();
                System.out.print("İkinci sayıyı giriniz :");
                int b = s.nextInt();
                System.out.println("Sayıların bölümü : " + bolme(a, b)  );

            }else if ( islem.equals("4") ) {
                System.out.print("Kaç tane sayıyı çarpacaksınız ? ");
                int kacsayi = s.nextInt();
                if ( kacsayi == 2 ) {
                    System.out.print("Birinci sayıyı girin :");
                    int a = s.nextInt();
                    System.out.print("İkinci sayıyı girin :");
                    int b = s.nextInt();
                    s.nextLine();
                    System.out.println("Sayıların çarpımı : " + carpma(a, b) + " 'dir." );

                }else if ( kacsayi == 3 ) {
                    System.out.print("Birinci sayıyı girin :");
                    int a = s.nextInt();
                    System.out.print("İkinci sayıyı girin :");
                    int b = s.nextInt();
                    System.out.print("Üçüncü sayıyı girin :");
                    int c = s.nextInt();
                    s.nextLine();
                    System.out.println("Sayıların çarpımı : " + carpma(a, b, c) + " 'dir." );
                }



            }




        }


       

        }
    }

