package Inheritance;

public class Main {
    public static void main(String[] args) {
        Yonetici yonetici1 = new Yonetici( "Aytekin Can" , 3000, "IT", 20);
        yonetici1.bilgileriGoster(); // Bu şekilde fonksiyonları kullanabiliriz çünkü inheritance ettik.
        // Yönetici kısmının içinde tanımlamadık ama miras alındığı için kullanılabiliyor.
        // Eğer bir ana classımız varsa be bu classın altında subclasslar olacaksa bütün ortak özellik ve methodlar bir class altında biriktirilir.


    }


}
