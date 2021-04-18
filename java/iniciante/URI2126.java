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
public class URI2126 {

    private static void subsequencias(String str1, String str2, int i) {
        int ponto = 0, count = 0;
        do {
            int z = str2.indexOf(str1, ponto);
            if(z >= 0) ponto = z + str1.length();
            else break;
            count++;
        } while (ponto < str2.length());

        System.out.printf("Caso #%d:\n", i);
        
        if (count > 0) {
            System.out.println("Qtd.Subsequencias: " + count);
            System.out.println("Pos: " + (ponto - str1.length() + 1));
        } 
        else System.out.println("Nao existe subsequencia");
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        while (input.hasNext()) {
            String str1 = input.next();
            String str2 = input.next();
            subsequencias(str1, str2, i);
            i++;
        }

    }
}
