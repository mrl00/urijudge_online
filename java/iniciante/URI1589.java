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
public class URI1589 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int r1 = 0, r2 = 0;
        for (int i = 0; i < t; i++) {
            r1 = input.nextInt();
            r2 = input.nextInt();
            System.out.println(r1+r2);
        }      
    }
}
