package OOP;

public class Car {
    // Encapsulation (Sarmalama)
    private String renk;
    private int kapilar;
    private int tekerlek;
    private String motor;
    private String model;

    public void setModel ( String model ) {
        this.model = model;  // Private alanlara ulaşmak için kullanılan yöntem. Eğer method ismi aynı değilse this. kullanmaya gerek yok
        // Set kısmı değer döndürmez  setter metodu sadece değiştirme işlemi yapacağı için void olarak tanımlanır.
    }
    public String getModel () {
        return this.model; // Getter metotları geri dönüşü olan metot tipindedir ve isimlendirilmesi ise get ile başlayıp sonra değişken ismi yazılmalıdır.
        // Bu değişkenlere dışarıdan erişebilmek için her bir değişkenimiz için Getter metodu yazmalıyız.
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKapilar() {
        return kapilar;
    }

    public void setKapilar(int kapilar) {
        if ( kapilar < 0 ) {
            System.out.println("Kapı sayısı 0'dan küçük olamaz.");
        }else {
            this.kapilar = kapilar;
        }
    }

    public int getTekerlek() {
        return tekerlek;
    }

    public void setTekerlek(int tekerlek) {
        this.tekerlek = tekerlek;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
    /* Refactor kısmanda Encapsulate fields kısmını kullanarak diğer özellikeri de encapsulation yapabiliyoruz.

     */


}
