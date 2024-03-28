package Praktikum3.game;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner vanvan = new Scanner(System.in);

        System.out.println("\nSelamat datang di game pertarungan Hero! Silahkan isi status kedua Hero Anda." 
                        + "\nAturan: HP dan ATK = 1-1000, DEF = 1-100 (Berlaku dalam persentase)."
                        + "\nPertahanan akan berkurang sebanyak 5 setiap ronde.");

        Hero hero1 = new Hero();
        System.out.print("\n--------------------------------------------------\nHero 1\n");
        System.out.print("\tNama\t\t\t: ");
        hero1.setName(vanvan.nextLine());
        hero1.setHp(getValidInput(vanvan, "HP", 1, 1000));
        hero1.setAtk(getValidInput(vanvan, "Serangan", 1, 1000));
        hero1.setDef(getValidInput(vanvan, "Pertahanan", 1, 100));

        System.out.print("--------------------------------------------------\nHero 2\n");
        System.out.print("\tNama\t\t\t: ");
        String name2 = vanvan.nextLine();
        int hp2 = getValidInput(vanvan, "HP", 1, 1000);
        int atk2 = (getValidInput(vanvan, "Serangan", 1, 1000));
        int def2 = (getValidInput(vanvan, "Pertahanan", 1, 100));
        Hero hero2 = new Hero(name2, hp2, atk2, def2);

        System.out.println("--------------------------------------------------\nInformasi Hero 1:");
        hero1.printInfo();
        System.out.println("\nInformasi Hero 2:");
        hero2.printInfo();

        System.out.println("\nApakah Anda yakin ingin bertarung? (y/t)");
        String confirm = vanvan.nextLine();
        if (!confirm.equalsIgnoreCase("y")) {
            System.out.println("Pertarungan dibatalkan.\n--------------------------------------------------");
            vanvan.close();
            return;
        }
        Random random = new Random();
        int attackOrder = random.nextInt(2);
        int round = 1;
        //looping sampai salah satu hero nya kalah
        while (hero1.getHp() > 0 && hero2.getHp() > 0) {
            System.out.println("--------------------------------------------------\nRonde " + round + "\n");

            //mengatur supaya pemain bisa saling bergantian menyerang
            if (attackOrder == 0) {
                hero1.attack(hero2);
                System.out.println("\t" + hero1.getName() + " HP tersisa: " + hero1.getHp() + ", Pertahanan: " + hero1.getDef());
                System.out.println("\t" + hero2.getName() + " HP tersisa: " + hero2.getHp() + ", Pertahanan: " + hero2.getDef() +"\n");
                if (hero2.getHp() <= 0) {
                    break;
                }
                hero2.attack(hero1);
                System.out.println("\t" + hero1.getName() + " HP tersisa: " + hero1.getHp() + ", Pertahanan: " + hero1.getDef());
                System.out.println("\t" + hero2.getName() + " HP tersisa: " + hero2.getHp() + ", Pertahanan: " + hero2.getDef());
                if (hero1.getHp() <= 0) {
                    break;
                }
            } else {
                hero2.attack(hero1);
                System.out.println("\t" + hero1.getName() + " HP tersisa: " + hero1.getHp() + ", Pertahanan: " + hero1.getDef());
                System.out.println("\t" + hero2.getName() + " HP tersisa: " + hero2.getHp() + ", Pertahanan: " + hero2.getDef() +"\n");
                if (hero1.getHp() <= 0) {
                    break;
                }
                hero1.attack(hero2);
                System.out.println("\t" + hero1.getName() + " HP tersisa: " + hero1.getHp() + ", Pertahanan: " + hero1.getDef());
                System.out.println("\t" + hero2.getName() + " HP tersisa: " + hero2.getHp() + ", Pertahanan: " + hero2.getDef());
                if (hero2.getHp() <= 0) {
                    break;
                }
            }
            round++;
            attackOrder = random.nextInt(2);
        }
        //menentukan pemenang setelah pertarungan selesai
        if (hero1.getHp() <= 0) {
            System.out.println("\nPertarungan berakhir! " + hero1.getName() + " (Hero 1) kalah.");
        } else {
            System.out.println("\nPertarungan berakhir! " + hero2.getName() + " (Hero 2) kalah.");
            System.out.println("--------------------------------------------------");
        }
        vanvan.close();
    }
    private static int getValidInput(Scanner scan, String atribut, int min, int max) {
        int nilai = 0;
        while (true) {
            System.out.print("\t" + atribut + " (1-" + max + ")\t\t: ");
            nilai = scan.nextInt();
            if (nilai >= min && nilai <= max) {
                break;
            }
            System.out.println(atribut + " harus berada dalam rentang " + min + "-" + max + ". Silakan coba lagi:");
        }
        scan.nextLine();
        return nilai;
    }
}


