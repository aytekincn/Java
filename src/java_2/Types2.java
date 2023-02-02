package java_2;

public class Types2 {
    public static void main(String[] args) {
        // Double 64 bit - 8 byte
        // Float 32 bit - 4 byte
        double a = 5.25;
        double b = 4.6;
        double c = 4d;   // sayıdan sonra d koyduğumuzda double tipinde sayı .0 şeklinde getirir
        System.out.println ( c );

        float d = (float) 5.0;
        float e = 5f;
        float f = 5.2f;     // sayının sonuna f koyduğumuzda cinsini float şeklinde tanımlamak istediğimizi belirtir

        // Otomatik dönüştürme sırası : int --> float --> double -->

    }
}
