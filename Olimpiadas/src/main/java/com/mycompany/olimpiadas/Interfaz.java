package com.mycompany.olimpiadas;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Eduardo Hernandez Gregorio
 */

public class Interfaz extends JFrame {

    private JTextField campoNombre;
    private JButton botonRegistrar;
    private JTextArea areaNombres;
    private JTextArea areaTexto;
    private JButton botonIniciar;
    private JButton botonReiniciar;
    private JButton botonTerminar;
  
    

    public Interfaz() {
        super("Olimpiadas UVEG");
        this.setLayout(new BorderLayout());

        // Panel superior para ingresar el nombre y registrar
        JPanel panelSuperior = new JPanel(new FlowLayout());
        panelSuperior.add(new JLabel("Nombre: "));
        campoNombre = new JTextField(20);
        panelSuperior.add(campoNombre);
        botonRegistrar = new JButton("Registrar");
        panelSuperior.add(botonRegistrar);

        // Panel central para mostrar los nombres ingresados
        JPanel panelCentral = new JPanel(new BorderLayout());
        panelCentral.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        areaNombres = new JTextArea(10, 30);
        areaNombres.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaNombres);
        panelCentral.add(scroll, BorderLayout.CENTER);
        JLabel etiqueta = new JLabel("Participantes: ");
        etiqueta.setHorizontalAlignment(JLabel.CENTER);
        panelCentral.add(etiqueta, BorderLayout.NORTH);

        // Panel inferior para el área de texto y los botones de inicio, reinicio y fin
        JPanel panelInferior = new JPanel(new BorderLayout());
        panelInferior.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JLabel labelResultados = new JLabel("Resultados: ");
        labelResultados.setHorizontalAlignment(JLabel.CENTER);
        panelInferior.add(labelResultados, BorderLayout.NORTH);
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new BoxLayout(panelBotones, BoxLayout.Y_AXIS));
        botonIniciar = new JButton("Iniciar");
        panelBotones.add(botonIniciar);
        botonReiniciar = new JButton("Reiniciar");
        panelBotones.add(botonReiniciar);
        botonTerminar = new JButton("Terminar");
        panelBotones.add(botonTerminar);
        areaTexto = new JTextArea(10, 30);
        areaTexto.setEditable(false);
        JScrollPane scroll2 = new JScrollPane(areaTexto);
        panelInferior.add(scroll2, BorderLayout.CENTER);
        panelInferior.add(panelBotones, BorderLayout.EAST);
        

        this.add(panelSuperior, BorderLayout.NORTH);
        this.add(panelCentral, BorderLayout.CENTER);
        this.add(panelInferior, BorderLayout.SOUTH);

        //Instancia de la clase oyente
        ListenButton listenButton=new ListenButton();
        botonRegistrar.addActionListener(listenButton);
        listenButton.recibeBotonRegistrar(botonRegistrar);
        botonIniciar.addActionListener(listenButton);
        listenButton.recibeBotonIniciar(botonIniciar);
        botonReiniciar.addActionListener(listenButton);
        listenButton.recibeBotonReiniciar(botonReiniciar);
        botonTerminar.addActionListener(listenButton);
        listenButton.recibeBotonTerminar(botonTerminar);
        listenButton.recibeAreaTexto(areaTexto);
        listenButton.recibeAreaNombres(areaNombres);
        listenButton.recibeCampoNombre(campoNombre);
        
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

}
