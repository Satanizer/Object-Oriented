class Mobil {
    //Atribute
    private boolean brake = false;
    private String name;
    //method
    public void brakeOn(){
        this.brake = true;
        System.out.println("Mobil " + this.name);
        System.out.println("Status Rem = " + this.brake);
    }
    public void brakeOff() {
        this.brake = false;
        System.out.println("Mobil " + this.name);
        System.out.println("Status Rem = " + this.brake);
    }
    public void setNama(String name) {
        this.name = name;
    }
}
