package perpusonlen;

public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        Tampilan tampilan = new Tampilan(perpustakaan);
        
        tampilan.jalankanSistem();
    }
}

