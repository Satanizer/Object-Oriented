package TugasUTS;

import java.util.Scanner;

class LuasSegitiga {
    public int height,base;

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

public class Segitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LuasSegitiga luassegitiga = new LuasSegitiga();

        System.out.println("========== Luas Segitiga ==========");
        System.out.print("Input Alas  : ");
        luassegitiga.setBase(input.nextInt());
        System.out.print("Input Tinggi  : ");
        luassegitiga.setHeight(input.nextInt());

        //Output Luas Segitiga
        luassegitiga.Luas();

        input.close();
    }
}
