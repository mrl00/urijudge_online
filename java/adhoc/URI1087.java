/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.urijudgeonline.adhoc;

/**
 * 
 * @author Imaginatio
 */
public class URI1087 {
    private int[][] tabXadrez() {
        int[][] xadrez = new int[8][8];
        for (int i = 0; i < xadrez.length; i++) {
            for (int j = 0; j < xadrez[i].length; j++) {
                xadrez[i][j] = i + 1;
            }
        }
        return xadrez;
    }
    public static void main(String[] args) {
        
    }
}
