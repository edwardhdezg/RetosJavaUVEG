/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.olimpiadas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Eduardo Hernandez Gregorio
 */
public class ListenButton implements ActionListener {
    private JButton  botonRegistrar;
    private JButton  botonIniciar;
    private JButton  botonReiniciar;
    private JButton  botonTerminar;
    private JTextArea areaTexto;
    private JTextArea areaNombres;
    private JTextField campoNombre;
    private ArrayList<String> nombres = new ArrayList();
    
    public void recibeCampoNombre(JTextField campoNombre){
    this.campoNombre=campoNombre;
    }
    public void recibeAreaNombres(JTextArea areaNombres){
        this.areaNombres=areaNombres;
    }
   
    public void recibeAreaTexto(JTextArea areaTexto){
       this.areaTexto=areaTexto;
    }
    
    public void recibeBotonRegistrar(JButton  botonRegistrar){
        this.botonRegistrar=botonRegistrar;
        
    }
    
    public void recibeBotonIniciar(JButton  botonIniciar){
        this.botonIniciar=botonIniciar;
    }
    
    public void recibeBotonReiniciar(JButton  botonReiniciar){
        this.botonReiniciar=botonReiniciar;
    }
    
    public void recibeBotonTerminar(JButton  botonTerminar){
        this.botonTerminar=botonTerminar;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonRegistrar) {
            // Definir un patrón de nombre valido Ejemplo: Nombre Apellido
            Pattern patronNombre = Pattern.compile("[A-Z][a-z]+\\s[A-Z][a-z]+");
            
            System.out.println(this.campoNombre.getText());
            if (patronNombre.matcher(this.campoNombre.getText()).matches()) {
                System.out.println("Es un nombre valido");
                if(nombres.contains(this.campoNombre.getText())){
                    System.out.println("Ya existe ese participante");
                    JOptionPane.showMessageDialog(null, "El participante ya existe", "Alerta", JOptionPane.WARNING_MESSAGE);
                }else{
                    if(nombres.isEmpty() || nombres.size()<5){
                        nombres.add(this.campoNombre.getText());
                        this.campoNombre.setText("");
                    }else{
                        JOptionPane.showMessageDialog(null, "Ya no puede haber mas participantes ", "Alerta", JOptionPane.WARNING_MESSAGE);
                    }
                }
            } else {
                System.out.println("El texto no es un nombre válido.");
                JOptionPane.showMessageDialog(null, "No es un nombre válido, Ejemplo: Eduardo Hernandez", "Error", JOptionPane.WARNING_MESSAGE);
            }
            muestraNombres();
        } else if (e.getSource() == botonIniciar) {
            if(nombres.isEmpty()){
                System.out.println("No se puede iniciar a carrera sin participantes");
                JOptionPane.showMessageDialog(null, "No se puede iniciar a carrera sin participantes", "Alerta", JOptionPane.WARNING_MESSAGE);
            }else if(nombres.size()<5){
                JOptionPane.showMessageDialog(null, "Debe de haber al menos 5 participantes ", "Alerta", JOptionPane.WARNING_MESSAGE);
            }else{
                // Crear una instancia de SimulacionCarrera
                SimulacionCarrera simulacion = new SimulacionCarrera(nombres);
                // Crear un hilo para ejecutar la simulación
                Thread hiloSimulacion = new Thread(simulacion);
                hiloSimulacion.start();

                try {
                    // Esperar a que termine la simulación
                    hiloSimulacion.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(ListenButton.class.getName()).log(Level.SEVERE, null, ex);
                }

                // Obtener el resultado de la simulación como un String
               
                String resultado = simulacion.getResultado();
                this.areaTexto.setText(resultado);
            }
        } else if (e.getSource() == botonReiniciar) {
            nombres.clear();
            muestraNombres();
            this.areaTexto.setText("");
        } else if (e.getSource() == botonTerminar) {
             System.exit(0);
        }
          
    }
    
    public void muestraNombres(){
        StringBuilder sb = new StringBuilder();
        for (String nombre : nombres) {
            sb.append(nombre).append("\n");
        }
        this.areaNombres.setText(sb.toString());
    }
    
    
}
