package InheritanceProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ss = new Scanner (System.in);
        System.out.println("Çalışanlar programı... ");
        String islemler = "İşlemler\n"
                + "1.Yazılımcı işlemleri.\n"
                + "2.Yönetici işlemleri\n"
                + "Çıkış için q ya basın.";
        System.out.println("**************************");
        System.out.println(islemler);
        System.out.println("**************************");

        while ( true ) {
            System.out.println("İşlemi seçiniz..");
            String islem = ss.nextLine();
            if (islem.equals("q") ) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if ( islem.equals("1") ) {
                Yazilimci yazilimci = new Yazilimci("Aytekin", "Can", 324, "Python, Java" );
                String yazilimci_islem = "1.Format At\n"
                        + "2.Bilgileri Göster"
                        + "Çıkış için q ya basın";
                System.out.println( yazilimci_islem );
                while ( true ) {
                    System.out.println("İşlemi seçiniz : ");
                    String y_islem = ss.nextLine();

                    if ( y_islem.equals("q") ) {
                        System.out.println("Çıkış yapılıyor...");
                        break;
                    }
                    else if ( y_islem.equals("1")) {
                        System.out.print("İşletim sistemi : ");
                        String isletim_sistemi = ss.nextLine();
                        yazilimci.formatAt( isletim_sistemi );
                    }
                    else if ( y_islem.equals("2")) {
                        System.out.println("Bilgiler Gösteriliyor...");
                        yazilimci.bilgileriGoster();
                    }
                    else {
                        System.out.println("Geçersiz yazılımcı işlemi.");
                    }
                }


            }
            else if ( islem.equals("2") ) {
                Yonetici1 yonetici1 = new Yonetici1("Mert ","Söylemez ", 1234, 12 );
                String yonetici_islemleri = "Yönetici İşlemleri\n"
                        + "1.Zam Yap\n"
                        + "2.Bilgileri Göster\n"
                        + "Çıkış için q ya basın";
                System.out.println( yonetici_islemleri );
                while ( true ) {
                    System.out.print ("İşlemi Seçiniz : ");
                    String yonetici_islem = ss.nextLine();

                    if ( yonetici_islem.equals("q") ) {
                        System.out.println("Çıkış yapılıyor...");
                        break;
                    }
                    else if ( yonetici_islem.equals("1") ) {
                        System.out.print ("Yöneticinin yapmak istediği zam miktarı : ");
                        int zam_miktarı = ss.nextInt();
                        ss.nextLine();
                        yonetici1.zam_yap( zam_miktarı );
                    }
                    else if ( yonetici_islem.equals("2") ) {
                        System.out.println("Bilgiler Gösteriliyor...");
                        yonetici1.bilgileriGoster();
                    }
                    else {
                        System.out.println("Geçersiz Yönetici işlemi...");
                    }


                }


            }
            else {
                System.out.println("Geçersiz işlem...");
            }






        }





    }


}
