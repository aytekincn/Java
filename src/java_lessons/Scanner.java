package java_lessons;

public class Scanner {
    public static void main(String[] args) {
        System.out.println("Lütfen Notunuzu Griniz");
        java.util.Scanner s = new java.util.Scanner(System.in);
        int not = s.nextInt();
        if (not >= 90) {
            System.out.println("Notunuz AA");
        } else if (not >= 80) {
            System.out.println("Notunuz BB");
        } else if (not >= 70) {
            System.out.println("Notunuz CC");
        } else {
            System.out.println("Kaldınız Notunuz FF");
        }


    }

}
