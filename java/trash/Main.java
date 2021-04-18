/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.urijudgeonline.trash;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author m2l
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int k = in.nextInt();
            Integer[] b = null;
            for (int j = 0; j < k; j++) {
                b = new Integer[k];
                b[j] = in.nextInt();
            }
            list.add(b);
        }
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int line = in.nextInt();
            int index = in.nextInt();
            
            try {
                System.out.println(list.get(line - 1)[index]);
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
