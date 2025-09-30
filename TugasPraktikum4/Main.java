/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikum4;

/**
 *
 * @author M S I
 */
public class Main {
    public static void main (String[] args) {
        pekerja A = new pekerja ("Heru", 27, "CEO", 25000000) ;
        System.out.println(A.toString()) ;
        
        A.setNama ("Heer") ;
        
        System.out.println("\nSetelah nama diubah : ");
        System.out.println(A);
    }
    
}
