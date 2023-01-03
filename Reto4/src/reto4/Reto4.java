/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto4;
import java.util.Scanner;
/**
 *
 * @author Eduardo Hernandez Gregorio
 */
public class Reto4 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("----Tarjeta de credito----");
        TarjetaCredito tarjeta1 = new TarjetaCredito(0);
        System.out.println("Se aperturo su cuenta con un monto de: $"+tarjeta1.getMontoActual());
        //Asignando un salgo negrativo de -200 a la tarjeta de credito
        tarjeta1.setMontoActual(-200);
        System.out.println("Usted tiene un saldo de: $"+tarjeta1.getMontoActual());
        System.out.println("Ingrese la cantidad a depositar:");
        double deposito = sc.nextDouble();
        tarjeta1.depositar(deposito);
        System.out.println("Se deposito a su tarjta: $"+deposito+"  su saldo actual es de: $"+tarjeta1.getMontoActual());
        System.out.println("Ingrese el monto para sumar intereses:");
        double intereses = sc.nextDouble();
        tarjeta1.sumarInteres(intereses);
        System.out.println("su saldo actual es de: $"+tarjeta1.getMontoActual());
        System.out.println("---------------------");
        System.out.println("----Tarjeta de debito----");
        TarjetaDebito tarjeta2 = new TarjetaDebito(0);
        System.out.println("Se aperturo su cuenta con un monto de: $"+tarjeta2.getMontoActual());
        System.out.println("Ingrese la cantidad a depositar: $");
        double depositar = sc.nextDouble();
        tarjeta2.depositar(depositar);
        System.out.println("su saldo actual es de: $"+tarjeta2.getMontoActual());
        System.out.println("Ingrese la cantidad a retirar: $");
        double retirar = sc.nextDouble();
        tarjeta2.retirar(retirar);
        System.out.println("su saldo actual es de: $"+tarjeta2.getMontoActual());
        System.out.println("----Cuenta de ahorro----");
        CuentaAhorro tarjeta3 = new CuentaAhorro(35000);
        System.out.println("Se aperturo su cuenta con un monto de: $"+tarjeta3.getMontoActual());
        System.out.println("Ingrese la cantidad a depositar: $");
        depositar = sc.nextDouble();
        tarjeta3.depositar(depositar);
        System.out.println("su saldo actual es de: $"+tarjeta3.getMontoActual());
        System.out.print("Ingrese la cantidad a invertir: $");
        double invertir = sc.nextDouble();
        tarjeta3.invertir(invertir);
        System.out.println("Su inversion aumento su saldo actual a: $"+tarjeta3.getMontoActual());

    }
    
}
