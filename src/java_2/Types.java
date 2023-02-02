package java_2;

public class Types {
    public static void main (String[] args) {
        int a = 4; // int = 2 ^ - 31 -- 2 ^ 31 - 1
        System.out.println ( Integer.MAX_VALUE); // 2147483647
        System.out.println ( Integer.MIN_VALUE); // -2147483648

        byte c = 100;
        System.out.println ( Byte.MAX_VALUE ); // 127
        System.out.println ( Byte.MIN_VALUE ); // - 128

        short b = 120;
        System.out.println ( Short.MAX_VALUE ); // 32767
        System.out.println ( Short.MIN_VALUE );  // - 32768

        long d = 5;
        System.out.println ( Long.MAX_VALUE );  // 9223372036854775807
        System.out.println ( Long.MIN_VALUE );   // - 9223372036854775808

        // byte --> short --> int --> long

        byte k = 100;
        byte l = (byte) (a / 2);
        // int değeri direkt olarak byte a atanmadığı için dönüştürme işlemi yapılır

        short i = 110;
        byte g = 9;
        int m = 8;

        long p = i + g + m;
        System.out.println (p);




    }
}
