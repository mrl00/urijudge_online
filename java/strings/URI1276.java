/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.urijudgeonline.strings;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Stack;


/**
 * 
 * @author Kyoo
 */
class FaixaDeLetras {
    private StringBuilder sb;
    private char[] ch;
    private char pivor;
    private Stack<Character> stack = new Stack<>();
    
    public StringBuilder getSb() {
        return this.sb;
    }

    public FaixaDeLetras(String s) {
        this.ch = s.replaceAll("\\s+", "").toCharArray();
        Arrays.sort(ch);
        this.sb = new StringBuilder(String.valueOf(this.ch));
        this.sb = deletarCharsRepetidos();
        this.sb.reverse();
        this.ch = this.sb.toString().toCharArray();
    }
    
    private StringBuilder deletarCharsRepetidos() {
        for (int i = 1; i < sb.length(); i++) {
            if(this.sb.charAt(i - 1) == this.sb.charAt(i)) {
                this.sb = this.sb.replace(i - 1, this.sb.lastIndexOf(String.valueOf(this.sb.charAt(i))), "");
            }
        }
        return this.sb;
    }
    
    public StringBuilder x() {
        for (int i = 0; i < ch.length; i++) {
            this.stack.push(this.ch[i]);
        }
        this.sb = new StringBuilder();
        do {            
            this.pivor = stack.pop();
            
        } while (!stack.isEmpty());
        return this.sb;
    }

    @Override
    public String toString() {
        this.sb = x();
        return this.sb.toString();
    }
    
    
}

public class URI1276 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FaixaDeLetras f;
        while (input.hasNext()) {
            f = new FaixaDeLetras(input.next());
            System.out.println(f.toString());
        }
    }
}
