/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum5;

/**
 *
 * @author M S I
 */
public class SepedaMotor extends KendaraanDarat{
    String jenismotor ;
    
    public SepedaMotor(String nama, int kecepatan, int jumlahroda, String jenismotor) {
        super(nama, kecepatan, jumlahroda)           ;
        this.jenismotor = jenismotor ;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Motor : " + jenismotor);
    }
}
    

