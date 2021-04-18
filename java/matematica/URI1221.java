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
public class URI1221 {
    private static String primo(long x) {
        int count = 0;
        if(x == 2) return "Prime";
        if(x % 2 != 0 && x > 2) {
            for (long i = x; i >= 1; i -= 2) {
                if(x % i == 0) count++;
            }
            if(count == 2) return "Prime";
        }
        return "Not Prime";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long x;
        for (int i = 0; i < n; i++) {
            x = input.nextLong();
            System.out.println(primo(x));
        }
    }
}
