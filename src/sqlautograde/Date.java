package sqlautograde;

public class Date {
    private int tanggal;
    private int bulan;
    private int tahun;

    public Date(int hari, int bulan, int tahun) {
        this.tanggal = hari;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    public int getHari() {
        return tanggal;
    }

    public int getBulan() {
        return bulan;
    }

    public int getTahun() {
        return tahun;
    }

    public void setHari(int hari) {
        this.tanggal = hari;
    }

    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
}
