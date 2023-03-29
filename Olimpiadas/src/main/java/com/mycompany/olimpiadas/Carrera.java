/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.olimpiadas;

import java.util.ArrayList;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 *
 * @author Eduardo Hernandez Gregorio
 */
public class Carrera implements Runnable {
    private String nombreParticipante;
    private int tiempoCarrera;
    private static int contador=1;
    private JTextArea areaTexto;
    private String resultado;
    
    public Carrera(String nombreParticipante,JTextArea areaTexto) {
        this.nombreParticipante = nombreParticipante;
        this.areaTexto=areaTexto;
        this.tiempoCarrera = (int) (Math.random() * 3000 + 1000); // tiempo entre 1 y 4 segundos
    }

    public String getNombreParticipante() {
        return nombreParticipante;
    }

    public int getTiempoCarrera() {
        return tiempoCarrera;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(tiempoCarrera);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        resultado = String.format("%d-%s Tiempo %d segundos.", contador, nombreParticipante, tiempoCarrera);
        contador++;
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                areaTexto.append(resultado + "\n");
            }
        });
    }
    
    public String getResultado(){
        return resultado;
    }
}
