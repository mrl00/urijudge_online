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
public class URI1181 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double soma =0;
        double[][] matrix = new double[12][12];
        int l = input.nextInt();
        char T = input.next(".").charAt(0);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
                if(i == l) {
                    soma += matrix[i][j];
                }
            }
        }
        if(T == 'S') System.out.printf("%.1f\n",soma);
        if(T == 'M') System.out.printf("%.1f\n",(soma/12));
    }
}
