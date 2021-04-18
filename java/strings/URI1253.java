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
public class URI1253 {
    static String cesar(char[] ch, int k) {
        for (int i = 0; i < ch.length; i++) {
            ch[i] += (ch[i] - k < 'A' ? 26 - k : - k);
        }
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.next());
        while (n > 0) {
            String s = input.next();
            char[] ch = s.toCharArray();
            int k = Integer.parseInt(input.next());
            System.out.println(cesar(ch, k));
            n--;
        }
    }
}
