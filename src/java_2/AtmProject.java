package java_2;

import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int bakiye = 1000;
        String islemler = "1.İşlem : Bakiye Öğrenme\n"
                          + "2.İşlem : Para Çekme\n"
                          + "3.İşlem : Para Yatırma\n"
                          + "Çıkış için q'a basın";

        System.out.println("************************************");
        System.out.println( islemler );
        System.out.println("************************************");

        while ( true ) {
            System.out.print("Yapmak İstediğiniz İşlemin Numarasını Yazın :");
            String islem = s.nextLine();

            if ( islem.equals("q") ) {
                System.out.println("Programdan Çıkılıyor....");
                break;

            }else if ( islem.equals("1") ) {
                System.out.println("Bakiyeniz : " + bakiye );

            }else if ( islem.equals("2") ) {
                System.out.print(" Çekmek İstediğiniz Tutar : ");
                int tutar = s.nextInt();

             if ( bakiye - tutar < 0) {
                    System.out.println("Yetersiz Bakiye... Bakiyeniz : " + bakiye );
            }else {
                    bakiye -= tutar;
                    System.out.println("Kalan Bakiyeniz " + bakiye );
                }

            }else if ( islem.equals("3") ) {
                System.out.print("Yatırmak İstediğin Miktar : ");
                int miktar = s.nextInt();
                bakiye += miktar;
                System.out.println("Kalan Bakiyeniz :" + bakiye );


            }









        }












            }


        }

