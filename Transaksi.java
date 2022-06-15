import java.util.ArrayList;


public class Transaksi {
    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    private ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();

    public jenisLaundry laundry = new jenisLaundry();

    public int size() {
        return this.idClient.size();
    }


    public Transaksi() {
        this.idClient.add(55555);
        this.idClient.add(20000);
        for (int i = 0; i < laundry.size(); i++) {
            this.idJenisLaundry.add(i);
        }
    }

    public void setIDClient(int id) {
        this.idClient.add(id);
    }

    public void setIDJenisLaundry(int id) {
        this.idJenisLaundry.add(id);
    }

    public void setBanyak(int banyak) {
        this.banyak.add(banyak);
    }

    public int getClient(int id) {
        return this.idClient.indexOf(id);
    }

    public int getIDClient(int id) {
        return this.idClient.get(id);
    }

    public int getIDJenisLaundry(int id) {
        return this.idJenisLaundry.get(id);
    }

    public int getBanyak(int id) {
        return this.banyak.get(id);
    }

    public int getIDBanyak(int banyak) {
        return this.banyak.indexOf(banyak);
    }
}
