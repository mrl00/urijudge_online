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
public class URI1765 {
    static double trapezio(double a, double b) {
        return ((a + b) * 5) / 2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {   
            int t = input.nextInt();
            if(t == 0) break;
            for (int i = 0; i < t; i++) {
                int n = input.nextInt();
                double a = input.nextDouble();
                double b = input.nextDouble();
                System.out.printf("Size #%d:\n", i + 1);
                System.out.printf("Ice Cream Used: %.2f cm2\n", trapezio(a, b) * n);
            }
            System.out.println();
        }
    }
}
