package Tugas;

import java.util.Scanner;

class penggolongan {
    String ininama;
    char inigolongan;
    double gapok, tunjangan, gatot, lembur;

    public void input() {
        Scanner masuk = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("Keterangan Golongan : ");
        System.out.println("=============================");
        System.out.println("1 : Golongan 1");
        System.out.println("2 : Golongan 2");
        System.out.println("3 : Golongan 3");
        System.out.println("4 : Golongan 4");
        System.out.println("=============================");

        System.out.print("Masukkan Nama Anda : ");
        ininama = masuk.nextLine();
        System.out.print("Pilih Golongan Anda : ");
        inigolongan = masuk.nextLine().charAt(0);
        System.out.print("Lama Lembur : ");
        lembur = masuk.nextDouble();
    }

    public double rumus() {
        if (inigolongan == '1') {
            gapok = 1486500;
            tunjangan = 250000;
        } else if (inigolongan == '2') {
            gapok = 1926000;
            tunjangan = 300000;
        } else if (inigolongan == '3') {
            gapok = 2456700;
            tunjangan = 350000;
        } else if (inigolongan == '4') {
            gapok = 2899500;
            tunjangan = 400000;
        } else {
            System.out.println("ERROR");
        }

        gatot = gapok + tunjangan + (lembur * 20000);
        return gatot - (gatot * 0.005);
    }
}

public class Tugas7_Ihsan {
    public static void main(String[] args) {
        penggolongan sulit = new penggolongan();
        sulit.input();
        System.out.println("--------------------------------------");
        System.out.println("TOTAL GAJI ANDA : Rp." +sulit.rumus());
        System.out.println("--------------------------------------");
        System.out.println("~ tetap menyerah dan jangan semangat ~");
        System.out.println("--------------------------------------");
        System.out.println("Programmed by Ihsan");
    }
}
