package Praktikum4.Modul5;
import java.time.LocalDate;

public class Pekerja {
    private String nama;
    private String nik;
    private boolean jenisKelamin;
    private boolean menikah;
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int tahun, int bulan, int tanggal, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahun, bulan, tanggal);
        this.jumlahAnak = jumlahAnak;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setTahunMasuk(int tahun, int bulan, int tanggal) {
        this.tahunMasuk = LocalDate.of(tahun, bulan, tanggal);
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public boolean getJenisKelamin() {
        return jenisKelamin;
    }

    public boolean getMenikah() {
        return menikah;
    }

    public double getGaji() {
        return gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public double getBonus() {
        int tahun = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (tahun >= 0 && tahun <= 5) {
            return 0.05 * gaji;
        } else if (tahun > 5 && tahun <= 10) {
            return 0.10 * gaji;
        } else if (tahun > 10) {
            return 0.15 * gaji;
        } else {
            return 0;
        }
    }

    public double getPendapatan() {
        double tunjangan = (menikah && !jenisKelamin) ? 25 : (menikah && jenisKelamin) ? 20 : 15;
        return tunjangan + gaji + getBonus() + (jumlahAnak * 20);
    }

    public String toString() {
        return String.format("Nama          : %s\nNIK           : %s\nJenis Kelamin : %s\nPendapatan    : $%.1f\nTahun Masuk   : %s\nJumlah Anak   : %d\nGaji          : $%.1f\n", nama, nik, jenisKelamin ? "Laki-laki" : "Perempuan", getPendapatan(), tahunMasuk, jumlahAnak, gaji);
    }
}

