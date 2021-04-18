/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.urijudgeonline.adhoc;

import java.util.Scanner;

/**
 *
 * @author houtaro
 */
class Divisibilidade {
    private final String s = " sim";
    private final String n = " nao";
    private final StringBuilder nums;
    private final int qt;

    public Divisibilidade(int qt, String nums) {
        this.nums = new StringBuilder(nums);
        this.qt = qt;
    }
    
    public String verificar() {
        this.nums.reverse();
        int sum = 0;
        
        if(this.qt >= this.nums.length()) {
            for (int i = 0; i < this.nums.length(); i++) {
                sum += Integer.parseInt(String.valueOf(this.nums.charAt(i)));
            }
        }
        else {
            for (int i = 0; i < this.qt; i++) {
                sum += Integer.parseInt(String.valueOf(this.nums.charAt(i)));
            }
        }
        
        if(sum % 3 == 0)
            return String.valueOf(sum) + this.s;
        else
            return String.valueOf(sum) + this.n;
    }
}

public class URI1987 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qt;
        String nums;
        Divisibilidade div;
        while (input.hasNext()) {
            qt = Integer.parseInt(input.next());
            nums = input.next();
            div = new Divisibilidade(qt, nums);
            System.out.println(div.verificar());
        }
    }
}
