/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto4;

/**
 *
 * @author Eduardo Hernandez Gregorio
 */
public class CuentaAhorro extends Cuenta {
    private double inversion;
    private double interes=0.1;
    CuentaAhorro(double apertura){
        super(apertura);
    }
    
     public void invertir(double cantidad){
          inversion+=cantidad;
          setMontoActual(inversion);
          inversion=getMontoActual()*interes;
          setMontoActual(inversion);
     }
    
}
