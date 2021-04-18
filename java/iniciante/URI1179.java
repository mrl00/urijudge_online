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
public class URI1179{
    static void esvaziarVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = 0;
        }
    }
    static boolean estaCheio(int[] v){
        return v[v.length - 1] != 0;
    }
    static void mostraVetorPar(int[] v) {
        for (int i = 0; i < v.length; i++) {
            if(v[i] == 0) break;
            System.out.printf("par[%d] = %d\n", i, v[i]);          
        }
    }
    static void mostraVetorImpar(int[] v) {
        for (int i = 0; i < v.length; i++) {
            if(v[i] == 0) break;
            System.out.printf("impar[%d] = %d\n", i, v[i]);          
        }
    }
    static void preencherVetor(int[] v, int n) {
        for (int i = 0; i < v.length; i++) {
            if(v[i] == 0) {
                v[i] = n;
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] par = new int[5];
        int[] impar = new int[5];
        for (int i = 0; i < 15; i++) {
            int n = input.nextInt();
            if(n % 2 == 0) {
                preencherVetor(par, n);
                if(estaCheio(par)) {
                    mostraVetorPar(par);
                    esvaziarVetor(par);
                }
            }
            else {
                preencherVetor(impar, n);
                if(estaCheio(impar)) {
                    mostraVetorImpar(impar);
                    esvaziarVetor(impar);
                }
            }
        }
        mostraVetorImpar(impar);
        mostraVetorPar(par);
    }
}
