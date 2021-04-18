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
public class URI1555 {
    private static int r(int x, int y) {
        return (int) (Math.pow(3 * x, 2) + Math.pow(y, 2));
    }
    private static int b(int x, int y) {
        return (int) (2 * Math.pow(x, 2) + Math.pow(5 * y, 2));
    }
    
    private static int c(int x, int y) {
        return (int) (-100 * x + Math.pow(y, 3));
    }
    
    private static String win(int x, int y) {
        int r = r(x, y), b = b(x, y), c = c(x, y);
        if(r > b && r > c) return "Rafael ganhou";
        else if(b > r && b > c) return "Beto ganhou";
        else return "Carlos ganhou";
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), x, y;
        for (int i = 0; i < n; i++) {
            x = input.nextInt();
            y = input.nextInt();
            System.out.println(win(x, y));
        }
    }
}
