/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum5;

/**
 *
 * @author M S I
 */
public class Mobil extends KendaraanDarat{
    int kapasitaspenumpang ;
    
    public Mobil(String nama, int kecepatan, int jumlahroda, int kapasitaspenumpang) {
        super(nama, kecepatan, jumlahroda)           ;
        this.kapasitaspenumpang = kapasitaspenumpang ;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kapasitas Penumpang : " + kapasitaspenumpang);
    }
}
