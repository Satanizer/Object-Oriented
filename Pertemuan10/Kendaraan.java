package Pertemuan10;

abstract class Kendaraan {
    public abstract void remtangan();
    public abstract void setir(String arah);
    public abstract void rem();

    //regular method
    public void hazard(String arah){
        if (arah.equals("bunyi")) {
            System.out.println("Hazard Berbunyi");
        }
    }
}
