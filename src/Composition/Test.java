package Composition;

public class Test {
    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920,1080);
        Monitor monitor = new Monitor("Tuf", "Asus", "23.8", resolution );
        Case case1 = new Case("Vento", "Corsair", "Temperli Cam");
        Motherboard motherboard = new Motherboard("Prime B650", "Asus", 10, "Windows 10");
        Computer computer = new Computer(monitor, case1, motherboard );

        computer.getKasa().pc_ac(); // İç içe objelere referanslar yardımıyla erişilebilir.
        computer.getMonitor().monitoru_kapat();// Compositionda HAS A ilişki olur bu yüzden bilgisayar anakarta monitore sahip olur inheritance kullanılmaz.
        computer.getMotherboard().isletim_sistemi_yukle("Ubuntu 16.04");
        // Inheritance kullanımında örnek olarak bir şirkette herkes çalışandır ama hepsinin ayrı ayrı özellikleri vardır.



    }
}
