/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.urijudgeonline.iniciante;

import java.util.Scanner;

/**
 *
 * @author m2l
 */

public class URI2003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String n = input.next();
            String[] m = n.split(":");
            int p = Integer.parseInt(m[0]), q = Integer.parseInt(m[1]);
            System.out.println("Atraso maximo: " + (p - 7 >= 0 ? (p - 7)*60 + q : 0));
        }
    }
}
