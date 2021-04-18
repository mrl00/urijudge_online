/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.urijudgeonline.matematica;

import java.util.Scanner;

/**
 *
 * @author Kyoo
 */
public class URI1197 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()) {
            int v = input.nextInt();
            int t = input.nextInt();
            System.out.println((v * 2) * t);
        }
    }
}
