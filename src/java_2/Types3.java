package java_2;

public class Types3 {
    public static void main(String[] args) {
        char a = 'A';
        char b = '!';
        char c = 1000;
        char g = '\u2736';

        System.out.println (g);
        //---------------------------

        boolean f = true;
        boolean h = false;
        System.out.println (f);
        //----------------------------
        // \t bir tab kadar boşluk bırakır

        String i = "Java ";
        String e = "Programlama ";
        String t = "Dili";

        String toplam = i + e + t;
        System.out.println (toplam);

        String k = "Merhaba";
        int j = 23;
        String n = k + j;

        System.out.println (n);

        char p = '?';

        String l = "Merhaba nasılsın" + p;
        System.out.println(l);

        String u = "Java\t" +
                "Programlama\tDili";


        System.out.println (u);
        System.out.println( 3 == 3);



    }
}
