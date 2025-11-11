/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum9;

/**
 *
 * @author M S I
 */
public class Main {
    public static void main(String[] args) {
        Hewan anjing = new Anjing();
        Hewan kucing = new Kucing();
        
        anjing.suara();
        anjing.info();
        
        kucing.suara();
        kucing.info();
    }
}
