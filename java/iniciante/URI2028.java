/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.urijudgeonline.iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author m2l
 */
public class URI2028 {
    private static ArrayList<Integer> sequencia(int n) {
        List<Integer> l = new ArrayList<>();
        int count = 1;
        l.add(0);
        if(n == 0) return (ArrayList<Integer>) l;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                l.add(i);
            }
        }
        return (ArrayList<Integer>) l;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> l;
        int count = 0;
        while (input.hasNext()) {
            count++;
            
            l = sequencia(input.nextInt());
            
            System.out.println("Caso " + count + ": " + l.size() + (l.size() > 1 ? " numeros" : " numero"));
            
            for (int i = 0; i < l.size(); i++) {
                System.out.print((i == 0 ? "" : " ") + l.get(i));
            }
            
            
            System.out.println();
            System.out.println();
            
        }
    }
}
