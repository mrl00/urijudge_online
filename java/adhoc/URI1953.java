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
public class URI1953 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = Integer.parseInt(input.next());
            int epr = 0, ehd = 0, intr = 0;
            for (int i = 0; i < n; i++) {
                String mat = input.next();
                String cur = input.next();
                if("EPR".equals(cur)) epr++;
                else if("EHD".equals(cur)) ehd++;
                else intr++;
            }
            System.out.printf("EPR: %d\n", epr);
            System.out.printf("EHD: %d\n", ehd);
            System.out.printf("INTRUSOS: %d\n", intr);
        }
    }
}
