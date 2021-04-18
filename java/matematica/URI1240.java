/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.urijudgeonline.matematica;

import java.util.Scanner;

/**
 * 
 * @author Imaginatio
 */
public class URI1240 {
    private static String encaixa(String a, String b) {
        if(a.length() < b.length()) return "nao encaixa";
        else {
            if(a.indexOf(b, (a.length() - b.length())) >= 0)
                return "encaixa";
            return "nao encaixa";
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a, b;
        int n = Integer.parseInt(input.next());
        for (int i = 0; i < n; i++) {
            a = input.next();
            b = input.next();
            System.out.println(encaixa(a, b));
        }
    }
}
