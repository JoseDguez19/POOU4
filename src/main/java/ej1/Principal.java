/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author ap550
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Coche c1 = new Coche();
        
        c1.setModelo("MK334");
        c1.setVelocidad(40.5);
        c1.setNombre("XY");
        c1.mostararMensaje();
        
        Coche c2 = new Coche();
        
        c2.setModelo("W7985");
        c2.setVelocidad(60);
        c2.setNombre("WK");
        c2.mostararMensaje();
        
        System.out.println("-Modelo: "+c1.getModelo()+ " -Velocidad: "+c1.getVelocidad()+ " -Nombre: "+c1.getNombre());
        System.out.println("-Modelo: "+c2.getModelo()+ " -Velocidad: "+c2.getVelocidad()+ " -Nombre: "+c2.getNombre());
    }
}
