/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto4;

/**
 *
 * @author Eduardo Hernandez Gregorio
 */
public class Cuenta {
    private double montoActual=0;
    protected double apertura=0;
   
    Cuenta(double apertura){
        montoActual+=apertura;
    }
    
    public void depositar(double cantidad){
        montoActual+=cantidad;
    }
    public double getMontoActual() {
        return montoActual;
    }

    public void setMontoActual(double montoActual) {
        this.montoActual += montoActual;
    }
   
    
}   

