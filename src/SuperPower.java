/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whizkevina
 */
 import javax.swing.JOptionPane;
public class SuperPower {
    
    
 public static void main(String[] args) {
        // TODO code application logic here
        String power = JOptionPane.showInputDialog("What is your super power");
        power = power.toUpperCase();
        JOptionPane.showMessageDialog(null,power+" TO THE RESCUE");
        
    }
    
}
