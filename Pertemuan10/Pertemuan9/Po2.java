package Pertemuan9;

public class Po2 extends Po1{
    public Po2(){
        super();
        System.out.println("ini adalah constructor anak");
    }

    public void information(){
        System.out.println("Nama "+this.nama);
    }

    public void makan() {
        super.makan();
        System.out.println("Saya suka makan orang");
    }
}
