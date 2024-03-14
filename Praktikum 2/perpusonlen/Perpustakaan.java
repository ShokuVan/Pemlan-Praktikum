package perpusonlen;

public class Perpustakaan {
    private String[][][] buku;

    public Perpustakaan() {
        this.buku = new String[][][]{
        {{"The Shallows", "Nicholas Carr", "Internet memberikan kemudahan dan kesenangan, tapi juga mengorbankan kemampuan kita berpikir secara mendalam."}, {"Digital Minimalism", "Cal Newport", "Filosofi teknologi di mana Anda memfokuskan waktu online Anda pada beberapa aktivitas yang dipilih dengan cermat yang mendukung hal-hal yang Anda hargai."}, {"The Great Shifting", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", "Membahas gambaran tentang proyeksi kehidupan dan bisnis dalam sepuluh tahun kedepan"}, {"The Pragmatic Programmer", "Andrew Hunt, David Thomas", "Seorang pengembang perangkat lunak memutuskan untuk mempelajari bahasa pemrograman baru, teknik pemrograman (TDD, Pola Desain, paradigma pemrograman), atau teknik pemecahan masalah setiap tahun, memperluas pengetahuan dan keterampilan mereka."}, {"Head First Java", "Kathy Sierra, Bert Bates", "Dengan buku ini, Anda akan mempelajari bahasa Java dengan metode unik yang melampaui panduan cara kerja dan membantu Anda menjadi programmer hebat"}}, // Teknologi
        {{"Sophie's World", "Jostein Gaarder", "Membahas terkait sejarah filsafat hingga abad ke-20 melalui tokoh Sophie."}, {"Loving The Wounded Soul", "Regis Machdy", "Membahas tentang depresi secara komprehensif. Mulai dari aspek klinis sampai teori budayanya, faktor internal dan eksternal, serta higher meaning dari kehadiran depresi itu sendiri. tidak hanya menjadi panduan bagi orang dengan depresi"}, {"Tractatus Logico-Philosophicus", "Ludwig Wittgenstein", "Satu buku filsafat yang sangat penting di dalam perjalanan filsafat terutama soal teori makna di abad 20."}, {"The Passions of The Soul", "René Descartes", "Buku ini berisi diskusi mendalam tentang cara kerja emosi dan tempatnya dalam kehidupan manusia subjek yang semakin menarik minat para filsuf dan sejarawan intelektual dan budaya. Ini juga menetapkan pandangan etika yang telah dilihat sebagai reorientasi radikal filsafat moral."}, {"A History of Western Philosophy", "Bertrand Russell", "Sejarah Filsafat Barat dan kaitannya dengan kondisi sosio politik, zaman kuno hingga sekarang."}}, // Filsafat
        {{"A Short History of Nearly Everything", "Bill Bryson", "Buku ini mencakup sejarah dari Big Bang hingga penemuan mekanika kuantum, melalui evolusi dan geologi"}, {"Sejarah Dunia yang Disembunyikan", "Jonathan", "Buku ini mencakup berbagai aspek sejarah, dari mitologi Yunani dan Mesir kuno hingga cerita rakyat Yahudi, dan menunjukkan bahwa pengetahuan sejarah yang terlanjur mapan perlu dipikirkan kembali secara revolusioner."}, {"Guns, Germs, and Steel", "Jared Diamond", "Menjelaskan bagaimana perkembangan teknologi, penyakit, dan lingkungan mempengaruhi sejarah manusia, menyoroti bagaimana beberapa masyarakat Eurasia dan Afrika Utara berhasil bertahan dan menguasai masyarakat lain, tanpa mengutamakan superioritas intelektual, moral, atau genetik Eurasia"}, {"History of The World War", "Saut Pasaribu", "Merujuk pada konflik global yang melibatkan dua koalisi besar: Allies dan Central Powers, yang terjadi dari 28 Juli 1914 hingga 11 November 1918"}, {"Genghis Khan and the Making of the Modern World", "Jack Weatherford", "Menjelaskan bagaimana Genghis Khan dan Mongol memainkan peran penting dalam membentuk dunia modern."}}, // Sejarah
        {{"The Mystery of Historical Jesus", "Louay Fatoohi", "Mencakup penelitian tentang sejarah dan identitas sebenarnya dari Yesus Kristus, mencoba untuk memisahkan fakta historis dari interpretasi teologis dan agama."}, {"Secrets of Divine Love: A Spiritual Journey into the Heart of Islam", "A. Helwa", "Buku yang menggali ke dalam rahasia-rahasia spiritual Al-Quran, puisi dan cerita mistis dari nabi-nabi dan penguasa spiritual terbesar di dunia, untuk membantu pembaca memulai kembali keyakinan mereka, mengatasi keraguan, dan meningkatkan koneksi mereka dengan Tuhan."}, {"Why Buddhism Is True", "Robert Wright", "Penjelasan tentang doktrin dua kebenaran (two truths doctrine) dalam Buddhisme, yang membedakan antara kebenaran konvensional atau sementara (saṁvṛti) dan kebenaran akhir atau absolut (paramārtha)."}, {"The Tao Te Ching", "Laozi", "Buku ini terdiri dari 81 bab singkat yang penuh dengan nasihat tentang hidup dalam harmoni dengan Tao, yang diterjemahkan sebagai Cara, interpretasi Cina kuno dari kekuatan spiritual yang mendasari semua kehidupan."}, {"Killing Jesus : A History", "Bill O'Reilly, Martin Dugard's", "Buku yang menjelaskan kehidupan dan krucifiksi Yesus Kristus, dikenal sebagai Yesus dari Nazaret."}}, // Agama
        {{"Thinking, Fast and Slow", "Daniel Kahneman", "Buku yang menjelaskan tentang dua sistem dalam otak kita yang mempengaruhi cara kita berpikir dan membuat keputusan"}, {"Man's Search for Meaning", "Viktor E. Frankl", "Buku ini menekankan bagaimana kesulitan sehari-hari di kamp mempengaruhi kondisi mental penghuni, dan bagaimana Frankl menemukan makna dalam kehidupannya melalui penderitaan."}, {"The Power of Habit", "Charles Duhigg", " Buku ini mencakup cerita Lisa Allen, seorang wanita yang berhasil mengubah kebiasaan hidupnya yang tidak sehat menjadi lebih sehat dan produktif dalam waktu singkat."}, {"Emotional Intelligence", "Dan Goleman", "Buku yang menjelaskan pentingnya kecerdasan emosional dalam kehidupan sehari-hari dan bagaimana kecerdasan emosional dapat mempengaruhi kesuksesan pribadi dan profesional."}, {"The Social Animal", "Jean-Jacque Rosseau", "Buku yang mendapatkan penghargaan APA dan menang dalam kategori non-fiksi tentang psikologi sosial."}}, // Psikologi
        {{"The Prince", "Niccolò Machiavelli", "Panduan praktis untuk menguasai negara, meskipun beberapa ahli berpendapat bahwa buku ini sebenarnya dimaksudkan sebagai satire dan panduan tentang bagaimana tidak menguasai negara."}, {"The Communist Manifesto", "Karl Marx, Friedrich Engels", "Buku ini menggambarkan sejarah dari feodalisme hingga kapitalisme abad ke-19, yang mereka pernyatakan akan digantikan oleh masyarakat pekerja."}, {"The Art of War", "Sun Tzu", "Buku ini terdiri dari 13 bab yang masing-masing berfokus pada serangkaian keterampilan atau seni militer dan bagaimana mereka diterapkan dalam strategi dan taktik militer."}, {"The Republic", "Plato", "Dialog yang mencakup diskusi tentang apa itu keadilan dan mengapa keadilan adalah kepentingan terbaik setiap individu."}, {"The Social Contract", "Plato", "buku yang menjelaskan tentang bagaimana menetapkan otoritas yang sah dalam komunitas politik, yang kompatibel dengan kebebasan individu, dihadapkan pada tantangan masyarakat komersial yang telah diidentifikasi Rousseau dalam Discourse on Inequality (1755)."}}, // Politik
        {{"1984", "George Orwell", "Novel distopis yang menggambarkan dunia di masa depan di mana totalitarianisme telah mengendalikan dunia."}, {"To Kill a Mockingbird", "Harper Lee", "Novel yang berlatar di Maycomb, Alabama, selama Depresi Besar (1929.39). Cerita ini berpusat pada Jean Louise (“Scout”) Finch, seorang gadis yang cerdas tetapi tidak konvensional yang tumbuh dari enam hingga sembilan tahun dalam novel."}, {"The Midnight Library", "Matt Haig", "novel fantastis yang menggambarkan perjalanan Nora Seed, seorang wanita yang merasa tidak puas dengan hidupnya dan merasa terpisah dan tidak dibutuhkan dalam dunia ini"}, {"The Devotion of Suspect X", "Keigo Higashino", "Novel kriminal yang merupakan bagian dari seri Detective Galileo."}, {"Funiculi Funicula (Before the Coffee Gets Cold)", "Toshikazu Kawaguchi", ""}} // Fiksi
    };
}

public String getJudulBuku(int kategori, int nomorBuku) {
    return buku[kategori - 1][nomorBuku - 1][0];
}

public String getPenulisBuku(int kategori, int nomorBuku) {
    return buku[kategori - 1][nomorBuku - 1][1];
}

public String getSinopsisBuku(int kategori, int nomorBuku) {
    return buku[kategori - 1][nomorBuku - 1][2];
}

public int getJumlahBuku(int kategori) {
    return buku[kategori - 1].length;
}
}