/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5;

/**
 *
 * @author Eduardo Hernandez Gregorio
 */
public class Tutor extends Persona implements IPerfil, ICalificaciones {
    private Alumno alumno;
    
    Tutor(int id, String nombre, String apellido, String correo){
        super(id,nombre,apellido,correo);
    }
    
    @Override
    public void imprimirPerfil(){
    System.out.println("-----Prfil Tutor-----");
    System.out.print("ID: "+getId()+"\nNombre: " +getNombre()+"\nApellido: "+getApellido()+"\nCorreo: "+getCorreo());
    }  
    
    @Override
    public void mostrarCalificaciones(){
        System.out.println("La califiacion del alumno es: "+alumno.getCalificacion());
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    
    
}
