/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.urijudgeonline.adhoc;

import java.util.Scanner;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class URI1578 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 4;
        for (int i = 0; i < n; i++) {
            int m = input.nextInt();
            int ori[][] = new int[m][m];
            int atra[][] = new int[m][m];
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < m; k++) {
                    ori[j][k] = input.nextInt();
                    atra[j][k] = (int) Math.pow(ori[j][k], 2);
                }
            }
            System.out.printf("Quadrado da matriz #%d:\n", count);
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < m; k++) {
                    System.out.println();
                }
            }
            System.out.println();
            count++;
        }
    }
}
