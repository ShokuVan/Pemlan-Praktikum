package Praktikum4.Modul5;

public class Main {
    public static void main(String[] args) {
        System.out.println("=============\n" + "Kelas Manusia" + "\n=============");
        Manusia manusia1 = new Manusia("Neuvillete", "111", true, true);
        System.out.println(manusia1);
        Manusia manusia2 = new Manusia("Raiden", "222", false, true);
        System.out.println(manusia2);
        Manusia manusia3 = new Manusia("Kaeya", "333", false, false);
        System.out.println(manusia3);

        System.out.println("=====================\n" + "Kelas MahasiswaFILKOM" + "\n=====================");
        MahasiswaFILKOM mahasiswaFILKOM1 = new MahasiswaFILKOM("235150401111032",2.90 , "Stephanie Wijaya", "444", false, false);
        System.out.println(mahasiswaFILKOM1);
        MahasiswaFILKOM mahasiswaFILKOM2 = new MahasiswaFILKOM("235150401111032",3.45 , "Stephanie Wijaya", "444", false, false);
        System.out.println(mahasiswaFILKOM2);
        MahasiswaFILKOM mahasiswaFILKOM3 = new MahasiswaFILKOM("235150401111032",3.93 , "Stephanie Wijaya", "444", false, false);
        System.out.println(mahasiswaFILKOM3);

        System.out.println("=============\n" + "Kelas Pekerja" + "\n=============");
        Pekerja pekerja1 = new Pekerja(1000, 2022, 3, 2, 2, "William", "555", true, true);
        System.out.println(pekerja1);
        Pekerja pekerja2 = new Pekerja(1500, 2015, 5, 6, 0, "Fano", "666", true, false);
        System.out.println(pekerja2);
        Pekerja pekerja3 = new Pekerja(1850, 2004, 8, 3, 10, "Rifa", "777", false, true);
        System.out.println(pekerja3);

        System.out.println("=============\n" + "Kelas Manager" + "\n=============");
        Manager manager = new Manager("HRD", 7500, 2009, 1, 2, 0, "Nathaniel", "888", true, false);
        System.out.println(manager);
    } 
}

