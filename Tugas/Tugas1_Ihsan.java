package Tugas;

import java.util.Scanner;

public class Tugas1_Ihsan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nim, nama, prodi, tahun;
        int nilaiPresensi, nilaiTugas, nilaiUts, nilaiUas;
        double nilaiAkhir;
        char gradeHuruf;

        System.out.println("------------------------------------------------------------");
        System.out.println("Input data");
        System.out.println("------------------------------------------------------------");

    //Input data
        System.out.print("Masukkan NIM   : ");
        nim = sc.nextLine();
        System.out.print("Masukkan Nama  : ");
        nama = sc.nextLine();
        System.out.println("\nMasukkan nilai Mata Kuliah Pemrograman Berorientasi Object :\n");
        System.out.print("Nilai Presensi : ");
        nilaiPresensi = sc.nextInt();
        System.out.print("Nilai Tugas    : ");
        nilaiTugas = sc.nextInt();
        System.out.print("Nilai UTS      : ");
        nilaiUts = sc.nextInt();
        System.out.print("Nilai UAS      : ");
        nilaiUas = sc.nextInt();

    //Substring
        if (nim.startsWith("071", 4)) {
            prodi = "Informatika";
        } else {
            prodi = "Tidak Tersedia";
        }

        tahun = nim.substring(0, 4);

    //Nilai akhir
        nilaiAkhir = (nilaiPresensi * 0.1) + (nilaiTugas * 0.2) + (nilaiUts * 0.3) + (nilaiUas * 0.4);

    //Grade huruf
        if (nilaiAkhir >= 80){
            gradeHuruf = 'A';
        } else if (nilaiAkhir >= 70) {
            gradeHuruf = 'B';
        } else if (nilaiAkhir >= 60) {
            gradeHuruf = 'C';
        } else if (nilaiAkhir >= 50) {
            gradeHuruf = 'D';
        } else {
            gradeHuruf = 'E';
        }

    //Output data
        System.out.println("\n");
        System.out.println("------------------------------------------------------------");
        System.out.println("Nilai Mata Kuliah Pemrograman Berorientasi Object : ");
        System.out.println("------------------------------------------------------------");
        System.out.println("NIM            : " + nim);
        System.out.println("Nama           : " + nama);
        System.out.println("Prodi          : " + prodi);
        System.out.println("Angkatan       : " + tahun);

    //Output nilai
        System.out.println("Nilai Presensi : " + nilaiPresensi);
        System.out.println("Nilai Tugas    : " + nilaiTugas);
        System.out.println("Nilai UTS      : " + nilaiUts);
        System.out.println("Nilai UAS      : " + nilaiUas);
        System.out.println("Nilai Akhir    : " + nilaiAkhir);
        System.out.println("Grade          : " + gradeHuruf);
    }
}
