/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsi;

/**
 *
 * @author M S I
 */
public class Pegawai {
    private String namaPegawai ;
    private double gaji        ;

    public Pegawai(String namaPegawai, double gaji) {
        this.namaPegawai = namaPegawai ;
        this.gaji        = gaji        ;
    }
   
    // Getter sama setter buat nambahin nilai
    public String getNamaPegawai() {
        return namaPegawai ;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai ;
    }

    public double getGaji() {
        return gaji ;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji ;
    }

    //Methodeenya
    public void tampilkanInfo() {
        System.out.println("Pegawai   : " + namaPegawai + ", Gaji : Rp " + gaji);
    }
    
}

