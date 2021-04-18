/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.urijudgeonline.strings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Imaginatio
 */

public class URI2023 {

    private static String compara(List<String> nomes) {
        nomes.sort(String::compareToIgnoreCase);
        return nomes.get(nomes.size() - 1);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

//        while (input.hasNext()) {
//            nomes.add(input.nextLine());
//        }
        for (int i = 0; i < 6; i++) {
            nomes.add(input.nextLine());
        }
        System.out.println(compara(nomes));
    }
}
