public class Anak extends Bapak {
    String nama = "Darman";
    int umur = 15;

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void Hasil(){ //penerapan inheritance
        System.out.println("Dia Orangnya Suka " + Sifat);
        System.out.println("Anak ini bernama: "+ this.nama);
        System.out.println("Anak ini berumur: "+ umur);
        System.out.println("Tinggi anak ini: "+ tinggi);
        super.hobby();
    }
}
