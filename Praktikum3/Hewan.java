/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3;

/**
 *
 * @author supal
 */
public class Hewan {
    String nama ;
    int umur    ;
    
    public Hewan(String nama, int umur) {
        this.nama = nama ;
        this.umur = umur ;
    }
    
    public String getNama() {
        return nama      ;
    }
    
    public void setNama(String nama) {
        this.nama = nama ;
    }
    
    public int getUmur() {
        return umur      ;
    }
    
    public void setUmur(int umur) {
        this.umur = umur ;
    }
    
    void info() {
        System.out.println("Nama : " + nama)           ;
        System.out.println("Umur : " + umur + " tahun ") ;
    }
    
    void suara(){
        System.out.println ("Hewan bersuara")          ;
    }
    
    void berlari() {
        System.out.println(nama + " sedang berlari ")    ;
    }

}
