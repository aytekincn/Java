package Inheritance;

public class Yonetici extends Calisan { // Yönetici kısmı da Subclass olur. Classın önüne extends + inheritance yapmak istediğimiz classı yazıyoruz.
    // Ve özelliklerini aldığımız subclass için bir tane constructor yazmamız lazım.

    private int sorumlu_kisi; // Ekstra özellik eklenebilir. Alt kısımdaki method içine de değeri yollarız.

    public Yonetici(String isim, int maas, String departman, int sorumlu_kisi) {
        /*
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
        */
        // Constructor oluştururken hata ile karşılaşmamak için miras aldığımız classı kullanmak için superclassımızdaki özellikleri ekliyoruz.
        super(isim, maas, departman);
        this.sorumlu_kisi = sorumlu_kisi;
        // Superclassın içindeki özelliklere direkt olarak erişemediğimiz için constructor kullanırız.
    }

    public void zam_yap(int zam_miktarı) {
        System.out.println("Çalışanlara zam miktarı " + zam_miktarı + "yapıldı.");

    }


    public void bilgileriGoster() {
        // Uzun uzun yazmak yerine şu yöntemi kullanıp superclass içindeki değerleri alabiliriz.
        super.bilgileriGoster();
        System.out.println("Yönettiği kişi " + sorumlu_kisi);



        /*System.out.println("İsim :" + getIsim());
        System.out.println("Maaş :" + getMaas());
        System.out.println("Departman :" + getDepartman());
        System.out.println("Yönettiği kişi " + sorumlu_kisi);
        // Over riding yapmak için yani yeni eklediğimiz bilgi için bu yöntemi kullanırız mirası adlığımız kısıma ekleriz.
*/


    }
}
