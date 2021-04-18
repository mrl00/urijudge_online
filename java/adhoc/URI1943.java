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
public class URI1943 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n == 1) System.out.println("Top 1");
        else if(n > 1 && n <= 3) System.out.println("Top 3");
        else if(n > 3 && n <= 5) System.out.println("Top 5");
        else if(n > 5 && n <= 10) System.out.println("Top 10");
        else if(n > 10 && n <= 25) System.out.println("Top 25");
        else if(n > 25 && n <= 50) System.out.println("Top 50");
        else if(n > 50 && n <= 100) System.out.println("Top 100");
    }
}
