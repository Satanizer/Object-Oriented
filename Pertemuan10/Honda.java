package Pertemuan10;

public class Honda extends Kendaraan {
    public void remtangan(){
        System.out.println("Rem Tangan Digunakan");
    }

    @Override
    public void rem() {
        System.out.println("Rem Digunakan");
    }

    @Override
    public void setir(String arah) {
        switch (arah) {
            case "kiri" -> System.out.println("Belok Kiri");
            case "kanan" -> System.out.println("Belok Kanan");
            case "maju" -> System.out.println("Lurus Maju");
            case "mundur" -> System.out.println("Lurus Mundur");
        }
    }
}
