/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author M S I
 */
public class Hewan {
    public void bersuara() {
        System.out.println("Hewan Bersuara") ;
    }
    
    public void makan(String makanan) {
        System.out.println("Hewan Makan : " + makanan) ;
    }
    
    public void makan(String makanan, int jumlah) {
        System.out.println("Hewan Makan : " + jumlah + " Porsi " + makanan) ;
    }
}
