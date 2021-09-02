/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.urijudgeonline.iniciante;

import java.util.Scanner;

/**
 *
 * @author m2l
 */
public class URI1962 {
    private static int ano(int n){
        int r = 2015 - n;
        return r >= 0 ? (r == 0 ? -1 : r) : r - 1;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int r = ano(input.nextInt());
            if(r > 0) System.out.println(r + " D.C.");
            else System.out.println(Math.abs(r) + " A.C.");
        }
    }
}
