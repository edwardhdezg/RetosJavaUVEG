/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

/**
 *
 * @author Administrador
 */
public class Eventos implements ActionListener{

    private JButton botonA;
    private JButton botonB;
    private JButton botonC;

    public void recibeBoton1(JButton botonA){
        this.botonA=botonA;
    }
    public void recibeBoton2(JButton botonB){
        this.botonB=botonB;
    }
    public void recibeBoton3(JButton botonC){
        this.botonC=botonC;
    }
     @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==botonA){
            System.out.println("se hizo click en boton A");
            JTattoUI correr = new JTattoUI();
            
        }
       if(e.getSource()==botonB){
            System.out.println("se hizo click en boton B");
            SwingUtilities.invokeLater(() -> new FlatLafUI());
        }
        if(e.getSource()==botonC){
            System.out.println("se hizo click en boton C");
            NimbusUI interfaz = new NimbusUI();
        }
    }
}
