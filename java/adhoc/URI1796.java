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
public class URI1796 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        int[] v = new int[q];
        int zero = 0;
        for (int i = 0; i < v.length; i++) {
            v[i] = input.nextInt();
            if(v[i] == 0) zero++;
        }
        if(zero > q/2) System.out.println("Y");
        else System.out.println("N");
    }
}
