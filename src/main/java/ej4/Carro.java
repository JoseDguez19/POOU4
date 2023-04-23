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
public final class Carro extends Vehiculo{
    
    private String placa;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public Carro(String tipo, String marca, String color, int modelo){
    
        super(tipo, marca, color, modelo);
    }
    
    public void Mostrardatos(){
    
        JOptionPane.showMessageDialog(null, "AUTOMOVIL \nTipo: "+getTipo()+
                "\nMarca: "+getMarca()+ "\nColor: "+getColor()+
                "\nModelo: "+getModelo()+ "\nPlaca: "+getPlaca());
    }
}
