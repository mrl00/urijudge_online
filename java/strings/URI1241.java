/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.urijudgeonline.strings;

import java.util.Scanner;

/**
 * 
 * @author Imaginatio
 */
public class URI1241 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.next());
        for (int i = 0; i < n; i++) {
            String s1 = input.next();
            String s2 = input.next();
            if(s1.length() >= s2.length()) {
                if(s1.substring(s1.length() - s2.length(), s1.length()).equals(s2))
                    System.out.println("encaixa");
                else
                    System.out.println("nao encaixa");
            }
            else if(s1.length() < s2.length())
                System.out.println("nao encaixa");
        }
    }
}
