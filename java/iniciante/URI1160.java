package br.com.urijudgeonline.iniciante;


import java.util.Scanner;

/**
 *
 * @author Kyoo
 */
public class URI1160 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int count, pa, pb;
        double g1, g2;
        for (int i = 0; i < t; i++) {
            count = 0;
            pa = input.nextInt();
            pb = input.nextInt();
            g1 = input.nextDouble();
            g2 = input.nextDouble();
            
            while(pa <= pb) {
                pa = (int) (pa + (pa * (g1/100)));
                pb = (int) (pb + (pb * (g2/100)));
                count++;
                if(count > 100) break;
            }
            if(count > 100) System.out.println("Mais de 1 seculo.");
            else System.out.printf("%d anos.\n", count);
        }
    }
}
