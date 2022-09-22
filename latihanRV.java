import java.util.Scanner;

public class latihanRV {
    static float luasSegitiga(int alas, int tinggi) {
        return 0.5f * alas *tinggi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alas, tinggi;

        System.out.println("Input Alas: ");
        alas = sc.nextInt();

        System.out.println("Input Tinggi: ");
        tinggi = sc.nextInt();

        System.out.println("Luas segitiga : " + luasSegitiga(alas,tinggi));
        sc.close();
    }
}
