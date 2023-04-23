/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

/**
 *
 * @author ap550
 */
public class Estudiante extends Persona{
    
    private int CodigoEstudiante;
    private float NotaFinal;
    
    //Constructor
    public Estudiante(String Nombre, String Apellido, int Edad, int CodigoEstudiante, float NotaFinal){
    
        super(Nombre, Apellido, Edad);
        this.CodigoEstudiante = CodigoEstudiante;
        this.NotaFinal = NotaFinal;
    }
    
    public void MostarDatos(){
    
        System.out.println("Nombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nEdad: "+getEdad()+
                "\nCodigoEstudiante: "+CodigoEstudiante+
                "\nNota FInal: "+NotaFinal);
    }
}
