/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5;

/**
 *
 * @author Eduardo Hernandez Gregorio
 */
public class Alumno extends Persona implements IPerfil, ICalificaciones{
    private double calificacion;
    
    Alumno(int id, String nombre, String apellido, String correo){
        super(id,nombre,apellido,correo);
        
    }
    
    @Override
    public void imprimirPerfil(){
    System.out.println("-----Prfil Alumno-----");
    System.out.print("ID: "+getId()+"\nNombre: " +getNombre()+"\nApellido: "+getApellido()+"\nCorreo: "+getCorreo());
    }  

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        guardarCalificacion(this.calificacion=calificacion);
    }
    
    @Override
    public void mostrarCalificaciones(){
        System.out.println("\nTu calificacion es: "+getCalificacion());
    }
    
   
    public void guardarCalificacion(double calificacion){
        System.out.print("\nGruardando calificacion ........");
        System.out.print("\nSu calificacion a sido guardada correctamente.");
    }
    
}
