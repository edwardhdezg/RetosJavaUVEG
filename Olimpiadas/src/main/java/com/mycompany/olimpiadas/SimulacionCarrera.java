/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.olimpiadas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JTextArea;

/**
 *
 * @author Eduardo Hernandez Gregorio
 */
public class SimulacionCarrera implements Runnable {
    private ArrayList<String> nombres;

    public SimulacionCarrera(ArrayList<String> nombres) {
        this.nombres = nombres;
    }

    @Override
    public void run() {
        Random rand = new Random();
        int distanciaTotal = 100;
        int[] posiciones = new int[nombres.size()];
        int[] velocidades = new int[nombres.size()];

        // Inicializar las posiciones y velocidades aleatoriamente
        for (int i = 0; i < nombres.size(); i++) {
            posiciones[i] = 0;
            velocidades[i] = rand.nextInt(10) + 1; // Velocidad entre 1 y 10
        }

        // Simulación de la carrera
        for (int segundo = 1; segundo <= 5; segundo++) {
            for (int i = 0; i < nombres.size(); i++) {
                // Avanzar la posición del jugador i
                posiciones[i] += velocidades[i];
            }

            // Esperar un momento para actualizar
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public String getResultado() {
        StringBuilder sb = new StringBuilder();
        int[] posiciones = new int[nombres.size()];
        Random rand = new Random();

        // Inicializar las posiciones aleatoriamente
        for (int i = 0; i < nombres.size(); i++) {
            posiciones[i] = rand.nextInt(10) + 1; // Posición entre 1 y 10
        }

        // Avanzar las posiciones aleatoriamente hasta el quinto segundo
        for (int segundo = 1; segundo <= 5; segundo++) {
            for (int i = 0; i < nombres.size(); i++) {
                posiciones[i] += rand.nextInt(10) + 1; // Velocidad entre 1 y 10
            }

            if (segundo == 5) {
                // Agregar el texto correspondiente al quinto segundo al StringBuilder
                for (int i = 0; i < nombres.size(); i++) {
                    String nombre = nombres.get(i);
                    int posicion = posiciones[i];
                    sb.append(nombre).append(" - Tiempo:  ").append(posicion).append(" segundos \n");
                }
            }
        }

        return sb.toString();
    }
}