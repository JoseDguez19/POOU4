/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4;

import javax.swing.JOptionPane;

/**
 *
 * @author ap550
 */
public final class Motocicleta extends Vehiculo{
    
     private int Velocidad;

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }
    
    public Motocicleta(String tipo, String marca, String color, int modelo){
    
        super(tipo, marca, color, modelo);
    }
    
       public void Mostrardatos(){
    
        JOptionPane.showMessageDialog(null, "MOTOCICLETA \nTipo: "+getTipo()+
                "\nMarca: "+getMarca()+ "\nColor: "+getColor()+
                "\nModelo"+getModelo()+ "\nVelocidades: "+getVelocidad());
    }
}
