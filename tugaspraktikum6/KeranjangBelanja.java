/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum6;

/**
 *
 * @author M S I
 */
import java.util.ArrayList;

public class KeranjangBelanja {
    private ArrayList<Produk> daftarProduk = new ArrayList<>();
    
    public void tambahProduk(Produk p) {
        daftarProduk.add(p);
    }
    
    public double hitungTotal() {
        double total = 0;
        for (Produk p : daftarProduk) {
            total += p.hargaSetelahDiskon();
        }
        return total;
    }
    
    public void tampilkanProduk()  {
        for (Produk p : daftarProduk) {
            System.out.println(
               p.getNama() + " | Harga: " + p.getHarga() +
               " | Diskon: " + p.hitungDiskon() +
               " | Bayar: " + p.hargaSetelahDiskon()
            );
        }
    }
}
