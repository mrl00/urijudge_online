/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.urijudgeonline.iniciante;

import java.util.Scanner;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class URI2006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0, tipo = input.nextInt();
        int op[] = new int[5];
        for (int i = 0; i < 5; i++) {
            op[i] = input.nextInt();
            if(op[i] == tipo) count++;
        }
        System.out.println(count);
    }
}
