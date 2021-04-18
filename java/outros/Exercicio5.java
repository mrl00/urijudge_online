/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.urijudgeonline.outros;

import java.util.Random;

/**
 * 
 * @author Imaginatio
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Random rd = new Random();
        String[][] words = {
            {"The", "A", "One", "Some", "Any"},
            {"boy", "girl", "dog", "town", "car"},
            {"drove", "jumped", "ran", "walked", "skiped"},
            {"to.", "from.", "over.", "under.", "on."}
        };
        
        for (int i = 0; i < 20; i++) {
            String result = "";
            for (int j = 0; j < 4; j++) {
                result += words[j][rd.nextInt(5)] + " ";
            }
            System.out.println(result);
        }
    }
}
