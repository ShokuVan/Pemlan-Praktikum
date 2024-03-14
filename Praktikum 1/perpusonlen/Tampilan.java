package perpusonlen;
import java.util.Scanner;

public class Tampilan {
    private Perpustakaan perpustakaan;

    public Tampilan() {
        perpustakaan = new Perpustakaan();
    }

    public void tampilkanMenuUtama() {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Selamat datang di Perpustakaan Kampus X");
            System.out.println("Pilih kategori buku:");
            System.out.println("1. Teknologi");
            System.out.println("2. Filsafat");
            System.out.println("3. Sejarah");
            System.out.println("4. Agama");
            System.out.println("5. Psikologi");
            System.out.println("6. Politik");
            System.out.println("7. Fiksi");
            System.out.println("0. Keluar");

            System.out.print("Masukkan pilihan Anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    tampilkanBuku(pilihan);
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan layanan perpustakaan.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihan != 0);
    }

    private void tampilkanBuku(int kategori) {
        perpustakaan.tampilkanBuku(kategori);
        Scanner scanner = new Scanner(System.in);
        int pilihanBuku;

        System.out.print("Masukkan nomor buku yang ingin Anda pinjam (0 untuk kembali): ");
        pilihanBuku = scanner.nextInt();

        if (pilihanBuku >= 1 && pilihanBuku <= 5) {
            String judulBuku = perpustakaan.getJudulBuku(kategori, pilihanBuku);
            System.out.println("Anda memilih buku: " + judulBuku);
        } else if (pilihanBuku != 0) {
            System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
        }
    }

    private void tampilkanMenuTambahan() {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu Tambahan:");
            System.out.println("1. Kembali ke menu utama");
            System.out.println("2. Keluar dari sistem");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanMenuUtama();
                    break;
                case 2:
                    System.out.println("Terima kasih telah menggunakan layanan perpustakaan.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihan != 1 && pilihan != 2);
    }
}
