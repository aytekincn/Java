package Composition;

public class Computer {
    // Bilgisayar objemiz oluştu bunun içinde monitor kasa anakart hepsi bulunacak.
    private Monitor monitor;
    private Case kasa;
    private Motherboard motherboard;

    public Computer ( Monitor monitor, Case kasa, Motherboard motherboard ) {
        this.setMonitor(monitor);
        this.setKasa(kasa);
        this.setMotherboard(motherboard);
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Case getKasa() {
        return kasa;
    }

    public void setKasa(Case kasa) {
        this.kasa = kasa;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }
}
