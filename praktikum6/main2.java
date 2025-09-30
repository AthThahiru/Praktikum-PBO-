/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author M S I
 */
public class main2 {
    public static void main(String[] args) {
        
        Kucing k = new Kucing();
        k.bersuara();
        k.makan("ikan");
        k.makan("ikan", 3);
        
        Anjing a = new Anjing();
        a.bersuara();
        a.makan("daging", 3);
    }
}
