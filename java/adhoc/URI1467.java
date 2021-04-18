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
public class URI1467 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {            
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            if(a == b && b == c) System.out.println("*");
            if(a != b && b ==c) System.out.println("A");
            if(b != c && c == a) System.out.println("B");
            if(c != a && a == b) System.out.println("C");
        }
    }
}
