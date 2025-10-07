/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author M S I
 */
public class Main {
    public static void main(String[] args) {
        // Polimorfisme produkk
        Produk p1 = new Elektronik("Laptop Razer", 50000000, 2)     ;
        Produk p2 = new Makanan("Roti Coklat", 10000, "25-11-2025") ;

        // Polimorfisme Pegawaii
        Pegawai peg1 = new PegawaiTetap   ("Supil"  , 50000000, 1000000) ; 
        Pegawai peg2 = new PegawaiKontrak ("Falikha", 8000000, 12)       ;

        // Menampilkan informasi
        System.out.println("==<>==<>==<>==<>== Data Produk ==<>==<>==<>==<>==")    ;
        p1.tampilkanInfo()   ;
        System.out.println() ;
        p2.tampilkanInfo()   ;

        System.out.println("\n==<>==<>==<>==<>== Data Pegawai ==<>==<>==<>==<>==") ;
        peg1.tampilkanInfo() ;
        System.out.println() ;
        peg2.tampilkanInfo() ;
    }
}
