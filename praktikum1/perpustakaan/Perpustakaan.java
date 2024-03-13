package praktikum1.perpustakaan;

public class Perpustakaan {
        public static String[][] Teknologi = {
            {"The Shallows karya Nicholas Carr (2010)"},
            {"Digital Minimalism", "Cal Newport"},
            {"The Great Shifting karya Rhenald Kasali"},
            {"Jurnalisme Era Digital karya Ignatius Haryanto (2014)"},
            {"Everybody Lies karya Seth Stephens-Davidowitz (2017)"}
        };
    
        public static String[][] Filsafat = {
            {"Loving The Wounded Soul karya Regis Machdy"},
            {"The Passions of The Soul karya René Descartes"},
            {"Introduction of Philosophy karya George Stuart Fullerton"},
            {"A History of Western Philosophy karya Bertrand Russell"},
            {"Beyond Good and Evil karya Friedrich Nietzche"}
        };
    
        public static String[][] Sejarah = {
            {"The Earth karya Arthur Beiser"},
            {"Sejarah Dunia yang Disembunyikan karya Jonathan"},
            {"Sejarah Dunia Lengkap karya Hutton Webster"},
            {"A Study of History karya Arnold J.Toynbee"},
            {"History of The World War karya Saut Pasaribu"}
        };
    
        public static String[][] Agama = {
            {"Santo Paulus : Rasul yang Dicela dan Dicintai karya Karen Armstrong"},
            {"The Mystery of Historical Jesus karya Louay Fatoohi"},
            {"Killing Jesus : A History karya Bill O'Reilly, Martin Dugard's"},
            {"Secrets of Divine Love: A Spiritual Journey into the Heart of Islam karya A. Helwa"},
            {"Why Buddhism Is True katya Robert Wright"}
        };
    
        public static String[][] Psikologi = {
            {"Mindset karya Carol S. Dweck"},
            {"The 7 Habits of Highly Effective People karya Stephen Covey"},
            {"The Power of Habit karya Charles Duhigg"},
            {"Emotional Intelligence karya Dan Goleman"},
            {"The Social Animal karya Elliot Aronson"}
        };
    
        public static String[][] Politik = {
            {"Negara dan Politik Kesejahteraan karya A. Muhaimin Iskandar"},
            {"Dramaturgi Politik Indonesia karya Muhamad Sulhan"},
            {"The Republic karya Plato"},
            {"The Social Contract karya Jean-Jacque Rosseau"},
            {"Politik Kuasa Media karya Noam Chomsky "}
        };
    
        public static String[][] Fiksi = {
            {"1984 karya Geroge Orwell"},
            {"Romeo & Juliet karya Shakespeare"},
            {"The Midnight Library karya Matt Haig"},
            {"Funiculi Funicula (Before the Coffee Gets Cold) karya Toshikazu Kawaguchi "},
            {"The Devotion of Suspect X karya Keigo Higashino"}
        };
    
        public static void tampilkanBukuBerdasarkanKategori(int indeksKategori) {
            String[][] kategoriTerpilih;
    
            switch (indeksKategori) {
                case 1:
                    kategoriTerpilih = Teknologi;
                    break;
                case 2:
                    kategoriTerpilih = Filsafat;
                    break;
                case 3:
                    kategoriTerpilih = Sejarah;
                    break;
                case 4:
                    kategoriTerpilih = Agama;
                    break;
                case 5:
                    kategoriTerpilih = Psikologi;
                    break;
                case 6:
                    kategoriTerpilih = Politik;
                    break;
                case 7:
                    kategoriTerpilih = Fiksi;
                    break;
                default:
                    System.out.println("Indeks kategori tidak valid.");
                    return;
            }
    
            System.out.println("\nBerikut adalah daftar buku dalam kategori:\n");
    
            for (String[] buku : kategoriTerpilih) {
                System.out.printf("Judul\t\t:%s\n", buku[0]);
                System.out.println("---------------------------------------------------------------");
            }
        }
}
