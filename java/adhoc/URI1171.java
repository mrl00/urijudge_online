package br.com.urijudgeonline.adhoc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Imaginatio
 */
public class URI1171 {
    private static void contador(int[] num) {
        if(num.length == 1) {
            System.out.println(num[0] + " aparece " + 1 + " vez(es)");
            return;
        }
        
        int count = 1;
        Arrays.sort(num);
        
        for (int i = 0; i < num.length - 1; i++) {
            if(num[i] != num[i + 1]) {
                System.out.println(num[i] + " aparece " + count + " vez(es)");
                count = 0;
            } else count++;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) num[i] = input.nextInt();
        contador(num);
    }
}