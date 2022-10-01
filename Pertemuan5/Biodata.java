class Biodata {

    private String nama;
    private String NIM;
    private int umur;
    private String jenisKelamin;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public int getUmur() {
        return umur; 
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin; 
    }

    public void setJenisKelamin(String jenisKelamin) {
        if (jenisKelamin.toLowerCase().equals("l")) {
            this.jenisKelamin = "laki-laki";
        } else if (jenisKelamin.toLowerCase().equals("p")){
            this.jenisKelamin = "perempuan";
        } else {
            this.jenisKelamin = "LAEN";
        }
    }

    public static void main(String[] args) {
        Biodata biodata = new Biodata();
        biodata.setNama("Almond");
        biodata.setNIM("2021071005");
        biodata.setJenisKelamin("L");
        biodata.setUmur(19);
        
        System.out.println("NIM: " + biodata.getNIM());
        System.out.println("Nama: " + biodata.getNama());
        System.out.println("Jenis kelamin: " + biodata.getJenisKelamin());
        System.out.println("Umur: " + biodata.getUmur());
    }
}