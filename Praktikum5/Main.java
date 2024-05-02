package Praktikum5;

public class Main {
    public static void main(String[] args) {
        Kue[] kueArray ={
            new KuePesanan("A", 10000, 150),
            new KuePesanan("J", 4000, 100),
            new KuePesanan("K", 5000, 300),
            new KuePesanan("L", 4500, 450),
            new KuePesanan("F", 30000, 200),
            new KuePesanan("G", 18000, 500), 
            new KuePesanan("N", 1000, 200),
            new KuePesanan("D", 9000, 150),
            new KuePesanan("Q", 15000, 10),
            new KuePesanan("R", 25000, 2),
            new KuePesanan("Q", 15000, 10),
            new KuePesanan("R", 25000, 2),
            new KueJadi("B", 2000, 25),
            new KueJadi("C", 7000, 15),
            new KueJadi("E", 50000, 3),
            new KueJadi("H",12000, 13),
            new KueJadi("I", 15000, 4),
            new KueJadi("M", 35000, 3),
            new KueJadi("O", 100000, 3),
            new KueJadi("P", 250000, 1),
            new KueJadi("S", 9500, 5),
            new KueJadi("T", 11000, 2)
        };

        System.out.println("========Daftar Kue========");
        for(int i = 0; i < kueArray.length; i++) {
            System.out.println(kueArray[i] + "\n");
        }

        double totalHargaPesanan = 0;
        double totalHargaJadi = 0;
        double totalBeratPesanan = 0;
        double totalJumlahJadi = 0;
        String jenisKue = " ";
        for (Kue kue : kueArray) {
            if(kue instanceof KuePesanan) {
                totalHargaPesanan += kue.hitungHarga();
                totalBeratPesanan += ((KuePesanan) kue).getBerat();
            } else {
                totalHargaJadi += kue.hitungHarga();
                totalJumlahJadi += ((KueJadi) kue).getJumlah();
            }
        }

        System.out.println("=============REKAP TOTAL HARGA=============");
        System.out.printf("Total Harga Semua Kue       : Rp%,.2f\n\n",(totalHargaPesanan + totalHargaJadi));
        System.out.printf("Total Harga Kue Pesanan     : Rp%,.2f\n", totalHargaPesanan);
        System.out.println("Total Berat Kue Pesanan     : " + totalBeratPesanan + " Gram\n");
        System.out.printf("Total Harga Kue Jadi        : Rp%,.2f\n", totalHargaJadi);
        System.out.println("Total Jumlah Kue Jadi       : " + totalJumlahJadi + " Buah\n");
        
        double hargaTertinggi = 0;
        String namaKue = " ";
        for(Kue kue : kueArray) {
            if(kue.hitungHarga() > hargaTertinggi) {
                hargaTertinggi = kue.hitungHarga();
                namaKue = kue.getNama();
                jenisKue = (kue instanceof KuePesanan) ? "Kue Pesanan" : "Kue Jadi";
            }
        }
        System.out.printf("Kue dengan Harga Tertinggi  : %s\nHarga Kue Tertinggi         : Rp%,.2f\n", namaKue, hargaTertinggi);
        System.out.println("Jenis Kue                   : " + jenisKue);
    }
}
    
