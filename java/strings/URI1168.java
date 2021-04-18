/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.urijudgeonline.strings;

import java.util.Scanner;

/**
 *
 * @author Kyoo
 */
public class URI1168 {
    static int y(char[] ch) {
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == 48) count += 6;// 0
            if(ch[i] == 49) count += 2;// 1
            if(ch[i] == 50) count += 5;// 2
            if(ch[i] == 51) count += 5;// 3
            if(ch[i] == 52) count += 4;// 4
            if(ch[i] == 53) count += 5;// 5
            if(ch[i] == 54) count += 6;// 6
            if(ch[i] == 55) count += 3;// 7
            if(ch[i] == 56) count += 7;// 8
            if(ch[i] == 57) count += 6;// 9
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); 
        for (int i = 0; i < n; i++) {
            String m = input.next();
            char[] ch = m.toCharArray();
            System.out.println(y(ch) + " leds");
        }
    }
}
