package java_2;

public class Operators {
    public static void main (String[] args){
        /*
        + -----> Addition sum
        - -----> Subtraction
        / -----> Division
        * -----> Multiplication
        % -----> Modulus (Kalan)
        ++ ----> Increment
        -- ----> Decrement
         */
        System.out.println (3 + 4.2);
        System.out.println (3 - 5f);
        System.out.println (10d / 4);
        System.out.println (5 * 3.5);
        System.out.println (10 % 4); // 10'un 4 ile bölümünden kalanı gösterir
        //----------------------------------------------------------

        int a = 4;
        a += 2;   // a = a + 2 anlamına gelir
        a *= 3;
        System.out.println(a);
        int b = 6;
        b++; // b = b + 1;
        System.out.println(b);
        b--;
        System.out.println(b);

        int i = 7;
        System.out.println(++i); // i değeri postfix (i++) yazdığımızda güncel değeri vermez ancak başına prefix ++i yaptığımızda günceli verir
    }
}
