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
public class URI1234 {  
    private static String dancante(String str) {
        StringBuilder sb = new StringBuilder(str);
        int l = 0;
        for (int i = 0; i < sb.length(); i++) {
            if(str.charAt(i) != 32) {
                l++;
                sb.setCharAt(i, l % 2 != 0 ? Character.toUpperCase(sb.charAt(i)):Character.toLowerCase(sb.charAt(i)));
            }
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        while (input.hasNext()) {
            str = input.nextLine();
            if(str.length() > 0)
                System.out.println(dancante(str));
        }
    }
}
