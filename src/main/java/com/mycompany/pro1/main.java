/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pro1;

import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class main{
    private String nom;

public static void main(String[] args){
    
    nom  = JOptionPane.showInputDialog("Ingrese su Nombre");
    JOptionPane.showMessageDialog (

null,"Bienvenido "+nom);
}
}