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
public class URI1235 {
    static String foraPDentro(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            String s = input.nextLine();
            if(s.length() % 2 != 0) s += " ";
            String d = s.substring(0, s.length()/2);
            String e = s.substring((s.length()/2), s.length());
            d = foraPDentro(d);
            e = foraPDentro(e);
            System.out.println(d.concat(e));
        }
    }
}
