/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.urijudgeonline.strings;

import java.util.Scanner;

/**
 * 
 * @author Kyoo
 */

class ArrayHash {
    String[] s;
    private int hash = 0;
    //private int size;

    public ArrayHash(int size) {
        //this.size = size;
        this.s = new String[size];
    }

    public int HashFuction() {
        for (int i = 0; i < this.s.length; i++) {
            for (int j = 0; j < this.s[i].length(); j++) {
                this.hash += i + (this.s[i].charAt(j) - 'A') + j;
            }
        }
        return this.hash;
    }
}
public class URI1257 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int casoTestes = Integer.parseInt(input.next());
        ArrayHash ah = null;
        for (int i = 0; i < casoTestes; i++) {
            int qtLinhas = Integer.parseInt(input.next());
            ah = new ArrayHash(qtLinhas);
            for (int j = 0; j < qtLinhas; j++) {
                ah.s[j] = input.next();
            }
            System.out.println(ah.HashFuction());
        }
    }
}
