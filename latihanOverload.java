public class latihanOverload {
    static double hitung(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println("1. " + hitung(5,5.6));
        System.out.println("2. " + hitung(5.6,5));
        System.out.println("3. " + hitung(5,5));
        System.out.println("4. " + hitung(5.6,5.6));
    }
}
