/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.urijudgeonline.iniciante;

import java.util.Scanner;

/**
 *
 * @author m2l
 */


public class URI1557 {
    public static void printMatrix(int n) {
        int h = 1, count = 0;
        String s = "%" + (n > 2? n - 1 : n) + "d";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                h = (int) Math.pow(2, j + count);
                System.out.printf(s, h);
            }
            count++;
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p;
        do {            
            p = input.nextInt();
            printMatrix(p);
        } while (p != 0);
    }
}
