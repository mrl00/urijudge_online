/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.urijudgeonline.adhoc;

import java.util.Scanner;

/**
 * 
 * @author Imaginatio
 */
public class URI1769 {
    
    static void cpf(String s) {
        int[] n = new int[9];
        int b1 = 0;
        int b2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i % 4 != 0) n[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        for (int i = 0; i < 7; i++) {
            b1 += n[i] ;
            b2 += n[6 - i];
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 1000; i++) {
            String s = input.nextLine();
            if(s.length() != 11) System.out.println("CPF invalido");
        }
    }
}
