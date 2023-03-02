package java_2;

public class Methods3 {
    public static int ikiilecarp ( int a ) {
        return a * 2;
    }
    public static int ikiiletopla ( int a ) {
        return a + 2;
    }
    public static int dortilecarp ( int a ) {
        return a * 4;
    }
    public static void main(String[] args) {

        System.out.println ( dortilecarp ( ikiiletopla ( ikiilecarp(6) ) ) );
        // Fonksiyonların içinde method kullanılacaksa void iç içe çalıştırmalarda çalışmaz bundan dolayı method kullanırız.
        // Method içinde return en son yazılır returnden sonra yazılan kodlar çalışmaz.

    }
}
