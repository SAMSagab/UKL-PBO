import java.util.ArrayList;

public class Petugas implements User{//enkap polimor

    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    //enkap
    public Petugas(){
        this.namaPetugas.add("Administrator X");
        this.alamat.add("Mars");
        this.telepon.add("089****");

        this.namaPetugas.add("Administrator Y");
        this.alamat.add("Jupiter");
        this.telepon.add("081*****");
    }

    @Override
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }
    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }
    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
    @Override
    public String getNama(int id) {
        return this.namaPetugas.get(id);
    }
    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }
    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }

    public void tampilPetugas(){
        int n = this.namaPetugas.size();
        for(int i=0;i<n;i++){
            System.out.println("------------------------");
            System.out.println("Nama    = "+getNama(i));
            System.out.println("Alamat  = "+getAlamat(i));
            System.out.println("Telepon = "+getTelepon(i));
        }
    }
}
