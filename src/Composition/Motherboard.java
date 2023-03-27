package Composition;

public class Motherboard {
    private String model;
    private String uretici;
    private int yuva;
    private String isletim_sistemi;

    public Motherboard ( String model, String uretici, int yuva, String isletim_sistemi ) {
        this.model = model;
        this.uretici = uretici;
        this.yuva = yuva;
        this.isletim_sistemi = isletim_sistemi;
    }

    public void isletim_sistemi_yukle ( String isletim_sistemi ) {
        this.isletim_sistemi = isletim_sistemi;
        System.out.println("İşletim sistemi yüklendi " + isletim_sistemi );
    }






    public void setModel ( String model ) {
        this.model = model;
    }
    public String getModel () {
        return model;
    }
    public void setUretici ( String uretici ) {
        this.uretici = uretici;
    }
    public String getUretici () {
        return uretici;
    }
    public void setYuva ( int yuva ) {
        this.yuva = yuva;
    }
    public int getYuva () {
        return yuva;
    }
    public void setIsletim_sistemi ( String isletim_sistemi ) {
        this.isletim_sistemi = isletim_sistemi;
    }
    public String getIsletim_sistemi () {
        return isletim_sistemi;
    }




}
