package TugasUTS;

import java.util.Scanner;

class method2 {
    public int online,gaming,writing,scanning,printBlack,printColor,tehBotol;

    public double harga() {
        double i = tehBotol * 3000 + printBlack * 300 + printColor * 500 + scanning * 1000;
        double j = writing  * 2000 + online  * 4000 + gaming * 5000;
        return i + j;
    }

    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.print("Writing/jam : ");
        writing = input.nextInt();
        System.out.print("Online/jam : ");
        online = input.nextInt();
        System.out.print("Gaming/jam : ");
        gaming = input.nextInt();
        System.out.print("Print Hitam/lembar : ");
        printBlack = input.nextInt();
        System.out.print("Print warna/lembar : ");
        printColor = input.nextInt();
        System.out.print("Scan/file : ");
        scanning = input.nextInt();
        System.out.print("Teh Botol/botol : ");
        tehBotol = input.nextInt();
    }
}

public class waroengInternet {
    public static void main(String[] args) {
        System.out.println("\n==========WARNET SUKAK KAU==========\n");
        method2 lebihsusah = new method2();
        lebihsusah.input();
        System.out.println("Total Biaya Keseluruhan = Rp. " +lebihsusah.harga());
    }
}