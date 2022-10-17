package UTS;

import java.util.Scanner;

class metode{
    public double iniberat,initinggi;

    public void inidata(){
        Scanner masuk = new Scanner(System.in);

        System.out.print("Berapa Berat Badan Anda (kg) : ");
        iniberat = masuk.nextDouble();
        System.out.print("Berapa Tinggi Badan Anda (m) : ");
        initinggi = masuk.nextDouble();
    }

    public double rumus(){
        return iniberat / initinggi * initinggi;
    }

    public void ukuran(){
        if (rumus() >= 22.9 ) {System.out.println("Anda Overweight,batasi asupan kalori");}
        else if (rumus() < 18.5 ) {System.out.println("Anda Underweight,tingkatkan asupan kalori");}
        else {System.out.println("Anda Ideal,tetap jaga asupan kalori");}
    }
}

public class iniNomer2 {
    public static void main(String[] args) {
        metode sangatsulit = new metode();
        System.out.println("--------------------------------------");
        System.out.println("KALKULATOR BMI");
        System.out.println("--------------------------------------");
        sangatsulit.inidata();
        sangatsulit.ukuran();
        System.out.println("--------------------------------------");
        System.out.println("Programmed by Ihsan");
    }
}
