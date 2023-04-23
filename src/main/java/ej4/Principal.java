/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4;

/**
 *
 * @author ap550
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Carro c1 = new Carro("Sedan", "Toyota", "Negro", 1997);
        c1.setPlaca("MK4");
        c1.Mostrardatos();
        
        Motocicleta m1= new Motocicleta("Racing", "Honda", "Verde", 2017);
        m1.setVelocidad(5);
        m1.Mostrardatos();
    }
}
