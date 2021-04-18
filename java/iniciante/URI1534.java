/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.urijudgeonline.iniciante;

import java.util.Scanner;

/**
 *
 * @author Kyoo
 */
public class URI1534 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] m;
        int n;
        while (input.hasNext()) {
            n = input.nextInt();
            m = new int[n][n];
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    m[i][j] = 3;
                    if(j == i) m[i][j] = 1;
                    if(j == m.length - (i + 1)) m[i][j] = 2;
                }
            }
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    System.out.print(m[i][j]);
                }
                System.out.println("");
            }
        }
    }
}
