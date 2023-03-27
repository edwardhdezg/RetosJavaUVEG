/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTextField;
/**
 *
 * @author Eduardo Hernandez Gregorio :D
 */
public class ListenButton implements ActionListener{
   
    private JButton boton0;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JButton boton6;
    private JButton boton7;
    private JButton boton8;
    private JButton boton9;
    private JButton botonMas;
    private JButton botonMenos;
    private JButton botonPor;
    private JButton botonEntre;
    private JButton botonIgual;
    private JButton botonBorrar;
    private JTextField textField;
    private Double valores;
    private ArrayList<Double> numeros = new ArrayList<Double>();
    private Double ultimoResultado;
    private Double ultimoValor=0.0;
    private String signo;
    public float primerNumero;
    
    
    public void recibeBoton0(JButton boton0){
        this.boton0=boton0;
    }
    public void recibeBoton1(JButton boton1){
        this.boton1=boton1;
    }
    public void recibeBoton2(JButton boton2){
        this.boton2=boton2;
    }
    public void recibeBoton3(JButton boton3){
        this.boton3=boton3;
    }
    public void recibeBoton4(JButton boton4){
        this.boton4=boton4;
    }
    public void recibeBoton5(JButton boton5){
        this.boton5=boton5;
    }
    public void recibeBoton6(JButton boton6){
        this.boton6=boton6;
    }
    public void recibeBoton7(JButton boton7){
        this.boton7=boton7;
    }
    public void recibeBoton8(JButton boton8){
        this.boton8=boton8;
    }
    public void recibeBoton9(JButton boton9){
        this.boton9=boton9;
    }
    public void recibeBotonMas(JButton botonMas){
        this.botonMas=botonMas;
    }
    public void recibeBotonMenos(JButton botonMenos){
        this.botonMenos=botonMenos;
    }
    public void recibeBotonPor(JButton botonPor){
        this.botonPor=botonPor;
    }
    public void recibeBotonIgual(JButton botonIgual){
        this.botonIgual=botonIgual;
    }
    public void recibeBotonEntre(JButton botonEntre){
        this.botonEntre=botonEntre;
    }
    public void recibeBotonBorrar(JButton botonBorrar){
        this.botonBorrar=botonBorrar;
    }
    public void recibeTextField(JTextField textField){
        this.textField=textField;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==boton0){
            System.out.println("se hizo click en boton 0");
            this.textField.setText(this.textField.getText()+"0");
        }
        if(e.getSource()==boton1){
            if(this.textField.getText().equals("+")  || this.textField.getText().equals("*") || this.textField.getText().equals("/")){
                this.textField.setText("");
            }
            else if(this.textField.getText().equals("-")){
                System.out.println("No quites el signo");
            }
            System.out.println("se hizo click en boton1");
            this.textField.setText(this.textField.getText()+"1");
        }
        if(e.getSource()==boton2){
            if(this.textField.getText().equals("+")  || this.textField.getText().equals("*") || this.textField.getText().equals("/")){
              this.textField.setText("");
            }
            else if(this.textField.getText().equals("-")){
                System.out.println("No quites el signo");
            }
            System.out.println("se hizo click en boton 2");
            this.textField.setText(this.textField.getText()+"2");
        }
        if(e.getSource()==boton3){
            if(this.textField.getText().equals("+") || this.textField.getText().equals("*") || this.textField.getText().equals("/")){
              this.textField.setText("");
            }
            else if(this.textField.getText().equals("-")){
                System.out.println("No quites el signo");
            }
            System.out.println("se hizo click en boton 3");
            this.textField.setText(this.textField.getText()+"3");
        }
        if(e.getSource()==boton4){
            if(this.textField.getText().equals("+") || this.textField.getText().equals("*") || this.textField.getText().equals("/")){
              this.textField.setText("");
            }
            else if(this.textField.getText().equals("-")){
                System.out.println("No quites el signo");
            }
            System.out.println("se hizo click en boton 4");
            this.textField.setText(this.textField.getText()+"4");          
        }
        if(e.getSource()==boton5){
            if(this.textField.getText().equals("+")  || this.textField.getText().equals("*") || this.textField.getText().equals("/")){
              this.textField.setText("");
            }
            else if(this.textField.getText().equals("-")){
                System.out.println("No quites el signo");
            }
            System.out.println("se hizo click en boton 5");
            this.textField.setText(this.textField.getText()+"5");           
        }
        if(e.getSource()==boton6){
            if(this.textField.getText().equals("+") || this.textField.getText().equals("*") || this.textField.getText().equals("/")){
              this.textField.setText("");
            }
            else if(this.textField.getText().equals("-")){
                System.out.println("No quites el signo");
            }
            System.out.println("se hizo click en boton 6");
            this.textField.setText(this.textField.getText()+"6");
        }
        if(e.getSource()==boton7){
            if(this.textField.getText().equals("+") || this.textField.getText().equals("*") || this.textField.getText().equals("/")){
              this.textField.setText("");
            }
            else if(this.textField.getText().equals("-")){
                System.out.println("No quites el signo");
            }
            System.out.println("se hizo click en boton 7");
            this.textField.setText(this.textField.getText()+"7");           
        }
        if(e.getSource()==boton8){
            if(this.textField.getText().equals("+") || this.textField.getText().equals("*") || this.textField.getText().equals("/")){
              this.textField.setText("");
            }
            else if(this.textField.getText().equals("-")){
                System.out.println("No quites el signo");
            }
            System.out.println("se hizo click en boton 8");
            this.textField.setText(this.textField.getText()+"8");          
        }
        if(e.getSource()==boton9){
            if(this.textField.getText().equals("+")  || this.textField.getText().equals("*") || this.textField.getText().equals("/")){
              this.textField.setText("");
            }
            else if(this.textField.getText().equals("-")){
                System.out.println("No quites el signo");
            }
            System.out.println("se hizo click en boton 9");
            this.textField.setText(this.textField.getText()+"9");           
        }
        if(e.getSource()==botonBorrar){
           System.out.println("se hizo click en boton Borrar");
           this.textField.setText("");
           numeros.clear();
        }
        if(e.getSource()==botonIgual){
           if(this.textField.getText().equals("")){
               System.out.println("entro en if boton igual sin valores");
           }else{
                switch (signo){
               case "+" -> {
                   System.out.println("se hizo clic en boon igual OP SUMA---");
                   valores=Double.parseDouble(this.textField.getText());
                   numeros.add(valores);
                   ultimoValor = numeros.get(numeros.size() - 1); // Obtener el último valor introducido
                   Double suma = 0.0;
                   for (int i = 0; i < numeros.size() - 1; i++) { // Iterar sobre todos los valores excepto el último
                       suma += numeros.get(i);
                   }
                   this.textField.setText("+");
                   Double resultado = ultimoValor + suma;
                   ultimoResultado=resultado;
                   numeros.add(ultimoResultado);
                   numeros.clear();
                }
               case "-" -> {
                   Double actual = 0.0;
                   Double nuevoValor;
                   System.out.println("se hizo clic en boon igual OP RESTA---");
                   valores=Double.parseDouble(this.textField.getText());
                   numeros.add(valores);
                   ultimoValor = numeros.get(numeros.size() - 1); // Obtener el último valor introducido
                   for (int i = 0; i < numeros.size() - 1; i++) { // Iterar sobre todos los valores excepto el último
                       actual=numeros.get(i);
                       //nuevoValor = actual -(ultimoValor) ;
                   }
                   System.out.println("Obtiene el primer valor del arreglo" +actual);
                   System.out.println("Obtiene eultimo valor captado en pantalla " +this.textField.getText());
                   nuevoValor=actual-(-(ultimoValor));
                   ultimoValor=nuevoValor; 
                   this.textField.setText("-");
                   ultimoResultado=ultimoValor;
                   numeros.add(ultimoResultado);
                   numeros.clear();
                }
               case "*" -> {
                   System.out.println("se hizo clic en boon igual OP MILTIPLICA---");
                   valores=Double.parseDouble(this.textField.getText());
                   numeros.add(valores);
                   ultimoValor = numeros.get(numeros.size() - 1); // Obtener el último valor introducido
                   for (int i = 0; i < numeros.size() - 1; i++) { // Iterar sobre todos los valores excepto el último
                       Double actual=numeros.get(i);
                       Double nuevoValor = actual * ultimoValor;
                       ultimoValor=nuevoValor;
                   }
                   this.textField.setText("*");
                   ultimoResultado=ultimoValor;
                   numeros.add(ultimoResultado);
                   numeros.clear();
                }
               case "/" -> {
                   System.out.println("se hizo clic en boon igual OP DIVIDE---");
                   valores=Double.parseDouble(this.textField.getText());
                   numeros.add(valores);
                   ultimoValor = numeros.get(numeros.size() - 1); // Obtener el último valor introducido
                   for (int i = 0; i < numeros.size() - 1; i++) { // Iterar sobre todos los valores excepto el último
                       Double actual=numeros.get(i);
                       Double nuevoValor = actual / ultimoValor;
                       ultimoValor=nuevoValor;
                   }
                   this.textField.setText("*");
                   ultimoResultado=ultimoValor;
                   numeros.add(ultimoResultado);
                   numeros.clear();
                }
               
            }
                String resulToString = Double.toString(ultimoResultado);
                this.textField.setText(resulToString);
                
           }
          
            
         }
        if(e.getSource()==botonMas){
            if(this.textField.getText().matches(".*\\d.*")){ //Verifica si existe un numero entero
                System.out.println(this.textField.getText());
                valores=Double.parseDouble(this.textField.getText());
                numeros.add(valores);
                System.out.println("se hizo click en boton Sumar");
                this.textField.setText("+");
                signo="+";
            }else{
                System.out.println("no hacer nada");
            }  
        }
        if(e.getSource()==botonMenos){
           //If en caso de que se introduzca un valor negativo al principio de la operacion
           switch (this.textField.getText()) {
               case "":
                   System.out.println("Entro en if Menos para un numero negativo");
                   this.textField.setText("-");
                   break;
               case "-":
                   System.out.println("Entro en case Menos para el segungo valor en negativo");
                   break;
               default:
                   System.out.println("Entro en else Menos para una operacion ");
                   valores=Double.parseDouble(this.textField.getText());
                   numeros.add(valores);
                   System.out.println("se hizo click en boton Menos");
                   System.out.println(this.textField.getText());
                   this.textField.setText("-");
                   signo="-";
                   break;
           }
          
        }
        if(e.getSource()==botonPor){
            if(this.textField.getText().matches(".*\\d.*")){ //Verifica si existe un numero entero en pantalla
            System.out.println(this.textField.getText());
            valores=Double.parseDouble(this.textField.getText());
            numeros.add(valores);
            System.out.println("se hizo click en boton Por");
            this.textField.setText("*");
            signo="*";
            }else{
                System.out.println("no hacer nada");
            }
           
        }
        if(e.getSource()==botonEntre){
            if(this.textField.getText().matches(".*\\d.*")){ //Verifica si existe un numero entero en pantalla
            System.out.println(this.textField.getText());
            valores=Double.parseDouble(this.textField.getText());
            numeros.add(valores);
            System.out.println("se hizo click en boton Entre");
            this.textField.setText("/");
            signo="/";
            }else{
                System.out.println("no hacer nada");
            }
            
        }
        
    }
}
