/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.urijudgeonline.matematica;

import java.util.Scanner;

/**
 * 
 * @author Imaginatio
 */
class Bacteria {
    private int pop, days;

    public Bacteria(int pop, int days) {
        this.pop = pop;
        this.days = days;
    }

    public int getPop() {
        return pop;
    }

    public int getDays() {
        return days;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }
}

class BacteriaFactory{
    public Bacteria create(int pop, int days) {
        return new Bacteria(pop, days);
    }
}
public class URI1422 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    }
}
