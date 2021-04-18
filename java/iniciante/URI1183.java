package br.com.urijudgeonline.iniciante;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kyoo
 */
public class URI1183 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rd = new Random();
        double soma = 0,count = 0, media;
        double[][] matriz = new double[12][12];
        char o = input.next(".").charAt(0);
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rd.nextInt();
                System.out.print(matriz[i][j] + " ");
                if(!(j >= (i+1))) {
                    soma += matriz[i][j];
                    count++;
                }
                System.out.println("");
            }
        }
        if(o == 'S') 
            System.out.printf("%.1f\n", soma);        
        if(o == 'M')
            System.out.printf("%.1f\n", soma/count);
    }
}
