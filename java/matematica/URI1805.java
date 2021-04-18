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
public class URI1805 {
    private static long Σ(long x) {
        return (x * (x + 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        long b = input.nextLong();
        //System.out.println(Σ(a));
        //System.out.println(Σ(b));
        System.out.println(Σ(b) - Σ(a) + a);
    }
}
