package InheritanceProject;

public class Calisanlar {
    private String isim;
    private String soyisim;
    private int id;

    public Calisanlar(String isim, String soyisim, int id) {

        this.isim = isim;
        this.soyisim = soyisim;
        this.id = id;
    }

    public void bilgileriGoster() {
        System.out.println("Çalışan bilgileri:");
        System.out.println("Çalışanın ismi : " + isim);
        System.out.println("Çalışanın soyismi : " + soyisim);
        System.out.println("Çalışanın id' si : " + id);
    }


    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}