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
public class URI1429 {
    private static long fatorial(int n) {
        long x = 1;
        if(n == 0) return 1;
        else {
            for (int i = 2; i <= n; i++) x *= i;
            return x;
        }
    }
    
    private static int acm(String s) {
        int[] v = new int[s.length()];
        int sum = 0;
        for (int i = 0; i < v.length; i++) 
            v[s.length() - 1 - i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        for (int i = 0; i < v.length; i++) 
            sum += v[i] * fatorial(i + 1);
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        do {            
            s = input.next();
            if(s.equals("0")) break;
            System.out.println(acm(s));
        } while (true);
        
    }
}
