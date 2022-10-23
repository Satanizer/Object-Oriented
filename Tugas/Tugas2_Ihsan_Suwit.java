package Tugas;

import java.util.Scanner;

public class Tugas2_Ihsan_Suwit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //deklarasi
        String anda = "null";
        String hasil = "null";
        String komputer;
        int pilih;

        System.out.println("------------------------------------");
        System.out.println("PERMAINAN SUIT");
        System.out.println("------------------------------------");
        System.out.println("PILIH KARAKTER ANTUM!");
        System.out.println("1 = Gajah 2 = Jerapah 3 = Semut");

        //input
        System.out.print("= ");
        pilih = sc.nextInt();
        System.out.println("------------------------------------");

        //Metode
        if (pilih == 1) {
            anda = "Gajah";
        } else if (pilih == 2) {
            anda = "Jerapah";

        } else if (pilih == 3) {
            anda = "Semut";

        } else {
            System.out.println("Laen");
        }

        int generate = (int)(Math.random()*5+1);
        if (generate == 1) {
            komputer = "Gajah";
        } else if (generate == 2) {
            komputer = "Jerapah";
        } else {
            komputer = "Semut";
        }

        if (pilih < 1 || pilih > 4)
        {
            System.out.println("Laen");
        } else if (anda.equals(komputer)) {
            hasil = "Seri";
        } else if (anda.equals("Gajah") && komputer.equals("Semut")) {
            hasil = "Yahahahaha Kalah";
        } else if (anda.equals("Gajah")) {
            hasil = "Menang Cuyy";
        } else if (anda.equals("Semut") && komputer.equals("Jerapah")) {
            hasil = "Yahahahaha Kalah";
        } else if (anda.equals("Semut")) {
            hasil = "Menang Cuyy";
        } else if (anda.equals("Jerapah") && komputer.equals("Semut")) {
            hasil = "Menang Cuyy";
        } else if (anda.equals("Jerapah")) {
            hasil = "Yahahahaha Kalah";
        }

        //Output
        System.out.println("ANTUM : "+anda);
        System.out.println("KOMPUTER : "+komputer);
        System.out.println("HASIL : "+hasil);
    }
}