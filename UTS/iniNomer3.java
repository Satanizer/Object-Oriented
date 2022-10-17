package UTS;

import java.util.Scanner;

class model {
    int inijumlah,ininilai;

    public void iniloop(){
        Scanner sc = new Scanner(System.in);

        for(int loop = 0; loop <= 9; ++loop)
        {
            System.out.print("Masukkan Nilai Untuk Penjumlahan Perulangan : ");
            ininilai = sc.nextInt();
            inijumlah = inijumlah + ininilai;
        }
    }
}

public class iniNomer3 {
    public static void main(String[] args) {
        model ekstrasulit = new model();
        ekstrasulit.iniloop();
        System.out.println("------------------------------------------- +");
        System.out.println("Hasil Penjumlahan Perulangan : " +ekstrasulit.inijumlah);
        System.out.println("-------------------------------------------");
        System.out.println("Programmed by Ihsan");
    }
}