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
public class URI1457 {
    static long fat2(int k, int num){
        long l = 1;
        for (int i = 1; (num - i * k) > 0; i++) {
            l *= (num - i * k);
        }
        return l * num;
    }
    static long fat1 (int num) {
        long l = num;
        if (num == 0) l++;
        while (num > 1) l *= --num;
        return l;
}
    
    static int ctEx(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == '!') count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.next());
        for (int i = 0; i < n; i++) {
            String s = input.next();
            int k = ctEx(s);
            int num = Integer.parseInt(s.substring(0, s.length() - k));
            if(k == 1) System.out.println(fat1(num));
            else if(k > 1) System.out.println(fat2(k, num));
        }
    }
}
