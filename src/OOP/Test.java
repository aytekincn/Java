package OOP;

public class Test {
    public static void main(String[] args) {
        Car araba1 = new Car (); //Class'a ulaşmak için bu şekilde bir obje oluşturuyoruz.

        araba1.setModel("Bentley");
        System.out.println("Arabanın modeli :" + araba1.getModel() );
        araba1.setRenk("Gri");
        System.out.println("Arabanın rengi :" + araba1.getRenk() );
        araba1.setTekerlek(4);
        System.out.println("Arabanın tekerleri :" + araba1.getTekerlek() );
        araba1.setKapilar(4);
        System.out.println("Arabanın kapıları :" + araba1.getKapilar() );
















    }
}
