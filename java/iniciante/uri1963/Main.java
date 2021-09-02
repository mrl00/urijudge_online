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
public class URI1963 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double dif = b - a;
        System.out.printf("%.2f%%\n", ((dif * 100) / a));
    }
}
