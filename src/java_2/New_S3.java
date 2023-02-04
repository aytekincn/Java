package java_2;

import java.util.Scanner;

public class New_S3 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.println ("Lütfen Yaş giriniz :");

        int yas = s.nextInt();

        System.out.println("Lütfen isim giriniz :");

        s.nextLine();  // Dummy --> int scannerdan sonra string girdisi alamama sorunu için çözüm
        // Double ve int gibi verilerden önce string yazılırsa hata olmaz

        String isim = s.nextLine();

        System.out.println ("Yaş :" + yas);
        System.out.println ("İsim :" + isim);
    }
}
