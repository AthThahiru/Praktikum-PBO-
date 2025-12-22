/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpustakaan;

/**
 *
 * @author M S I
 */
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Perpustakaan perpus = new Perpustakaan();
        Peminjaman peminjaman = null;

        boolean jalan = true;

        while (jalan) {
            System.out.println("\n=== SISTEM PERPUSTAKAAN DIGITAL ===");
            System.out.println("1. Tambah Anggota");
            System.out.println("2. Tampilkan Anggota");
            System.out.println("3. Buat Peminjaman");
            System.out.println("4. Pinjam Buku");
            System.out.println("5. Tampilkan Peminjaman");
            System.out.println("6. Simpan Data Anggota");
            System.out.println("7. Baca Data Anggota");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            try {
                int pilihan = Integer.parseInt(input.nextLine());

                switch (pilihan) {
                    case 1:
                        System.out.print("ID Anggota   : ");
                        String idA = input.nextLine();
                        System.out.print("Nama Anggota : ");
                        String namaA = input.nextLine();

                        perpus.tambahAnggota(new Anggota(idA, namaA));
                        System.out.println("Anggota berhasil ditambahkan.");
                        break;

                    case 2:
                        perpus.tampilkanAnggota();
                        break;

                    case 3:
                        System.out.print("ID Anggota   : ");
                        String idP = input.nextLine();
                        System.out.print("Nama Anggota : ");
                        String namaP = input.nextLine();

                        peminjaman = new Peminjaman(new Anggota(idP, namaP));
                        System.out.println("Peminjaman berhasil dibuat.");
                        break;

                    case 4:
                        if (peminjaman == null) {
                            System.out.println("Buat peminjaman terlebih dahulu!");
                            break;
                        }

                        System.out.print("ID Buku   : ");
                        String idB = input.nextLine();
                        System.out.print("Judul     : ");
                        String judul = input.nextLine();
                        System.out.print("Penulis   : ");
                        String penulis = input.nextLine();

                        peminjaman.pinjamBuku(
                                new Buku(idB, judul, penulis)
                        );
                        break;

                    case 5:
                        if (peminjaman == null) {
                            System.out.println("Belum ada peminjaman.");
                        } else {
                            peminjaman.tampilkanPeminjaman();
                        }
                        break;

                    case 6:
                        perpus.simpanData("anggota.dat");
                        break;

                    case 7:
                        perpus.bacaData("anggota.dat");
                        break;

                    case 0:
                        jalan = false;
                        System.out.println("Terima kasih 🙏");
                        break;

                    default:
                        System.out.println("Menu tidak valid.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            }
        }

        input.close();
    }
}

