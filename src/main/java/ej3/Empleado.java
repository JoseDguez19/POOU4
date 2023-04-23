/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

import javax.swing.JOptionPane;

/**
 *
 * @author ap550
 */
public class Empleado extends Persona{
    
    double sueldo;
    String telefono, direccion;
    
    public Empleado(String nom, int ed, double suel, String tel, String dir){
    
        super(nom, ed);
        this.direccion=dir;
        this.sueldo=suel;
        this.telefono=tel;      
    }
    
    @Override
    public void VerDatos(){
    
        JOptionPane.showMessageDialog(null, "Nombre: "+nombre+ "\nEdad: "+
                edad+ "\nSueldo: "+sueldo+ "\nTelefono: "+telefono +
                "\nDireccion: "+direccion, "Datos Del Empleado", 
                JOptionPane.INFORMATION_MESSAGE);
    }
}
