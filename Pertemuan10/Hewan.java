package Pertemuan10;

public interface Hewan {
    public void suara();
    public void tidur();
}
class Ayam implements Hewan {
    @Override
    public void suara() {
        System.out.println("Ayam Bersuara : Petok-Petok");
    }

    @Override
    public void tidur() {
        System.out.println("Ayam Sedang Tidur");
    }
}
