/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.urijudgeonline.outros;

/**
 * 
 * @author Imaginatio
 */
public class Encode {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        
        int key = 88;
        
        System.out.print("Original message: ");
        System.out.println(msg);
        
        //Codifica a mensagem
        for (int i = 0; i < msg.length(); i++) 
            encmsg += (char) (msg.charAt(i) ^ key);
        
        System.out.print("Encoded message: ");
        System.out.println(encmsg);
        
        //Decodifica mensagem
        for (int i = 0; i < msg.length(); i++) 
            decmsg += (char) (encmsg.charAt(i) ^ key);
        
        System.out.print("Decoded message: ");
        System.out.println(decmsg);
        
    }
}
