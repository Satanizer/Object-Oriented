package TugasUTS;

import java.util.Scanner;

public class nilaiMahasiswa {
    public String huruf;
    public String Grade(){return this.huruf;}

    public nilaiMahasiswa(double nilaiAkhir) {
        if (nilaiAkhir >= 90){this.huruf = "A";}
        else if (nilaiAkhir >= 80 ){this.huruf = "A-";}
        else if (nilaiAkhir >= 75 ){this.huruf = "B+";}
        else if (nilaiAkhir >= 70 ){this.huruf = "B";}
        else if (nilaiAkhir >= 65 ){this.huruf = "B-";}
        else if (nilaiAkhir >= 60 ){this.huruf = "C+";}
        else if (nilaiAkhir >= 55 ){this.huruf = "C";}
        else if (nilaiAkhir >= 50 ){this.huruf = "C-";}
        else if (nilaiAkhir >= 40 ){this.huruf = "D";}
        else {this.huruf = "E";}
    }

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        //INPUTNILAI
        System.out.print("Input Nilai Anda: ");
        double nilai = input.nextDouble();

        //OUTPUT NILAI
        nilaiMahasiswa iniHuruf = new nilaiMahasiswa(nilai);

        System.out.println("Nilai Angka Anda : " +nilai);
        System.out.println("Grade Anda       : " +iniHuruf.Grade());

        input.close();
    }
}
