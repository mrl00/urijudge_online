package br.com.urijudgeonline.iniciante;

import java.util.Scanner;

/**
 *
 * @author Kyoo
 */
public class URI1098 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = 0, b = 1;
        for (int i = 0; i < 11; i++) {
            for (double j = b; j < (b + 3); j++) {
                if(a == 0 || a == 1 || (a > 1.8 && a < 2)) System.out.printf("I=%.0f J=%.0f\n", a, j);
                else System.out.printf("I=%.1f J=%.1f\n", a, j);
            }
            a += 0.2;
            b += 0.2;
        }
    }
}
