/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.urijudgeonline.matematica;

import java.util.Scanner;

/**
 *
 * @author Kyoo
 */
public class URI1161 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()) {
            int m = input.nextInt();
            int n = input.nextInt();
            if(m <= 20 && m >= 0 && n <= 20 && n >= 0) {
                long a = 1, b = 1;
                for (int i = 1; i <= m; i++) {
                    a *= i;
                }
                for (int i = 1; i <= n; i++) {
                    b *= i;
                }
                System.out.println(a + b);
            }
            else System.out.println("Out of range! See specification!");
        }
    }
}
