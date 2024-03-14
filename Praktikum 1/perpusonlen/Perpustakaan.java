package perpusonlen;

public class Perpustakaan {
    private String[][][] buku = {
        {{"The Shallows", "Nicholas Carr"}, {"Digital Minimalism", "Cal Newport"}, {"The Great Shifting", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides"}, {"The Pragmatic Programmer", "Andrew Hunt, David Thomas"}, {"Head First Java", "Kathy Sierra, Bert Bates"}}, // Teknologi
        {{"Sophie's World", "Jostein Gaarder"}, {"Loving The Wounded Soul", "Regis Machdy"}, {"Tractatus Logico-Philosophicus", "Ludwig Wittgenstein"}, {"The Passions of The Soul", "René Descartes"}, {"A History of Western Philosophy", "Bertrand Russell"}}, // Filsafat
        {{"A Short History of Nearly Everything", "Bill Bryson"}, {"Sejarah Dunia yang Disembunyikan", "Jonathan"}, {"Guns, Germs, and Steel", "Jared Diamond"}, {"History of The World War", "Saut Pasaribu"}, {"Genghis Khan and the Making of the Modern World", "Jack Weatherford"}}, // Sejarah
        {{"The Mystery of Historical Jesus", "Louay Fatoohi"}, {"Secrets of Divine Love: A Spiritual Journey into the Heart of Islam", "A. Helwa"}, {"Why Buddhism Is True", "Robert Wright"}, {"The Tao Te Ching", "Laozi"}, {"Killing Jesus : A History", "Bill O'Reilly, Martin Dugard's"}}, // Agama
        {{"Thinking, Fast and Slow", "Daniel Kahneman"}, {"Man's Search for Meaning", "Viktor E. Frankl"}, {"The Power of Habit", "Charles Duhigg"}, {"Emotional Intelligence", "Dan Goleman"}, {"The Social Animal", "Jean-Jacque Rosseau"}}, // Psikologi
        {{"The Prince", "Niccolò Machiavelli"}, {"The Communist Manifesto", "Karl Marx, Friedrich Engels"}, {"The Art of War", "Sun Tzu"}, {"The Republic", "Plato"}, {"The Social Contract", "Plato"}}, // Politik
        {{"1984", "George Orwell"}, {"To Kill a Mockingbird", "Harper Lee"}, {"The Midnight Library", "Matt Haig"}, {"The Devotion of Suspect X", "Keigo Higashino"}, {"Funiculi Funicula (Before the Coffee Gets Cold)", "Toshikazu Kawaguchi"}} // Fiksi
    };

    public void tampilkanBuku(int kategori) {
        System.out.println("Daftar buku kategori " + getKategori(kategori) + ":");
        for (int i = 0; i < buku[kategori - 1].length; i++) {
            System.out.println((i+1) + ". " + buku[kategori - 1][i][0] + " - " + buku[kategori - 1][i][1]);
        }
    }

    public String getJudulBuku(int kategori, int nomorBuku) {
        return buku[kategori - 1][nomorBuku - 1][0];
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
}
