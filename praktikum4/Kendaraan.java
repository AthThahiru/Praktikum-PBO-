/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author M S I
 */
public class Kendaraan {
    // Atribut dengan akses modifier berbeda
    private String nama          ;
    protected int  kecepatanMaks ;
    public String  jenisMesin    ;
   
    // Constructor
    public Kendaraan (String nama, int kecepatanMaks, String jenisMesin) {
        this.nama         = nama          ;
        this.kecepatanMaks = kecepatanMaks ;
        this.jenisMesin   = jenisMesin    ;
    }
    
    // Getter dan Setter untuk nama
    public String getNama () {
        return nama ;
    }
    public void setNama (String nama) {
        this.nama = nama ;
    }
    
    // Method public untuk menampilkan informasi kendaraan
    public void tampilkanInfoKendaraan () {
        System.out.println ("Nama Kendaraan     : " + nama                   ) ;
        System.out.println ("Kecepatan Maksimal : " + kecepatanMaks + "km/h" ) ;
        System.out.println ("Jenis Mesin        : " + jenisMesin             ) ;
    }
}
