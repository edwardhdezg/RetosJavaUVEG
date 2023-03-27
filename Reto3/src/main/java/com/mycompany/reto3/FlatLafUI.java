/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto3;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author Administrador
 */
public class FlatLafUI extends JFrame {
    public FlatLafUI() {
        setTitle("Ejemplo con FlatLaf");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Creamos los componentes gráficos
        JLabel label = new JLabel("Etiqueta:");
        JTextField textField = new JTextField();
        JButton button = new JButton("Botón");
        
        
        
        
        JCheckBox checkBox = new JCheckBox("CheckBox");
        JRadioButton radioButton = new JRadioButton("RadioButton");
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Opción 1", "Opción 2", "Opción 3"});

        // Configuramos los componentes con FlatLaf
        UIManager.put("Button.arc", 10);
        UIManager.put("Component.arc", 10);
        UIManager.put("ProgressBar.arc", 10);
        UIManager.put("ScrollBar.arc", 10);
        UIManager.put("Slider.arc", 10);
        UIManager.put("TabbedPane.arc", 10);

        // Agregamos los componentes al panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(checkBox);
        panel.add(radioButton);
        panel.add(comboBox);

        // Agregamos el panel al frame y lo hacemos visible
        setContentPane(panel);
        setVisible(true);
    }
}
