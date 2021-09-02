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
public class URI1564 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()) {
            int n = input.nextInt();
            if(n > 0) System.out.println("vai ter duas!");
            else System.out.println("vai ter copa!");
        }
    }
}
