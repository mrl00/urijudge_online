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
public class URI1789 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);       
        while(input.hasNext()) {  
            int maior = 0;
            int l = input.nextInt();           
            for (int i = 0; i < l; i++) {
                int v = input.nextInt();
                if(v > maior) maior = v;
            }
            
            if(maior < 10) System.out.println("1");
            if(maior >= 10 && maior < 20) System.out.println("2");
            if(maior >= 20) System.out.println("3");
        }      
    }
}
