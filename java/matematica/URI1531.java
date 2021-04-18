/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.urijudgeonline.matematica;

import java.util.Scanner;

/**
 *
 * @author m2l
 */
public class URI1531 {

    private static long fib(long n) {
        if (n == 1) return 1;
        if (n == 0) return 0;
        return (long) Math.floor((Math.pow(1 + Math.sqrt(5), n) - Math.pow(1 - Math.sqrt(5), n)) / (Math.pow(2, n) * Math.sqrt(5)));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (input.hasNext()) {
            int n = input.nextInt();
            int m = input.nextInt();
            System.out.println(fib(n));
            System.out.println(fib(fib(n)));
            
            System.out.println((int) (fib(fib(n)) % m));
        }
    }
}
