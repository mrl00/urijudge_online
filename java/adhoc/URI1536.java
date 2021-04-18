/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.urijudgeonline.adhoc;

import java.util.Scanner;

/**
 * 
 * @author Imaginatio
 */
public class URI1536 {
    static int compara(int[] g, int s){
        int k = 0;
        int[] h = new int[g.length];
        for (int i = 0; i < g.length; i++) {
            h[i] = g[i] - s;
            if(h[i] == 1 || h[i] == -1) {
                k = i;
                break;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int indice = 0;
            int qt = input.nextInt();
            int s = input.nextInt();
            int[] g = new int[qt];
            for (int j = 0; j < g.length; j++) {
                g[j] = input.nextInt();
                if(g[j] == s) indice = j;
                else indice = compara(g, s);
            }
            System.out.println(indice + 1);
        }
    }
}
