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
public class URI1985 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double preco = 0;
        for (int i = 0; i < n; i++) {
            int prod = input.nextInt();
            int qtd = input.nextInt();
            if(prod == 1001) preco += 1.5 * qtd;
            if(prod == 1002) preco += 2.5 * qtd;
            if(prod == 1003) preco += 3.5 * qtd;
            if(prod == 1004) preco += 4.5 * qtd;
            if(prod == 1005) preco += 5.5 * qtd;
        }
        System.out.printf("%.2f\n", preco);
    }
}
