/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.urijudgeonline.matematica;

import java.util.Scanner;

/**
 * 
 * @author Imaginatio
 */
public class URI1028 {
    private static int mdc(int a, int b) {         
        if(b == 0)             
            return a;
        else                 
            return mdc(b, a % b);     
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), f1, f2;
        for (int i = 0; i < n; i++) {
            f1 = input.nextInt();
            f2 = input.nextInt();
            System.out.println(mdc(f1, f2));
        }
    }
}
