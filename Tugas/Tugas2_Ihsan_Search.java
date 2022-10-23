package Tugas;

import java.util.Scanner;

public class Tugas2_Ihsan_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String penggalanKata,kalimat = "Kalau dilakukan dengan sepenuh hati maka besi batangan pun kalau digosok terus menerus akan menjadi jarum";

        do{ System.out.println("Input : ");
            penggalanKata = sc.nextLine();
                if (kalimat.contains(penggalanKata)){
                    System.out.println("Penggalan kata terdapat pada kalimat.");
                } else {
                    System.out.println("Penggalan kata tidak terdapat pada kalimat.");
                }
        } while (!kalimat.contains(penggalanKata));
    }
}
