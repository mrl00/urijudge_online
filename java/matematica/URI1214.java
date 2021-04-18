/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.urijudgeonline.matematica;

import java.util.Scanner;

/**
 *
 * @author Kyoo
 */
public class URI1214 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c = input.nextInt();       
        for (int i = 0; i < c; i++) {
            final int n = input.nextInt();
            float med = 0, n2 = n;
            int count = 0;
            int[] notas = new int[n];
            
            for (int j = 0; j < n; j++) {
                notas[j] = input.nextInt();
                med += notas[j];
            }
            
            med /= n2;
            
            for (int j = 0; j < n; j++) {
                if(notas[j] > med) count++;
            } 
            System.out.printf("%.3f%c\n", ((100 * count) / n2),'%');
        }
    }
}
