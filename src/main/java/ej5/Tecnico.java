/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5;

/**
 *
 * @author ap550
 */
public class Tecnico extends Empleado{
    
     public Tecnico() {
    }

    public Tecnico(String nombre) {
        super(nombre);
       // System.out.println("Constructor de Tecnico");                                                             
    }
   
    @Override
    public String toString() {
        return super.toString() + " -> Tecnico";
    }
}
