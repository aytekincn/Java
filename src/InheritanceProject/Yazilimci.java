package InheritanceProject;

public class Yazilimci extends Calisanlar {
    private String diller;
    public Yazilimci ( String isim, String soyisim, int id, String diller ) {
        super(isim, soyisim, id);
        this.diller = diller;
        // Superclassın constructuresini çağırmak için kullanırız. Özellikleri alabilmek için.
        // Yeni eklediğimiz ek özelliğin de constructuresini oluşturmamız gerektiği için oluşturduğumuz class içine yazarız.

    }
    public void formatAt ( String isletim_sistemi ){
        System.out.println( getIsim() + " " + isletim_sistemi + "ni formatlıyor... ");
    }
    public void bilgileriGoster ( ) {
        super.bilgileriGoster();
        System.out.println("Yazılımcının bildiği diller : " + diller );
        // Bu kısmı da override ederiz kullanmak için.
    }

}
