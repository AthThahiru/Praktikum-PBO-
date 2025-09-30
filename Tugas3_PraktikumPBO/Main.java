/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3_PraktikumPBO;

/**
 *
 * @author M S I
 */
public class Main {
    public static void main(String[] args) {
        // membuat objek mobil
        Mobil mobil1 = new Mobil("Porsche", "718 Cayman S", 2025, "Hitam");
        Mobil mobil2 = new Mobil("Lamborghini", "Temerario", 2025, "Bianco Monocerus");

        // menampilkan info mobil
        mobil1.displayInfo();
        mobil2.displayInfo();

        // menyalakan mesin
        mobil1.startEngine();
        mobil2.startEngine();

        // ubah warna mobil1
        mobil1.setWarna("Biru");
        System.out.println("Setelah diubah warna:");
        mobil1.displayInfo();
    }
}
    

