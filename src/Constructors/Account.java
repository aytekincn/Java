package Constructors;

public class Account {
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo;

    /* Tek tek method kullanmak yerine constructor kullanıyoruz. Obje oluşturunca verdiğimiz değerleri obje içine gönderiyoruz.
     Böylece değerleri içine atamış oluyoruz.
     Herhangi bi constructor oluşturmazsak java default constructor oluşturur.
     Birden fazla constructor oluşturabiliriz overloading gibi.
    */
    public Account () {

    }
    public void bilgileriGoster () {
        System.out.println("Hesap No :" + this.hesapNo );
        System.out.println("Hesap Bakiyesi :" + this.bakiye );
        System.out.println("Hesabın Sahibi :" + this.isim );
        System.out.println("Telefon No :" + this.telefonNo );
        System.out.println("Hesabın Mail Adresi :" + this.email );
        // Böyle bir method kullanarak bilgilerin hepsini gösterebiliriz


    } // Constructor oluştururken class ismi ile aynı olması lazım normal method gibi oluşturulur.
    public Account ( String hesapNo, double bakiye, String isim, String email, String telefonNo ) {
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;

    }
    public Account ( String isim, String email, String telefonNo) {
        /*
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;

        this.bakiye = 0.0;
        this.hesapNo = "Bilgi Yok";
        */
        // Bu şekilde elimizdeki bilgileri kullanıp bilinmeyenlere de geçici değer atayabiliriz.
        this ("Bilgi Yok",0.0, isim, email, telefonNo );
    }

    public void paraYatir ( double miktar ) {
        bakiye += miktar;
        System.out.println("Yeni bakiye : " + bakiye );
    }
    public void paraCekme ( double miktar ) {
        if ( miktar > 1500 ) {
            System.out.println("Günde 1500 tl den fazla para çekemezsiniz.. " );
        } if ( bakiye - miktar  < 0 ) {
            System.out.println("Yetersiz bakiye... \nBakiyeniz : " + bakiye);
        }else {
            bakiye -= miktar;
            System.out.println("Kalan bakiyeniz :" + bakiye );
        }
    }


    public void setHesapNo ( String hesapNo ) {
        this.hesapNo = hesapNo;
    }
    public String getHesapNo () {
        return hesapNo;
    }
    public void setBakiye ( double bakiye ) {
        this.bakiye = bakiye;
    }
    public double getBakiye () {
        return bakiye;
    }
    public void setIsim ( String isim ) {
        this.isim = isim;
    }
    public String getIsim () {
        return isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
}
