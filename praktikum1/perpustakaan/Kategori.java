package praktikum1.perpustakaan;

public class Kategori {
    public static String namaKategori;

    public static String[][] getBuku(int kategori) {
        switch (kategori) {
            case 1:
                namaKategori = "Teknologi";
                return Perpustakaan.Teknologi;
            case 2:
                namaKategori = "Filsafat";
                return Perpustakaan.Filsafat;
            case 3:
                namaKategori = "Sejarah";
                return Perpustakaan.Sejarah;
            case 4:
                namaKategori = "Agama";
                return Perpustakaan.Agama;
            case 5:
                namaKategori = "Psikologi";
                return Perpustakaan.Psikologi;
            case 6:
                namaKategori = "Politik";
                return Perpustakaan.Politik;
            case 7:
                namaKategori = "Fiksi";
                return Perpustakaan.Fiksi;
            default:
                return null;
        }
    }

    public static void TampilkanBukuBerdasarkanKategori(int indeksKategori) {
        String[][] kategoriTerpilih = getBuku(indeksKategori);

        System.out.println("\nBerikut adalah daftar judul buku dalam kategori:\n");

        for (String[] buku : kategoriTerpilih) {
            System.out.printf("Judul\t\t:%s\n", buku[0]);
            System.out.printf("Penulis\t\t:%s\n", buku[1]);
            System.out.printf("Tahun terbit\t:%s\n", buku[2]);
            System.out.printf("Jumlah Halaman\t:%s\n", buku[3]);
            System.out.println("---------------------------------------------------------------");
        }
    }
}
