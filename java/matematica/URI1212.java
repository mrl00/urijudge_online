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
public class URI1212 {
    private static String convert(String num1, String num2) {
        int count = 0;
        long[] v1 = new long[num1.length()];
        long[] v2 = new long[num2.length()];
        for (int i = 0; i < v1.length; i++) {
            v1[i] = Integer.parseInt(String.valueOf(num1.charAt(i)));
        }
        for (int i = 0; i < v2.length; i++) {
            v2[i] = Integer.parseInt(String.valueOf(num2.charAt(i)));
        }
        for (int i = v1.length > v2.length ? v2.length - 2 : v1.length - 2; i >= 0; i--) {
            if(v1[i] + v2[i] >= 10 ) count++;
        }
        if(count > 0) return count + " carry operations.";
        else return "No carry operation.";
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num1, num2;
        do {            
            num1 = input.next();
            num2 = input.next();
            if(num1.equals("0") && num2.equals("0")) break;
            System.out.println(convert(num1, num2));
        } while (true);
    }
}
