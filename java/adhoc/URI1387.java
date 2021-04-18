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
public class URI1387 {
    static void soma(int a, int b) {
        System.out.println(a + b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {            
            int r = input.nextInt();
            int l = input.nextInt();
            if(r >= 1 && l >= 1 && r <= 5 && l <= 5) soma(r, l);
            else if(r == 0 && l == 0) break;
            else {
                System.out.println("Unable to generate output. Check your input.");
                break;
            }
        }
    }
}
