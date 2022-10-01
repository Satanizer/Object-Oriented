import java.util.Scanner;

class LuasLingkaran {
    private int jari;
    public void setRadius(int radius) {
        this.jari = radius;
    }

    public void Luas() {
        double luas = 3.14 * jari * jari; 
        System.out.printf("Luas lingkaran : %.2f", luas);
    }
}


class LuasSegitiga {
    private int height;
    private int base;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
    public void Luas() {
        double luas = 0.5 * base * height; 
        System.out.printf("Luas segitiga : %.2f\n", luas);
    }
}

public class LSegitigaLingkaran {
    public static void main(String[] args) {
        //Input Scanner
        Scanner input = new Scanner(System.in);
        //Luas Segitiga
        LuasSegitiga luassegitiga = new LuasSegitiga();
        //Input Luas Segitiga
        System.out.println("\n========== Luas Segitiga ==========\n");
        System.out.print("Input Alas  : ");
        luassegitiga.setBase(input.nextInt());

        System.out.print("Input Tinggi  : ");
        luassegitiga.setHeight(input.nextInt());
        //Output Luas Segitiga
        luassegitiga.Luas();

        //Luas Lingkaran
        LuasLingkaran luaslingkaran = new LuasLingkaran();
        //Input Luas Lingkaran
        System.out.println("\n========== Luas Lingkaran ==========\n");
        System.out.print("Masukan Radius Lingkaran : ");
        luaslingkaran.setRadius(input.nextInt());
        //Output Luas Lingkaran
        luaslingkaran.Luas(); 

        input.close();
    }
}