package Pertemuan9A;

public class Core {
    public static void main(String[] args) {
        bidangDatar BD = new bidangDatar();

        BD.s1mantap(10);
        BD.s2mantap(8);

        segitiga SG = new segitiga(BD.s1masuk(),BD.s2masuk());
        lingkaran LN = new lingkaran(BD.s2masuk());
    }
}
