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
public class URI1238 {
    static String combinador(String a, String b) {
        String n = "";
        int tam;
        if(a.length() > b.length()) {
            for (int i = 0; i < b.length(); i++) {
                n += a.charAt(i);
                n += b.charAt(i);
            }
            return n.concat(a.substring(b.length(), a.length()));
        }
        if(b.length() > a.length()) {
            for (int i = 0; i < a.length(); i++) {
                n += a.charAt(i);
                n += b.charAt(i);
            }
            return n.concat(b.substring(a.length(), b.length()));
        }
        else {
            tam = a.length();
            for (int i = 0; i < tam; i++) {
                n += a.charAt(i);
                n += b.charAt(i);
            }
            return n;
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.next());
        for (int i = 0; i < n; i++) {
            String a = input.next();
            String b = input.next();
            System.out.println(combinador(a, b));
        }
    }
}
