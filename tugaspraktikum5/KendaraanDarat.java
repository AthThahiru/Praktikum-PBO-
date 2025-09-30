/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum5;

/**
 *
 * @author M S I
 */
public class KendaraanDarat extends Kendaraan{
    int jumlahroda ;
    
    public KendaraanDarat(String nama, int kecepatan, int jumlahroda) {
        super(nama, kecepatan)      ;
        this.jumlahroda = kecepatan ;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Roda : " + jumlahroda);
    }
}
