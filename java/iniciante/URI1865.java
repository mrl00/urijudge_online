/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.urijudgeonline.iniciante;

import java.util.Scanner;

/**
 *
 * @author Kyoo
 */
public class URI1865 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c = input.nextInt();
        String thor = "Thor";
        for (int i = 0; i < c; i++) {
            String o = input.next();
            int newtons = input.nextInt();
            if(o.equals(thor)) System.out.println("Y");
            else System.out.println("N");
        }
    }
}
