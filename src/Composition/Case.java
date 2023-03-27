package Composition;

public class Case {
    private String model;
    private String uretici ;
    private String malzeme;

    public Case ( String model, String uretici, String malzeme ) {
        this.model = model;
        this.setUretici(uretici);
        this.setMalzeme(malzeme);

    }
    public void pc_ac () {
        System.out.println("Bilgisayar açılıyor....");
    }

    public void setModel ( String model ) {
        this.model = model;
    }
    public String getModel () {
        return model;
    }


    public String getUretici() {
        return uretici;
    }

    public void setUretici (String uretici) {
        this.uretici = uretici;
    }

    public String getMalzeme() {
        return malzeme;
    }

    public void setMalzeme (String malzeme) {
        this.malzeme = malzeme;
    }
}
