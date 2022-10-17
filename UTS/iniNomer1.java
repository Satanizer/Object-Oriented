package UTS;

import java.util.Scanner;

class cara {
    public int inijam,inimenit,inidetik;

    public void inidata(){
        Scanner masuk = new Scanner(System.in);

        System.out.print("Berapa Jam Anda Menelpon : ");
        inijam = masuk.nextInt();
        System.out.print("Berapa Menit Anda Menelpon : ");
        inimenit = masuk.nextInt();
        System.out.print("Berapa Detik Anda Menelpon : ");
        inidetik = masuk.nextInt();
    }

    public double iniharga(){
        int range = inijam * 3600 + inimenit * 60 + inidetik;
        return (range / 5) * 150;
    }

    public void inikonversi(){
        System.out.printf("Total Waktu = %d jam , %d menit , %d detik", inijam, inimenit, inidetik);
    }
}

public class iniNomer1 {
    public static void main(String[] args) {
        cara sulit = new cara();
        sulit.inidata();
        System.out.println("--------------------------------------");
        sulit.inikonversi();
        System.out.println("\nTotal Biaya percakapan = Rp." + sulit.iniharga());
        System.out.println("--------------------------------------");
        System.out.println("Programmed by Ihsan");
    }
}
