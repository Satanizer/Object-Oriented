public class Main {
    public static void main(String[] args) {
        Mobil brio = new Mobil();
        Mobil audi = new Mobil();

        brio.setNama("Brio");
        brio.brakeOn();
        brio.brakeOff();

        audi.setNama("Audi");
        audi.brakeOff();
    }
}
