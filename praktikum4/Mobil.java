/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author M S I
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu ; 
  
    // Constructor
    public Mobil (String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super (nama, kecepatanMaks, jenisMesin) ;
        this.jumlahPintu = jumlahPintu ;
    }
    
    // Method untuk menampilkan Informasi
    public void tampilkanInfoMobil() {
        System.out.println("Kecepatan Maksimum : " + kecepatanMaks + "km/h") ;
        System.out.println("Jumlah Pintu       : " + jumlahPintu           ) ;
    }
}
