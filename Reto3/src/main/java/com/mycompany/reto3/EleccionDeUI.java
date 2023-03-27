/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto3;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Administrador
 */
public class EleccionDeUI extends JFrame {

    public EleccionDeUI() {
        // Configurar el tamaño de la ventana
        setSize(300, 200);

        // Configurar la disposición de los componentes en la ventana
        setLayout(new GridLayout(3, 1));
       

        // Crear los botones y agregarlos a la ventana
        JButton botonA = new JButton("Interfaz con Bilioteca JTatto");
        JButton botonB = new JButton("Interfaz con Bilioteca  FlatLaf");
        JButton botonC = new JButton("Interfaz con Biblioteca Nimbus Nimbus");

        add(botonA);
        add(botonB);
        add(botonC);

        Eventos event = new Eventos();
        event.recibeBoton1(botonA);
        botonA.addActionListener(event);
        event.recibeBoton2(botonB);
        botonB.addActionListener(event);
        event.recibeBoton3(botonC);
        botonC.addActionListener(event);
        
        
        // Hacer la ventana visible
        setVisible(true);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        
    }
}
