package java_2;

import java.util.Scanner;

public class New_S {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println ("Lütfen Yaşınızı Girin :");

        int yas = s.nextInt();
        // Double sayi = s.nextDouble(); ancak sayıyı girerken virgülle girilmesi gerekir
        // String yazi = s.nextLine();  girilen string değeri yazi değişkenine çevirir


        System.out.println("Yaşınız :" + yas);
    }
}
