package praktikum1.perpustakaan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean keluar = false;
        Scanner scanner = new Scanner(System.in);

        do {
            Tampilan.Kategori(); // Menampilkan semua kategori buku

            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 8:
                    keluar = true;
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    Tampilan.Kategori(pilihan);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }

            if (pilihan != 8) {
                    keluar = true;
            }
        } while (!keluar);

        System.out.println("\nTerima kasih telah menggunakan sistem ini");
        System.out.println("---------------------------------------------------------------");
        scanner.close();
    }
}
