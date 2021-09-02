/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.urijudgeonline.iniciante;

import java.util.Scanner;

/**
 * 
 * @author Imaginatio
 */
public class URI1983 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        double[][] v = new double[h][2];
        double cnt = 8;
        int n = 0;
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                v[i][j] = input.nextDouble();
                if(v[i][1] >= cnt) {
                    cnt = v[i][1];
                    n = i;
                }
            }
        }
        if(v[n][1] >= 8) System.out.printf("%.0f\n", v[n][0]);
        else System.out.println("Minimum note not reached");
    }
}
