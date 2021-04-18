/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.urijudgeonline.adhoc;

import java.util.Scanner;

/**
 * 
 * @author Imaginatio
 */
public class URI1397 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int cnt1 = 0;
            int cnt2 = 0;
            int qnt = input.nextInt();
            if(qnt ==  0) break;
            for (int i = 0; i < qnt; i++) {
                int player1 = input.nextInt();
                int player2 = input.nextInt();
                if(player1 > player2) cnt1++;
                if(player1 < player2) cnt2++;            
            }
            System.out.println(cnt1 + " " + cnt2);
        }
    }
}
