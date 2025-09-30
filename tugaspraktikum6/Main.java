/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum6;

/**
 *
 * @author M S I
 */
public class Main { 
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();
        Produk buku = new Buku("Percy Jackson", 105000);
        Produk komputer = new Elektronik("razer", 90000000);
        Produk baju = new Pakaian("H&m", 300000);
        
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(komputer);
        keranjang.tambahProduk(baju);
        
        keranjang.tampilkanProduk();
        System.out.println("---------------");
        System.out.println("Total bayar: Rp " + keranjang.hitungTotal());
    }
}
