package java_lessons;

public class Arrays2 {
    public static void main(String[] args) {
        double myList [] = {1.2, 2.4, 3.5, 6.7, 7.7, 10.22};
        double total = 0;
        double max = myList [0];
        for (double number : myList){
            if (max < number); {
                max = number;
            }
            total = total + number;
            System.out.println( number );
            // sayıların hepsini yazdırır
        }
        System.out.println ("Toplam : " + total);
        System.out.println("En büyük değer : " + max);
    }
}
