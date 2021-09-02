/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.urijudgeonline.iniciante;

import java.util.Scanner;

/**
 * 
 * @author Imaginatio
 */

public class URI1973 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), c[] = new int[n], sum = 0, est = 0;
        boolean e = false;
        for (int i = 0; i < n; i++) c[i] = input.nextInt();
        for (int i = 0; i < c.length; i++) {
            if(c[i] % 2 == 0){
                if(c[i] > 0) c[i]--;
                if(i - 1 < 0) break;
                i-=2;
                e = true;
            }else if(c[i] > 0) {
                c[i]--;
                est++;
            }
        }
        for (int i : c) sum += i;
        System.out.println((e ? est + 1 : est) + " " + sum);
    }
}
