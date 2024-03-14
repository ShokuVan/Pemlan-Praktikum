package perpusonlen;

import java.util.Scanner;

public class Perpustakaan {
    private String[][] buku = {
        {"Clean Code", "Refactoring", "Design Patterns", "The Pragmatic Programmer", "Head First Java"}, // Teknologi
        {"Sophie's World", "Membongkar Misteri Sains", "Tractatus Logico-Philosophicus", "Being and Time", "Critique of Pure Reason"}, // Filsafat
        {"A Short History of Nearly Everything", "Sapiens: A Brief History of Humankind", "Guns, Germs, and Steel", "The Silk Roads", "Genghis Khan and the Making of the Modern World"}, // Sejarah
        {"The Quran", "The Bible", "Bhagavad Gita", "The Tao Te Ching", "The Torah"}, // Agama
        {"Thinking, Fast and Slow", "Man's Search for Meaning", "The Power of Habit", "Flow: The Psychology of Optimal Experience", "Influence: The Psychology of Persuasion"}, // Psikologi
        {"The Prince", "The Communist Manifesto", "The Art of War", "Democracy in America", "The Republic"}, // Politik
        {"1984", "To Kill a Mockingbird", "Pride and Prejudice", "The Great Gatsby", "Brave New World"} // Fiksi
    };

    public void tampilkanBuku(int kategori) {
        System.out.println("Daftar buku kategori " + getKategori(kategori) + ":");
        for (int i = 0; i < buku[kategori - 1].length; i++) {
            System.out.println((i+1) + ". " + buku[kategori - 1][i]);
        }
    }

    public String getJudulBuku(int kategori, int nomorBuku) {
        return buku[kategori - 1][nomorBuku - 1];
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
