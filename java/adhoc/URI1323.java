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
public class URI1323 {
    private static int Σ(int n) {
        return (n * (n + 1) * (2 * n + 1)) / 6;
    }
    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);
        int n;
        do {       
            n = input.nextInt();
            if(n == 0) break;
            System.out.println(Σ(n));
        } while (true);
    }
}
