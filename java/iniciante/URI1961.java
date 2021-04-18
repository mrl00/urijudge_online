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
public class URI1961 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt(), c = input.nextInt(), q[] = new int[c];
        for (int i = 0; i < q.length; i++) q[i] = input.nextInt();
        for (int i = 1; i < q.length; ++i) 
            if(Math.abs(q[i - 1] - q[i]) > p) {System.out.println("GAME OVER"); return;}
        System.out.println("YOU WIN");
    }
}
