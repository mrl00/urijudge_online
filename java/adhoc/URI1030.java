/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.urijudgeonline.adhoc;

import java.util.Scanner;

/**
 * @author houtaro
 */
public class URI1030 {
    static int Josephus(int n, int k) {
        if(n == 1) 
            return 1;
        return (((Josephus(n - 1, k) + k - 1) % n) + 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nc = input.nextInt();
        for (int i = 0; i < nc; i++) {
            int n = input.nextInt();
            int k = input.nextInt();
            System.out.println(Josephus(n, k));
        }
    }
}
