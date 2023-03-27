/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto3;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Administrador
 */
public class JTattoUI {
    public JTattoUI() {
    // Establecer look and feel de JTatto
    try {
        UIManager.setLookAndFeel(new HiFiLookAndFeel());
    } catch (UnsupportedLookAndFeelException e) {
        e.printStackTrace();
    }

    // Inicializar la ventana
    JFrame ventana = new JFrame("Interfaz");
    ventana.setSize(400, 300);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Inicializar el panel
    JPanel panel = new JPanel(new GridLayout(3, 2));

    // Inicializar la etiqueta
    JLabel etiqueta = new JLabel("Ingrese su nombre:");

    // Inicializar el campo de texto
    JTextField campoTexto = new JTextField();

    // Inicializar el botón
    JButton boton = new JButton("Boton");
    
    // Inicializar el checkbox
    JCheckBox checkBox = new JCheckBox("Aceptar términos y condiciones");
        // Inicializar el radio button 1
    JRadioButton radioBoton1 = new JRadioButton("Opción 1");
    // Inicializar el radio button 2
    JRadioButton radioBoton2 = new JRadioButton("Opción 2");
    
    // Agregar componentes al panel
    panel.add(etiqueta);
    panel.add(campoTexto);
    panel.add(boton);
    panel.add(checkBox);
    panel.add(radioBoton1);
    panel.add(radioBoton2);

    

    // Agregar panel a la ventana
    ventana.add(panel);

    // Hacer visible la ventana
    ventana.setVisible(true);
}
}

