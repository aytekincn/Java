package java_lessons;

public class Arrays1 {
    public static void main(String[] args) {
        int a [] = new int[8];
        a [5] = 8;
        // 0, 0, 0, 0, 0, 8, > 0 dan başlayıp verilen değerdeki elemanları gösterir
        System.out.println("" + a [5]);
        int b [] = {1, 3, 4, 6, 7, 8, 45, 76, 88};
        System.out.println("" + b[4]);
        String companies [] = {"Amazon", "Microsoft", "Apple", "IBM"};
        System.out.println(companies [1] + ":" + b [0]);
    }
}
