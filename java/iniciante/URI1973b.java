/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.urijudgeonline.iniciante;

import java.util.Scanner;

/**
 *
 * @author m2l
 */
public class URI1973b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), c[] = new int[n], i = 0, star[] = new int[n], est = 0, ove = 0;
        for(int k = 0; k < n; k++) {c[k] = input.nextInt(); star[k] = 0;};
        
        while(true){
            if(i >= 0 && i < c.length){
                star[i] = 1;
                if(c[i] % 2 == 0){
                    if(c[i] > 0) c[i]--;
                    i--;
                }
                else {
                    if(c[i] > 0) c[i]--;
                    i++;
                }
            }else break;
        }
        for (int j = 0; j < n; j++) {
            est += star[j];
            ove += c[j];
        }
        System.out.println(est + " " + ove);
    }
}
