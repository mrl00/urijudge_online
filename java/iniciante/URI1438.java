/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.urijudgeonline.iniciante;

import java.util.Scanner;

/**
 *
 * @author m2l
 */
public class URI1438 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int q;
        int matrix[][];
        do { 
            q = input.nextInt();
            matrix = new int[q][q];
            
            for (int i = 0; i < q; i++) {
                for (int j = 0; j < q; j++) {
                    if(j <= i) matrix[i][j] = i - j + 1;
                    else if(j > i) matrix[i][j] = (i - j - 1) * -1;
                    
                    if(j > 0) System.out.printf("%4d", matrix[i][j]);
                    else System.out.printf("%3d", matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println();
        } while (q != 0);
    }
}
