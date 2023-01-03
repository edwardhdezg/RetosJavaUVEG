/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5;

/**
 *
 * @author Eduardo Hernandez Gregorio
 */
public abstract class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private String correo;

    public Persona(int id, String nombre,String apellido, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.apellido=apellido;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apelido) {
        this.apellido = apelido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
          
}
