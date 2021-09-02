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
public class URI1914 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qt = Integer.parseInt(input.next());
        for (int i = 0; i < qt; i++) {
            String p1 = input.next();
            String g1 = input.next();
            String p2 = input.next();
            String g2 = input.next();
            String n1 = input.next();
            String n2 = input.next();
            if("PAR".equals(g1) && (Integer.parseInt(n1) + Integer.parseInt(n2)) % 2 == 0) 
                System.out.println(p1);
            else if("PAR".equals(g2) && (Integer.parseInt(n1) + Integer.parseInt(n2)) % 2 == 0) 
                System.out.println(p2);
            else if("IMPAR".equals(g1) && (Integer.parseInt(n1) + Integer.parseInt(n2)) % 2 != 0) 
                System.out.println(p1);
            else if("IMPAR".equals(g2) && (Integer.parseInt(n1) + Integer.parseInt(n2)) % 2 != 0) 
                System.out.println(p2);
        }
    }
}
