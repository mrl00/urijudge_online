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
public class URI1219 {
    private static double girassois(int a, int b, int c) {
        return Math.PI * Math.pow(c / 2.0, 2) - areaTriangulo(a, b, c);
    }
    private static double rosas(int a, int b, int c) {
        return Math.pow((Math.sqrt(b) / (double) a), 2) * Math.PI;
    }
    
    private static double violetas(int a, int b, int c) {
        return  areaTriangulo(a, b, c) - rosas(a, b, c);
    }
    
    private static double areaTriangulo(int a, int b, int c) {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        while (input.hasNext()) {
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
            System.out.printf("%.4f %.4f %.4f\n", girassois(a, b, c), violetas(a, b, c), rosas(a, b, c));
            
        }
    }
}
