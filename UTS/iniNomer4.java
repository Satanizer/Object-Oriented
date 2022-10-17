package UTS;

import java.util.Scanner;

class rumus{
    double inikeliling,iniluas,inijari,phi = 3.14;

    public void setInijari(){
        Scanner masuk = new Scanner(System.in);

        System.out.print("Masukkan Jari-Jari Lingkaran Sesuka Anda : ");
        inijari = masuk.nextDouble();
    }

    public double iniLuasLingkaran(){
        iniluas = phi * inijari * inijari;
        return iniluas;
    }

    public double iniKelilingLingkaran(){
        inikeliling = 2 * phi * inijari;
        return inikeliling;
    }
}

public class iniNomer4 {
    public static void main(String[] args) {
        rumus ultrasulit = new rumus();
        ultrasulit.setInijari();
        System.out.println("--------------------------------------");
        System.out.println("Luas Lingkaran Adalah : " +ultrasulit.iniLuasLingkaran() );
        System.out.println("Keliling Lingkaran Adalah : " +ultrasulit.iniKelilingLingkaran() );
        System.out.println("--------------------------------------");
        System.out.println("Programmed by Ihsan");
    }
}
