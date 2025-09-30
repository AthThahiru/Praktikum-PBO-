/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum5;

/**
 *
 * @author M S I
 */
public class Main {
    public static void main(String[] args) {
        Kuceng k = new Kuceng() ;
        k.nama   = "Miaw"       ;
        k.jenis  = "Kampung"    ;
        k.tampilkanInfo()       ;
        
        Anjing a = new Anjing() ;
        a.nama   = "MbaUpil"      ;
        a.jenis  = "Cihuahua"   ;
        a.tampilkanInfo()       ;
        
        Mobil m  = new Mobil("Avanza", 120, 4, 7) ;
        m. tampilkanInfo()                        ;
        System.out.println()                      ;
        
        SepedaMotor sm = new SepedaMotor ("Vario", 90, 2, "Matic") ;
        sm.tampilkanInfo()                                         ;
        System.out.println()                                       ;
        
        KendaraanDarat truk = new KendaraanDarat ("Truk", 60, 6) ;
        truk.tampilkanInfo()                                     ;
    }   

}
