package Praktikum4.Modul5;

public class Manager {
        private Pekerja pekerja;
        private String departemen;
    
        public Manager(String departemen, double gaji, int tahun, int bulan, int tanggal, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
            this.pekerja = new Pekerja(gaji, tahun, bulan, tanggal, jumlahAnak, nama, nik, jenisKelamin, menikah);
            this.departemen = departemen;
        }
    
        public void setDepartemen(String departemen) {
            this.departemen = departemen;
        }
    
        public String getDepartemen() {
            return departemen;
        }
    
        public double getPendapatan() {
            return pekerja.getPendapatan() + (0.10 * pekerja.getGaji());
        }
    
        public String toString() {
            return String.format("Nama          : %s\nNIK           : %s\nJenis Kelamin : %s\nPendapatan    : $%.1f\nTahun Masuk   : %s\nJumlah Anak   : %d\nGaji          : $%.1f\nDepartemen    : %s\n", pekerja.getNama(), pekerja.getNik(), pekerja.getJenisKelamin() ? "Laki-laki" : "Perempuan", getPendapatan(), pekerja.getTahunMasuk(), pekerja.getJumlahAnak(), pekerja.getGaji(), departemen);
        }
    }
    
