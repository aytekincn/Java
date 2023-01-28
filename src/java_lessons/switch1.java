package java_lessons;

public class switch1 {
    public static void main(String[] args) {
        char grade = 'H';

        switch (grade) {
            case 'A':
                System.out.println("Geçtiniz");
                break;
            case 'B':
                System.out.println("Ortalama");
                break;
            case 'F':
                System.out.println("Kaldınız");
                break;
            default:
                System.out.println("Geçersiz");
                break;
        }
    }
    // en son kullanılanın ardından break kullanmaya gerek yok
    // aa
}