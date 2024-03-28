package Praktikum3.game;

public class Hero {
        private String name;
        private int hp;
        private int atk;
        private int def;
    
        //constructor hero
        public Hero() {
        }
    
        //constructor ini buat bikin objek hero dengan parameter nama, hp, atk, dan def
        public Hero(String name, int hp, int atk, int def) {
            this.name = name;
            this.hp = hp;
            this.atk = atk;
            this.def = def;
        }
    
        //getter setter untuk nama karakter
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        //getter setter untuk hp
        public int getHp() {
            return hp;
        }
    
        public void setHp(int hp) {
            this.hp = hp;
        }
    
        //getter setter untuk attack
        public int getAtk() {
            return atk;
        }
    
        public void setAtk(int atk) {
            this.atk = atk;
        }
    
        //getter dan setter untuk pertahanannya
        public int getDef() {
            return def;
        }
    
        public void setDef(int def) {
            this.def = def;
        }
    
        public void attack(Hero target) {
            //buat hitung damge yang diterima target berdasarkan atk dan def
            int damage = (int) (this.atk * (1 - (target.getDef() / 100.0)));
            //mengurangi poin hp sesuai dmg
            int newHp = target.getHp() - damage;
            //biar hp tidak bernilai ngeatif
            if (newHp < 0) {
                newHp = 0;
            }
            target.setHp(newHp);
            //membuat peringatan pesan bahwa karakter ini menyerang target dgn jumlah damage tertentu
            System.out.println(this.name + " menyerang " + target.getName() + " sebesar " + damage + " damage.\n");
            //mengurangi def target sebanyak 5
            target.setDef(Math.max(0, target.getDef() - 5));
        }
    
        //menampilkan informasi karakter seperti nama, poin kesehatan, atk, def
        public void printInfo() {
            System.out.println("Nama\t\t\t: " + this.name);
            System.out.println("Poin Kesehatan\t\t: " + this.hp);
            System.out.println("Serangan\t\t: " + this.atk);
            System.out.println("Pertahanan\t\t: " + this.def);
        }
}
