/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author ap550
 */
public class MedioDeTransporte {
    
    private double Velocidad;
    private String Nombre;
    
    public void mostararMensaje(){
    
        System.out.println("Soy un medio de transporte");
    }
    
    public void setVelocidad(double v){
    
        Velocidad=v;     
    }
    
    public double getVelocidad(){
    
        return Velocidad;
    }
    
    public void setNombre(String n){
    
        Nombre=n;
    }
    
    public String getNombre(){
    
        return Nombre;
    }
}
