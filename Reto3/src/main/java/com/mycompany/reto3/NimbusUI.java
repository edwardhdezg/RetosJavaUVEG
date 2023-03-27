/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto3;

/**
 *
 * @author Administrador
 */
import javax.swing.*;
import java.awt.*;

public class NimbusUI extends JFrame {
    public NimbusUI() {
        // Establecer el Look and Feel Nimbus
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // Crear la ventana principal
        JFrame ventana = new JFrame("Interfaz con Nimbus");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 300);
        ventana.setLocationRelativeTo(null);

        // Crear los componentes gráficos
        JLabel etiqueta = new JLabel("Nombre:");
        JTextField campoTexto = new JTextField(20);
        JButton boton = new JButton("Aceptar");
        JCheckBox checkBox = new JCheckBox("Opción 1");
        JRadioButton radioButton1 = new JRadioButton("Opción 2");
        JRadioButton radioButton2 = new JRadioButton("Opción 3");
        String[] opciones = {"Opción 1", "Opción 2", "Opción 3"};
        JComboBox<String> comboBox = new JComboBox<>(opciones);

        // Crear el contenedor principal y agregar los componentes gráficos
        JPanel contenedor = new JPanel();
        contenedor.setLayout(new GridLayout(7, 1));
        contenedor.add(etiqueta);
        contenedor.add(campoTexto);
        contenedor.add(boton);
        contenedor.add(checkBox);
        contenedor.add(radioButton1);
        contenedor.add(radioButton2);
        contenedor.add(comboBox);

        // Agregar el contenedor principal a la ventana y mostrarla
        ventana.getContentPane().add(contenedor);
        ventana.setVisible(true);
    }
}
