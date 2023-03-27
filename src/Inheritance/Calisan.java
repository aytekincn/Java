package Inheritance;

public class Calisan { // Ana class burası olduğu için buna SuperClass veya BaseClass denir.
    // Inheritance bir classda olan özellikleri diğer class içine miras alma gibi düşünülebilir.

    private String isim;
    private int maas;
    private String departman;

    public Calisan ( String isim, int maas, String departman) {
        this.setIsim(isim);
        this.setMaas(maas);
        this.setDepartman(departman);
    }
    public void Calisan () {
        System.out.println("Çalışan, çalışıyor...");
    }
    public void bilgileriGoster () {
        System.out.println("İsim :" + getIsim());
        System.out.println("Maaş :" + getMaas());
        System.out.println("Departman :" + getDepartman());
    }
    public void departman_degis ( String yeni_departman ) {
        System.out.println("Departman değiştiriliyor... " );
        this.setDepartman(yeni_departman);
        System.out.println("Yeni departman :" + this.getDepartman());


    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}


