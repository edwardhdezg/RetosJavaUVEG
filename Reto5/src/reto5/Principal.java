/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto5;
import java.util.Scanner;
/**
 *
 * @author Eduardo Hernandez Gregorio
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("----Creando perfil Mastro----");
        System.out.println("Introduce Id: ");
        int id = datos.nextInt();
        datos.nextLine();
        System.out.println("Introduce tu nombre: ");
        String nombre = datos.nextLine();
        System.out.println("Introduce tus apellido: ");
        String apellido = datos.nextLine();
         System.out.println("Introduce tu correo: ");
        String correo = datos.nextLine();
        Maestro profe1 = new Maestro(id,nombre,apellido,correo);
        profe1.imprimirPerfil();
        System.out.println();
        System.out.println("----Creando perfil Alumno----");
        System.out.println("Introduce Id: ");
        id = datos.nextInt();
        datos.nextLine();
        System.out.println("Introduce tu nombre: ");
        nombre = datos.nextLine();
        System.out.println("Introduce tus apellido: ");
        apellido = datos.nextLine();
        System.out.println("Introduce tu correo: ");
        correo = datos.nextLine();
        Alumno alumno1= new Alumno(id,nombre,apellido,correo);
        alumno1.imprimirPerfil();
        System.out.println("Calificacion actual");
        //Verficando que la calificacion del alumno se guardo correctamente
        System.out.println(alumno1.getCalificacion());
        System.out.println();
        System.out.println("----Creando perfil Tutor----");
        System.out.println("Introduce Id: ");
        id = datos.nextInt();
        datos.nextLine();
        System.out.println("Introduce tu nombre: ");
        nombre = datos.nextLine();
        System.out.println("Introduce tus apellido: ");
        apellido = datos.nextLine();
        System.out.println("Introduce tu correo: ");
        correo = datos.nextLine();
        Tutor tutor1 = new Tutor(id, nombre,apellido,correo);
        tutor1.imprimirPerfil();
        System.out.println();
        System.out.println("----Registrando calificacion del alumno---");
        tutor1.setAlumno(alumno1);
        System.out.println("Alumno: "+tutor1.getAlumno().getNombre());
        System.out.println("Introduzca calificacion:");
        int calificacion=datos.nextInt();        
        //Asignando calificacion al objeto alumno1
        tutor1.getAlumno().setCalificacion(calificacion);
        alumno1.mostrarCalificaciones();
        
        System.out.println("Calificacion actual Perfil Alumno");
        //Verficando que la calificacion del alumno se guardo correctamente
        System.out.println(alumno1.getCalificacion());
    }
     
}
