/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum10;

/**
 *
 * @author M S I
 */
public class Main {
    public static void main(String[] args) {
        
        Elektronik e = new Elektronik();
        Makanan m = new Makanan();

        double hargaElektronik = 2000000; // contoh harga elektronik
        double hargaMakanan = 50000;      // contoh harga makanan

        double pajakElektronik = e.hitungPajak(hargaElektronik);
        double pajakMakanan = m.hitungPajak(hargaMakanan);

        System.out.println("Harga Elektronik: " + hargaElektronik);
        System.out.println("Pajak Elektronik (10%): " + pajakElektronik);
        System.out.println();
        System.out.println("Harga Makanan: " + hargaMakanan);
        System.out.println("Pajak Makanan (5%): " + pajakMakanan);
    }
}

