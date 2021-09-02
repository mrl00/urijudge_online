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
public class URI1180 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menor = 0;
        int n = input.nextInt();
        int[] vetor = new int[n + 1];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = input.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] < vetor[i + 1]) menor = i;
        }
        System.out.println("Menor valor: " + vetor[menor]);
        System.out.println("Posicao: " + menor);
    }
}
