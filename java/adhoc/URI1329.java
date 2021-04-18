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
public class URI1329 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {    
            int maria = 0;
            int joao = 0;
            int vezes = input.nextInt();
            if(vezes == 0) break;
            for (int i = 0; i < vezes; i++) {
                int j = input.nextInt();
                if(j == 0) maria++;
                else if(j == 1)joao++;
            }
            System.out.printf("Mary won %d times and John won %d times\n", maria, joao);
        }
    }
}
