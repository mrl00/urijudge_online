/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.urijudgeonline.adhoc;

import java.util.Scanner;

/**
 *
 * @author m2l
 */
public class URI1129 {

    private static char analiseMatriz(int[] matriz) {
        char letras = 0;
        int index = 0;
        int preto = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] <= 127) {
                preto++;
                index = i;
            }
            
            if(preto != 1) letras = '*';
            else letras = (char) (index + 65);
        }
        return letras;
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int[][] matriz = null;

        do {
            n = input.nextInt();
            matriz = new int[n][5];
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 5; j++) {
                    matriz[i][j] = input.nextInt();
                }
                
                
                System.out.println(analiseMatriz(matriz[i]));
            }
            
        } while (n != 0);
    }
}
