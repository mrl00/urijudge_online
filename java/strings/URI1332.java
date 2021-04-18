/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.urijudgeonline.strings;

import java.util.Scanner;

/**
 *
 * @author Kyoo
 */
public class URI1332 {
    public static int umDoisTres(String num) {
        int erro = 0;
        String um   = "one",
               dois = "two",
               tres = "three";
        
        if(num.length() == 3) {
            if((num.charAt(0) == 'o' && num.charAt(1) == 'n')) return 1;
            if((num.charAt(0) == 'o' && num.charAt(2) == 'e')) return 1;
            if((num.charAt(1) == 'n' && num.charAt(2) == 'e')) return 1;
            
            if((num.charAt(0) == 't' && num.charAt(1) == 'w')) return 2;
            if((num.charAt(0) == 't' && num.charAt(2) == 'o')) return 2;
            if((num.charAt(1) == 'w' && num.charAt(2) == 'o')) return 2;
        }
        if(num.length() == 5) {
            if((num.charAt(0) == 't' && num.charAt(1) == 'h' && num.charAt(2) == 'r'  && num.charAt(3) == 'e')) return 3;
            if((num.charAt(0) == 't' && num.charAt(1) == 'h' && num.charAt(2) == 'r'  && num.charAt(4) == 'e')) return 3;
            if((num.charAt(0) == 't' && num.charAt(1) == 'h' && num.charAt(3) == 'e'  && num.charAt(4) == 'e')) return 3;
            if((num.charAt(0) == 't' && num.charAt(2) == 'r' && num.charAt(3) == 'e'  && num.charAt(4) == 'e')) return 3;
            if((num.charAt(1) == 'h' && num.charAt(2) == 'r' && num.charAt(3) == 'e'  && num.charAt(4) == 'e')) return 3;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.next());
        
        for (int i = 0; i < n; i++) 
            System.out.println(umDoisTres(input.next()));
        
    }
}
