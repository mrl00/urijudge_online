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
public class URI1933 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maior = 0;
        int a = input.nextInt();
        int b = input.nextInt();
        if(a > b) maior = a;
        if(a < b) maior = b;
        if(a == b) System.out.println(a);
        else System.out.println(maior);
    }
}
