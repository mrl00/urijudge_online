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
public class URI1169 {
    private static long numGraos(long n) {
        return (long) (Math.pow(2, n) - 1);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), x;
        for (int i = 0; i < n; i++) {
            x = input.nextInt();
            System.out.println((long) (numGraos(64) / 12000) + " kg");
        }
    }
}
