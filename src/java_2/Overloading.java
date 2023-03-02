package java_2;

public class Overloading {
    public static void skorhesapla ( String isim , int puan ) {
        System.out.println( isim + " isimli oyuncunun puanı " + puan + " 'dır.");
    }
    public static void skorhesapla ( String isim ) {
        System.out.println( isim + " isimli oyuncunun puanı yoktur.");
    }
    public static void skorhesapla ( int puan ) {
        System.out.println( " isimsiz oyuncun puanı " + puan + " 'dır.");
    }
    public static void main(String[] args) {
        // Bir fonksiyona birden fazla iş yaptırmak için overloading kullanırız bunu da ekstra diğer durumlar için method oluşturarak yaparız.

        skorhesapla( "Aytekin", 1000);
        skorhesapla("Aytekin");
        skorhesapla(300);
        // Bu şekilde methoda birden farklı şey yaptırabiliriz.

    }
}
