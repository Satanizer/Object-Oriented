package Pertemuan10;

public class Bilangan {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void main(String[] args) {
        try {
            Bilangan bilangan = new Bilangan();
            int i[] = {2,0,4};
            double hasil = 0;
            bilangan.setA(10);
            bilangan.setB(0);

            hasil = bilangan.getA() / i[3];
            System.out.println("Hasil : " + hasil);
        }
        catch (ArithmeticException e) {
            System.out.println("maaf sebuah Bilangan tidak dapat dibagi dengan nol : "+e);
        }
        catch (Exception e) {
            System.out.println("Error di Array : " + e.getMessage());
        }
        finally {
            System.out.println("blok program yang tepat dijalankan");
        }
    }
}
