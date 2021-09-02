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
public class URI1190 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[12][12];
        char o = input.next(".").charAt(0);
        double count = 0, sum = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matrix[i][j] = input.nextDouble();
                if(j > i && j < 12 - (i + 1)){
                    sum += matrix[i][j];
                    count++;                   
                }
            }
        }
        if(o == 'S')
            System.out.printf("%.1f\n",sum);
        if(o == 'M')
            System.out.printf("%.1f\n", sum / count);
    }
}

