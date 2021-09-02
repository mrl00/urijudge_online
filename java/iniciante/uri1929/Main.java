/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.urijudgeonline.iniciante;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Kyoo
 */
public class URI1929 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = input.nextInt();           
        }
        
        Arrays.sort(a);
        
        int soma = a[0] + a[1];
        int dife = a[3] - a[2];
        
        if((a[2] > soma || a[3] > soma) || (a[0] < dife || a[1] < dife)) 
            System.out.println("N");
        else 
            System.out.println("S");
    }
}
