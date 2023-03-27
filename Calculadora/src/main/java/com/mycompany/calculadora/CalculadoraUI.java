/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author @author Eduardo Hernandez Gregorio :D
 */
class CalculadoraUI extends JFrame{
    private JTextField textField;
    private ListenButton listenButton;
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

    

  
    public CalculadoraUI() {
        super("Calculadora");
        // Crear los botones
        boton1 = new JButton("1");
        boton1.setPreferredSize(new Dimension(80, 80));
        boton2 = new JButton("2");
        boton2.setPreferredSize(new Dimension(80, 80));
        boton3 = new JButton("3");
        boton3.setPreferredSize(new Dimension(80, 80));
        boton4 = new JButton("4");
        boton4.setPreferredSize(new Dimension(80, 80));
        boton5 = new JButton("5");
        boton5.setPreferredSize(new Dimension(80, 80));
        boton6 = new JButton("6");
        boton6.setPreferredSize(new Dimension(80, 80));
        boton7 = new JButton("7");
        boton7.setPreferredSize(new Dimension(80, 80));
        boton8 = new JButton("8");
        boton8.setPreferredSize(new Dimension(80, 80));
        boton9 = new JButton("9");
        boton9.setPreferredSize(new Dimension(80, 80));
        boton0 = new JButton("0");
        boton0.setPreferredSize(new Dimension(80, 80));
        botonMas = new JButton("+");
        botonMas.setPreferredSize(new Dimension(80, 80));
        botonMenos = new JButton("-");
        botonMenos.setPreferredSize(new Dimension(80, 80));
        botonPor = new JButton("*");
        botonPor.setPreferredSize(new Dimension(80, 80));
        botonEntre = new JButton("/");
        botonEntre.setPreferredSize(new Dimension(80, 80));
        botonIgual = new JButton("=");
        botonIgual.setPreferredSize(new Dimension(80, 80));
        botonBorrar = new JButton("C");
        botonBorrar.setPreferredSize(new Dimension(80, 80));

        // Crear el campo de texto
        textField = new JTextField(20);
        textField.setEditable(false);
        textField.setPreferredSize(new Dimension(320, 50));
        textField.setHorizontalAlignment(JTextField.LEFT);
        

        // Crear el panel de botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(4, 4, 4, 4));
        panelBotones.add(boton1);
        panelBotones.add(boton2);
        panelBotones.add(boton3);
        panelBotones.add(botonMas);
        
        panelBotones.add(boton4);
        panelBotones.add(boton5);
        panelBotones.add(boton6);
        panelBotones.add(botonMenos);
        
        panelBotones.add(boton7);
        panelBotones.add(boton8);
        panelBotones.add(boton9);
        panelBotones.add(botonPor);
        
        panelBotones.add(botonBorrar);
        panelBotones.add(boton0);
        panelBotones.add(botonIgual);
        panelBotones.add(botonEntre);
        // Crear el panel principal y agregar los componentes
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.add(textField, BorderLayout.NORTH);
        panelPrincipal.add(panelBotones, BorderLayout.CENTER);
        
        
        //Instancia de la clase oyente
        listenButton=new ListenButton();
        
        listenButton.recibeBoton0(boton0);
        boton0.addActionListener(listenButton);
        
        listenButton.recibeBoton1(boton1);
        boton1.addActionListener(listenButton);
        
        listenButton.recibeBoton2(boton2);
        boton2.addActionListener(listenButton);
        
        listenButton.recibeBoton3(boton3);
        boton3.addActionListener(listenButton);
        
        listenButton.recibeBoton4(boton4);
        boton4.addActionListener(listenButton);
        
        listenButton.recibeBoton5(boton5);
        boton5.addActionListener(listenButton);
        
        listenButton.recibeBoton6(boton6);
        boton6.addActionListener(listenButton);
        
        listenButton.recibeBoton7(boton7);
        boton7.addActionListener(listenButton);
        
        listenButton.recibeBoton8(boton8);
        boton8.addActionListener(listenButton);
        
        listenButton.recibeBoton9(boton9);
        boton9.addActionListener(listenButton);
        
       listenButton.recibeBotonMas(botonMas);
       botonMas.addActionListener(listenButton);
       
       listenButton.recibeBotonMenos(botonMenos);
       botonMenos.addActionListener(listenButton);
       
       listenButton.recibeBotonPor(botonPor);
       botonPor.addActionListener(listenButton);
       
       listenButton.recibeBotonEntre(botonEntre);
       botonEntre.addActionListener(listenButton);
       
       listenButton.recibeBotonIgual(botonIgual);
       botonIgual.addActionListener(listenButton);
       
       listenButton.recibeBotonBorrar(botonBorrar);
       botonBorrar.addActionListener(listenButton);
       listenButton.recibeTextField(textField);
       
        
        // Configurar la ventana
        this.setContentPane(panelPrincipal);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

