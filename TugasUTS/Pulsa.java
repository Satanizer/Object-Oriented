package TugasUTS;

import java.util.Scanner;

class method {
    public int jam,menit,detik;

    public double harga() {
        int range = jam * 3600 + menit * 60 + detik;
        return range / 5 * 150;
    }

    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.println("Berapa Jam : ");
        jam = input.nextInt();
        System.out.println("Berapa Menit : ");
        menit = input.nextInt();
        System.out.println("berapa Detik : ");
        detik = input.nextInt();
        System.out.print("\n");
    }

    public void waktu() {
        System.out.printf("Total Waktu = %d jam , %d menit , %d detik",
                jam, menit, detik);
    }
}

public class Pulsa {
    public static void main(String[] args) {
        method sulit = new method();
        sulit.input();
        sulit.waktu();
        System.out.println("\nTotal Biaya percakapan = Rp. " + sulit.harga());
    }
}