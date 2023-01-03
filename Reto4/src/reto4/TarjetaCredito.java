/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto4;

/**
 *
 * @author Eduardo Hernandez Gregorio
 */
public class TarjetaCredito extends Cuenta {
    private double interes=0.15;
    private double totalInteres;
    
    
    TarjetaCredito(double apertura){
        super(apertura);
    }
   
     
    public void sumarInteres(double cantidad){
       totalInteres=totalInteres-cantidad;
       setMontoActual(totalInteres); 
       totalInteres=getMontoActual()*interes;
       setMontoActual(totalInteres);
    }
    
}
