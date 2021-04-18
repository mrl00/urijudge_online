/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.urijudgeonline.matematica;

import java.util.Scanner;
/**
 *
 * @author Kyoo
 */
public class URI1198 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            long a = input.nextLong();
            long b = input.nextLong();
            System.out.println(Math.abs(b - a));
        }
    }
}