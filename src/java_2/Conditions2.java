package java_2;



public class Conditions2 {
    public static void main(String[] args) {

        // Girilen değere göre alınan harf notunu ekrana yazdırma.
        System.out.print("Lütfen Notunuzu Girin :");
        int not = 60;

        if ( not >= 90 ) {
            System.out.println("Notunuz AA'dır");

        }else if ( not >= 80 ) {
            System.out.println("Notunuz BB'dir ");

        }else if ( not >= 70 ) {
            System.out.println("Notunuz CC'dir");

        }else if ( not >= 60) {
            System.out.println("Notunuz DC'dir");

        }else {
            System.out.println("Kaldınız, Notunuz FF'dir");
        }





    }
}
