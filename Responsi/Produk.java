/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author M S I
 */
public class Produk {
    private String namaProduk ;
    private double harga      ;

    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk ;
        this.harga      = harga      ;
    }
   
    // Getter sama setter buat nambahin nilai
    public String getNamaProduk() {
        return namaProduk ;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk ;
    }

    public double getHarga() {
        return harga ;
    }

    public void setHarga(double harga) {
        this.harga = harga ;
    }

    //Methodeenya
    public void tampilkanInfo() {
        System.out.println("Produk  : " + namaProduk + ", Harga : Rp " + harga);
    }
    
}
