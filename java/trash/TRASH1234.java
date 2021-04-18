/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.urijudgeonline.trash;

import java.util.Scanner;

/**
 * 
 * @author Imaginatio
 */
public class TRASH1234 {
    private static String dancante(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) 
            sb.setCharAt(i, i % 2 != 0 ? Character.toLowerCase(str.charAt(i)) : Character.toUpperCase(str.charAt(i)));
        return sb.toString();
    }
    
    private static String func(String str) {
        StringBuilder sb = new StringBuilder(str);
        String[] s = str.split("\\s+");
        for (String item : s) 
            sb.replace(sb.indexOf(item), sb.indexOf(item) + item.length(), dancante(item));     
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        while (input.hasNext()) {
            str = input.nextLine();
            if(str.length() > 0)
                System.out.println(func(str));
        }
    }
}
