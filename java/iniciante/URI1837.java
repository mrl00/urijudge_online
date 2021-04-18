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
public class URI1837 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c, d, e, f = 0, q, r;

        if (a < 0) {
            e = b;
            if (b < 0) e = b * -1;
            
            for (r = 0; r < e; r++) {
                f = a - r;
                if (f % b == 0) break;
            }
            
            q = f / b;
        } else {
            q = a / b;
            r = a % b;
        }
        System.out.printf("%d %d\n", q, r);
    }
}
