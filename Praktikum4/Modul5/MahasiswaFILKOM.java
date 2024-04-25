package Praktikum4.Modul5;

public class MahasiswaFILKOM {
        private String nama;
        private String nik;
        private boolean jenisKelamin;
        private boolean menikah;
        private String nim;
        private double ipk;
    
        public MahasiswaFILKOM(String nama, String nik, boolean jenisKelamin, boolean menikah, String nim, double ipk) {
            this.nama = nama;
            this.nik = nik;
            this.jenisKelamin = jenisKelamin;
            this.menikah = menikah;
            this.nim = nim;
            this.ipk = ipk;
        }
    
        public MahasiswaFILKOM(String nama2, double d, String string, String string2, boolean b, boolean c) {
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
    
        public void setNim(String nim) {
            this.nim = nim;
        }
    
        public void setIpk(double ipk) {
            this.ipk = ipk;
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
    
        public String getNim() {
            return nim;
        }
    
        public double getIpk() {
            return ipk;
        }
    
        public String getStatus() {
            String angkatan = nim.substring(0, 2);
            String prodi = nim.substring(6, 7);
            if(prodi.equals("2")) {
                return "Teknik Informatika, " + "20" + angkatan;
            } else if(prodi.equals("3")) {
                return "Teknik Komputer, " + "20" + angkatan;
            } else if(prodi.equals("4")) {
                return "Sistem Informasi, " + "20" + angkatan;
            } else if(prodi.equals("6")) {
                return "Pendidikan Teknologi Informasi, " + "20" + angkatan;
            } else {
                return "Teknologi Informasi, " + "20" + angkatan;
            }
        }
    
        public double getBeasiswa() {
            if (ipk >= 3.5 && ipk <= 4.0) {
                return 75;
            } else if (ipk >= 3.0 && ipk < 3.5) {
                return 50;
            } else {
                return 0;
            }
        }
    
        public double getPendapatan() {
            double tunjangan = (menikah && !jenisKelamin) ? 25 : (menikah && jenisKelamin) ? 20 : 15;
            return tunjangan + getBeasiswa();
        }
    
        public String toString() {
            return String.format("Nama          : %s\nNIK           : %s\nJenis Kelamin : %s\nPendapatan    : $%.1f\nNIM           : %s\nIPK           : %.2f\nStatus        : %s\n", getNama(), getNik(), getJenisKelamin() ? "Laki-laki" : "Perempuan", getPendapatan(), getNim(), getIpk(), getStatus());
        }
    }
