package Tugas;

import java.util.Scanner;

public class Tugas2_Ihsan_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka;
        do{
            System.out.println("Masukkan Angka dari 1-10 : ");
            angka = sc.nextInt();
            if(angka <= 10 && angka >= 0) {
                System.out.println("Verified");
            } else {
                System.out.println("Angka yang dimasukkan tidak tepat");
            }
        } while (angka > 10 || angka < 0);
    }
}