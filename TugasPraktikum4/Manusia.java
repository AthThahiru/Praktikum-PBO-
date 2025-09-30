/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum4;

/**
 *
 * @author M S I
 */
public class Manusia {
    private String nama     ;
    protected int usia      ;
    public String pekerjaan ;
    
    // Constructor
    public Manusia (String nama, int usia, String pekerjaan) {
        this.nama      = nama      ;
        this.usia      = usia      ;
        this.pekerjaan = pekerjaan ;
    }
    
    // Getter dan Setter nama
    public String getNama () {
        return nama ;
    }
    public void setNama (String nama) {
        this.nama = nama ;
    }
}
