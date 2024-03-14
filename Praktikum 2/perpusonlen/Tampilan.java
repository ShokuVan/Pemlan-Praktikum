package perpusonlen;

import java.util.Scanner;

public class Tampilan {
    private Perpustakaan perpustakaan;

    public Tampilan(Perpustakaan perpustakaan) {
        this.perpustakaan = perpustakaan;
    }

            public void tampilkanMenuKategori() {
                System.out.print("\n" +
                "===========================\n" +
                "Perpustakaan Online\n" +
                "by Ivani Quintania Parhusip\n" +
                "===========================\n");
                System.out.println("Selamat datang di Perpustakaan Online");
                System.out.println("Berikut beberapa kategori buku yang tersedia. Pilih kategori buku:");   
            System.out.println("Pilih kategori buku:");
            System.out.println("1. Teknologi");
            System.out.println("2. Filsafat");
            System.out.println("3. Sejarah");
            System.out.println("4. Agama");
            System.out.println("5. Psikologi");
            System.out.println("6. Politik");
            System.out.println("7. Fiksi");
            System.out.println("0. Keluar");
            }

             public void tampilkanDetailBuku(int kategori) {
        System.out.println("Daftar buku kategori " + getKategori(kategori) + ":");

        for (int i = 0; i < perpustakaan.getJumlahBuku(kategori); i++) {
            String judul = perpustakaan.getJudulBuku(kategori, i + 1);
            String penulis = perpustakaan.getPenulisBuku(kategori, i + 1);
            String sinopsis = perpustakaan.getSinopsisBuku(kategori, i + 1);

            System.out.println("Judul: " + judul);
            System.out.println("Penulis: " + penulis);
            System.out.println("Sinopsis: " + sinopsis);
            System.out.println();
        }
    }

    private String getKategori(int kategori) {
        switch (kategori) {
            case 1:
                return "Teknologi";
            case 2:
                return "Filsafat";
            case 3:
                return "Sejarah";
            case 4:
                return "Agama";
            case 5:
                return "Psikologi";
            case 6:
                return "Politik";
            case 7:
                return "Fiksi";
            default:
                return "";
        }
    }

    public void jalankanSistem() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            tampilkanMenuKategori();
            System.out.print("Pilih kategori buku (1-7) atau 0 untuk keluar: ");
            int pilihanKategori = scanner.nextInt();

            if (pilihanKategori == 0) {
                System.out.println("Terima kasih telah menggunakan sistem Perpustakaan Online. Sampai jumpa!");
                break;
            } else if (pilihanKategori >= 1 && pilihanKategori <= 7) {
                tampilkanDetailBuku(pilihanKategori);

                System.out.print("Pilih nomor buku yang ingin dipinjam: ");
                int nomorBuku = scanner.nextInt();

                if (nomorBuku >= 1 && nomorBuku <= perpustakaan.getJumlahBuku(pilihanKategori)) {
                    String judul = perpustakaan.getJudulBuku(pilihanKategori, nomorBuku);
                    String penulis = perpustakaan.getPenulisBuku(pilihanKategori, nomorBuku);

                    System.out.println("Anda meminjam buku " + judul + " - " + penulis);
                    
                    System.out.println("1. Kembali ke menu utama");
                    System.out.println("2. Keluar");
                    System.out.print("Pilihan Anda: ");
                    int pilihan = scanner.nextInt();

                    if (pilihan == 1) {
                        continue;
                    } else if (pilihan == 2) {
                        System.out.println("Terima kasih telah menggunakan sistem Perpustakaan Online. Sampai jumpa!");
                        break;
                    } else {
                        System.out.println("Pilihan tidak valid.");
                        break;
                    }
                } else {
                    System.out.println("Nomor buku tidak valid.");
                    break;
                }
            } else {
                System.out.println("Pilihan kategori tidak valid.");
                break;
            }
        }

        scanner.close();
    }
}