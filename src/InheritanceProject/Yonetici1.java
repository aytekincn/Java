package InheritanceProject;

public class Yonetici1 extends Calisanlar {
    private int sorumlu_kisi_sayisi;

    public Yonetici1 ( String isim, String soyisim, int id, int sorumlu_kisi_sayisi ) {
        super ( isim, soyisim,id );
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }
    public void bilgileriGoster () {
        super.bilgileriGoster();
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı :" + sorumlu_kisi_sayisi );
    }
    public void zam_yap ( int zam_miktari ) {
        System.out.println( getIsim() + "Yönetici, Çalışanlara " + zam_miktari + "kadar zam yaptı ");
    }

}
