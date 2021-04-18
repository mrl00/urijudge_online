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
public class URI1216 {   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double media = 0;
        int count = 0;
        while (input.hasNext()) {
            String s = input.nextLine();
            int dist = Integer.parseInt(input.nextLine());
            media += dist;
            count++;
        }
        System.out.printf("%.1f\n", media/count);
    }
}
