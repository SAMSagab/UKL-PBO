import java.util.ArrayList;

public class jenisLaundry {
    private ArrayList<String> jenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();
    //modifier

    public int size() {//memanggil   nilai arraylist
        return this.jenisLaundry.size();
    }

//penerapan inheritance
    public jenisLaundry() {
        this.jenisLaundry.add("Cuci Kering");
        this.harga.add(3000);
        this.durasi.add(60);

        this.jenisLaundry.add("Cuci Lipat");
        this.harga.add(4000);
        this.durasi.add(70);

        this.jenisLaundry.add("Cuci Setrika");
        this.harga.add(6000);
        this.durasi.add(80);

        this.jenisLaundry.add("Cuci Karpet");
        this.harga.add(10000);
        this.durasi.add(120);
    }

    //enkapsulasi
    //inheritance
    public void setLaundry(String jenis) {
        this.jenisLaundry.add(jenis);
    }
    public void setHarga(int harga) {
        this.harga.add(harga);
    }
    public void setDurasi(int durasi) {
        this.durasi.add(durasi);
    }
    public String getLaundry(int id) {
        return this.jenisLaundry.get(id);
    }
    public int getHarga(int id) {
        return this.harga.get(id);
    }
    public int getDurasi(int id) {
        return this.durasi.get(id);
    }
//void tidak memerluka method return
}
