/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.urijudgeonline.adhoc;

import java.util.Scanner;

/**
 *
 * @author Kyoo
 */
public class URI1103 {
    static int diferenca(int h1, int m1, int h2, int m2){
        int md = 1440;
        int min1 = h1 * 60 + m1;
        int min2 = h2 * 60 + m2;
        if(min1 > min2) return (md - min1) + min2;
        else return min2 - min1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h1;
        int m1;
        int h2;
        int m2;
        do {            
            h1 = input.nextInt();
            m1 = input.nextInt();
            h2 = input.nextInt();
            m2 = input.nextInt();
            if(h1 == 0 && m1 == 0 && h2 == 0 && m2 == 0) break;
            System.out.println(diferenca(h1, m1, h2, m2)); 
        } while (true);
    }
}
