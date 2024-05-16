package Praktikum6;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner vanvan = new Scanner(System.in);
        Employee karyawan = null;  
        boolean sudahLogin = false;
        while (true){
            System.out.print("=====[KOPERASI KARYAWAN]=====\nPilihan Program: \n1. Login\n2. Belanja\n3. Inovice\n4. Keluar\nMasukkan pilihan Anda: ");
            int pilihan = vanvan.nextInt();          
            if(pilihan == 1){
                vanvan.nextLine();
                System.out.print("Masukkan nama Anda: ");
                String nama = vanvan.nextLine();
                System.out.print("Masukkan nomor registrasi Anda: ");
                int nomor = vanvan.nextInt();
                System.out.print("Masukkan gaji per bulan Anda: ");
                int gaji = vanvan.nextInt();
                karyawan = new Employee(nomor, nama, gaji);
                System.out.println("USERINFO: SUCCESFULLY LOGIN!\n" + "Selamat datang, " + karyawan.getName() + "\n");
                sudahLogin = true;
            }
            else if(pilihan == 2){
                if(!sudahLogin){
                    System.out.println("USERINFO: ANDA BELUM LOGIN! SILAHKAN LOGIN TERLEBIH DAHULU\n");
                        continue;
                    }
                while(true){
                    System.out.println("=====Daftar Produk=====");    
                    Invoice[] invoices = {
                        new Invoice("Pensil", 1000),
                        new Invoice("Buku", 2000),
                        new Invoice("Penghapus", 500),
                        new Invoice("Penggaris", 1500),
                        new Invoice("Pensil Warna", 15000),
                        new Invoice("Spidol", 5000),
                        new Invoice("Kotak Pensil", 25000),
                        new Invoice("Buku Gambar", 5000),  
                        new Invoice("Penggaris Segitiga", 3000),
                        new Invoice("Pensil 2B", 2000)
                    };
                    int i = 0;
                    for(Invoice invoice : invoices){
                        System.out.println((i+1) + ". " + invoice.getProductName() + " - " + invoice.getPricePerItem());
                        i++;
                    }
                    System.out.println("11. Selesai Belanja");
                    System.out.print("Masukkan nomor produk: ");
                    int nomorProduk = vanvan.nextInt();
                    if(nomorProduk == 11){
                        break;
                    }
                    if (nomorProduk < 1 || nomorProduk > 10){
                        System.out.println("Produk tidak ditemukan! Silahkan coba lagi\n");
                        continue;
                    }
                    System.out.print("Masukkan jumlah produk: ");
                    int jumlahProduk = vanvan.nextInt();
                    Invoice singleInvoice = new Invoice();
                    singleInvoice.setPricePerItem(invoices[nomorProduk - 1].getPricePerItem());
                    singleInvoice.setQuantity(jumlahProduk);
                    singleInvoice.setProductName(invoices[nomorProduk - 1].getProductName());
                    karyawan.addInvoice(singleInvoice);
                }
                if(karyawan != null){
                    System.out.printf("Total Belanja Anda: Rp%,.2f\n\n",karyawan.getPayableAmount());
                }
            }
            else if(pilihan == 3){
                if (karyawan == null){
                    System.out.println("USERINFO: ANDA BELUM LOGIN! SILAHKAN LOGIN TERLEBIH DAHULU\n");
                    continue;
                }
                else {
                    Invoice[] invoices = karyawan.getInvoices();
                    if(invoices != null){
                        System.out.println("========================INVOICE ANDA========================");
                        System.out.println("Nama             : " + karyawan.getName() + "\nNomor Registrasi : " + karyawan.getRegistrationNumber());
                        System.out.printf("Gaji Awal        : Rp%,d\n", karyawan.getSalaryPerMonth());
                        int i = 0;
                        System.out.println("==============================================\nDetail Belanja: ");
                        for(Invoice invoice : invoices){
                            System.out.printf("%d. %d buah %-20s Rp%,.2f\n", (i+1), invoice.getQuantity(), invoice.getProductName(), invoice.getPayableAmount());
                            i++;
                        }
                        System.out.println("==============================================");
                        System.out.printf("Total Belanja: %15s Rp%,.2f\n\n", " ",karyawan.getPayableAmount());
                        System.out.printf("Gaji Akhir: Rp%,.2f\n\n", (karyawan.getSalaryPerMonth() - karyawan.getPayableAmount()));
                    }
                    else{
                        System.out.println("USERINFO: BELUM ADA INVOICE YANG DIBUAT!\n");
                    }
                }
            }
            else if(pilihan == 4){
                System.out.println("Terimakasih sudah menggunakan program");
                break;
            }
            else {
                System.out.println("Pilihan tidak valid! Silahkan coba lagi\n");
                continue;
            }
        }
    }
}

