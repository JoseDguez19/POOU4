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
public class Principal {
    
    public static void main(String[] args) {
        
        String nom, tel, dir;
        double suel;
        int ed;
        
        nom = JOptionPane.showInputDialog(null, "Ingresa el nombre del empleado: ", "Solicitando Datos: ",3);
        ed= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la edad del empleado: ", "Solicitando Datos: ",3)); 
        suel= Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el sueldo del empleado: ", "Solicitando Datos: ",3));
        tel= JOptionPane.showInputDialog(null, "Ingresa el telefono del empleado: ", "Solicitando Datos: ",3);
        dir= JOptionPane.showInputDialog(null, "Ingresa la direccion del empleado: ", "Solicitando Datos: ",3);
    
        Empleado emp1 =new Empleado(nom, ed, suel, tel, dir);
        Empleado emp2 =new Empleado(nom, ed, suel, tel, dir);
        Empleado emp3 =new Empleado(nom, ed, suel, tel, dir);
        emp1.VerDatos();
        emp2.VerDatos();
        emp3.VerDatos();
    }
}
