package praktikum1.perpustakaan;

public class Tampilan {
    public static void Kategori() {
        System.out.print("\n" +
                "===========================\n" +
                "Perpustakaan\n" +
                "by Ivani Quintania Parhusip\n" +
                "===========================\n" +
                "\n" +
                "Berikut kategori buku yang tersedia \n" +
                "1. Teknologi\n2. Filsafat\n3. Sejarah\n4. Agama\n5. Psikologi\n6. Politik\n7. Fiksi\n8. Keluar\nSilahkan input nomor pilihan Anda : ");
    }

    public static void Kategori(int kategori) {
        String[][] buku = Kategori.getBuku(kategori);
        System.out.println("\nBerikut adalah daftar judul buku dalam kategori " + Kategori.namaKategori + ":\n");
        for (int i = 0; i < buku.length; i++) {
            System.out.printf("Judul\t\t:%s\n", buku[i][0]);
        }
    }

    public static void All() {
        for (int i = 1; i < 7; i++) {
            Kategori(i);
        }
    }
}
