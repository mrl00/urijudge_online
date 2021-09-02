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
public class URI1435 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix;
        int q;
        do {            
            q = input.nextInt();
            matrix = new int[q][q];
            
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if(!(j > i || j > q - (i + 1)))         matrix[i][j] = j + 1; //Esquerda
                    else if(!(j <= i || j >= q - (i + 1)))  matrix[i][j] = i + 1; //Cima
                    else if(!(j > i || j < q - (i + 1)))    matrix[i][j] = q - i; //Baixo
                    else if(!(j <= i || j <= q - (i + 2)))  matrix[i][j] = q - j;
                    else matrix[i][j] = 0;
                    if(j > 0) System.out.printf("%4d",matrix[i][j]);
                    else System.out.printf("  %d",matrix[i][j]);
                }
                System.out.println();
            }
            if(q != 0) System.out.println();
        } while (q != 0);
    }
}
