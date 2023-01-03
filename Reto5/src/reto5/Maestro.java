/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5;

/**
 *
 * @author Eduardo Hernandez Gregorio
 */
public class Maestro extends Persona implements IPerfil {
    
    
    
    Maestro(int id, String nombre, String correo, String apellido){
        super(id,nombre,correo,apellido);
    }
    
    @Override
    public void imprimirPerfil(){
    System.out.println("-----Prfil Maestro-----");
    System.out.print("ID: "+getId()+"\nNombre: " +getNombre()+"\nApellido: "+getApellido()+"\nCorreo: "+getCorreo());
         
    }  
    
}
