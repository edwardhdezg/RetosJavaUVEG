/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto4;

/**
 *
 * @author Eduardo Hernandez Gregorio
 */
public class TarjetaDebito extends Cuenta {
    private double monto;
    
    TarjetaDebito(double apertura){
        super(apertura);
    }
    
     
     public void retirar(double cantidad){
         monto=monto-cantidad;
         setMontoActual(monto);
     }
}
