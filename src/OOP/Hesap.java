package OOP;

public class Hesap {
    // OOP ATM programı
    // Login classı kullanıcı adı ve şifreyi doğrulama için kullanılacak
    // Hesap classı hesap işlemlerini yapma
    // Atm ' yi çalıştıracak.

    private String kullanici_adi;
    private String kullanici_sifre;
    private int bakiye;


    public Hesap ( String kullanici_adi, String kullanici_sifre, int bakiye){
        this.kullanici_adi = kullanici_adi;
        this.kullanici_sifre =  kullanici_sifre;
        this.bakiye = bakiye;


    }
    public void setKullanici_adi () {
        this.kullanici_adi = kullanici_adi;
    }
    public String getKullanici_adi () {
        return kullanici_adi;
    }
    public void setKullanici_sifre () {
        this.kullanici_sifre = kullanici_sifre;
    }
    public String getKullanici_sifre () {
        return kullanici_sifre;
    }
    public void setBakiye () {
        this.bakiye = bakiye;
    }
    public int getBakiye () {
        return bakiye;
    }
    public void paraYatir ( int miktar ) {
        bakiye += miktar;
        System.out.println("Güncel bakiyeniz : " + bakiye );
    }
    public void paraCekme ( int miktar ) {
        if ( miktar > 3000 ) {
            System.out.println("Bir günde çekebeliceğiniz toplam miktar 3000tl");

        }if ( bakiye - miktar < 0) {
            System.out.println("Çekmek istediğiniz miktar bakiyenizi aşıyor...");
        }else {
            bakiye -= miktar;
            System.out.println("Kalan bakiyeniz : " + bakiye );
        }
    }










}
