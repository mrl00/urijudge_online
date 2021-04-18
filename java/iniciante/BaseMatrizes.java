package br.com.urijudgeonline.iniciante;

/**
 * j == i || j == 12 - (i + 1)
 */


import java.util.Scanner;

/**
 *
 * @author Kyoo
 */
public class BaseMatrizes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] a = new int[12][12];
        
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if(j == i || j == 12 - (i + 1)) a[i][j] = 1;
                else a[i][j] = 0;
            }
        }
 
        //Immprime Matriz
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
