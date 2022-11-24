import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P_CRUD {
    public static void main(String[] args) throws IOException {

        Scanner masuk = new Scanner(System.in);
        String iniPilihan;

        boolean lanjutan = true;
        while (lanjutan) {
            clearScreen();
            System.out.println("Perpustakaan Al-Maktabah\n");
            System.out.println("1.\tLihat seluruh buku");
            System.out.println("2.\tCari buku");
            System.out.println("3.\tTambah buku");
            System.out.println("4.\tUbah data");
            System.out.println("5.\tHapus data");

            System.out.print("\n\nPilihan anda: ");
            iniPilihan = masuk.next();

            switch (iniPilihan) {
                case "1" -> {
                    System.out.println("\n=================");
                    System.out.println("DAFTAR BUKU");
                    System.out.println("=================");
                    tampilkanData();
                }
                case "2" -> {
                    System.out.println("\n=========");
                    System.out.println("CARI BUKU");
                    System.out.println("=========");
                }
                case "3" -> {
                    System.out.println("\n================");
                    System.out.println("TAMBAH BUKU");
                    System.out.println("================");
                }
                case "4" -> {
                    System.out.println("\n==============");
                    System.out.println("UBAH DATA");
                    System.out.println("==============");
                }
                case "5" -> {
                    System.out.println("\n===============");
                    System.out.println("HAPUS DATA");
                    System.out.println("===============");
                }
                // hapus data
                default -> System.err.println("\nPilihan anda tidak sesuai\nSilahkan pilih [1-5]");
            }

            lanjutan = getYesorNo();
        }
    }

    private static void tampilkanData() throws IOException{

        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("alkitaabun.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception e){
            System.err.println("Database Tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahoeloe");
            return;
        }

        System.out.println("\n| No |\tTahun |\tPenulis                  |\tPenerbit               |\tJudul Buku");
        System.out.println("=========================================================================================================");

        String data = bufferInput.readLine();
        int nomorData = 0;
        while(data != null) {
            nomorData++;

            StringTokenizer stringToken = new StringTokenizer(data, ",");

            stringToken.nextToken();
            System.out.printf("| %2d ", nomorData);
            System.out.printf("|\t%4s  ", stringToken.nextToken());
            System.out.printf("|\t%-20s   ", stringToken.nextToken());
            System.out.printf("|\t%-20s   ", stringToken.nextToken());
            System.out.printf("|\t%s   ", stringToken.nextToken());
            System.out.print("\n");

            data = bufferInput.readLine();
        }

        System.out.println("=========================================================================================================");
    }

    private static boolean getYesorNo(){
        Scanner masuk = new Scanner(System.in);
        System.out.print("\n"+ "Anda ingin melanjutkan" +" (y/n)? ");
        String iniPilihan = masuk.next();

        while(!iniPilihan.equalsIgnoreCase("y") && !iniPilihan.equalsIgnoreCase("n")) {
            System.err.println("Pilihan anda tidak sesuai");
            System.out.print("\n"+ "Anda ingin melanjutkan" +" (y/n)? ");
            iniPilihan = masuk.next();
        }

        return iniPilihan.equalsIgnoreCase("y");
    }

    private static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception ex){
            System.err.println("error");
        }
    }
}