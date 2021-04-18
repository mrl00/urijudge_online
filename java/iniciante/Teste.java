/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.urijudgeonline.iniciante;

import javax.swing.JOptionPane;

public class Teste {
    static int soma(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Enter first number");
        String num2 = JOptionPane.showInputDialog("Enter first number");
        
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num1);
        
        JOptionPane.showMessageDialog(null, " The sum is " + soma(a, b), "Sum of two Integers", JOptionPane.PLAIN_MESSAGE);
    }
    
}
