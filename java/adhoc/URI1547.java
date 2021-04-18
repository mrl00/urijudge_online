/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.urijudgeonline.adhoc;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author houtaro
 */
class Adivinha {
    private final int numSorteado, tamanho;
    private int[] numGrupos;
    

    //Construtor
    public Adivinha(int qtGrupos, int numSorteado) {
        this.numSorteado = numSorteado;
        this.numGrupos = new int[qtGrupos];
        this.tamanho = qtGrupos;
    }
    
    //Funcao Chave
    public int x() {
        if(this.tamanho == 1)
            return 1;
        int[] diferenca = new int[this.tamanho];
        int pivor = this.numSorteado - this.numGrupos[0], index = 0;
        for (int i = 1; i < this.tamanho; i++) {
            diferenca[i] = Math.abs(this.numSorteado - this.numGrupos[i]);
            if(diferenca[i] < pivor) {
                pivor = diferenca[i];
                index = i;
            }
        }
        return index + 1;
    }
    
    //Setter
    public void setNumGrupos(int index, int num) {
       this.numGrupos[index] = num;
    }
    
    //Getters
    public int getTamanho() {
        return this.tamanho;
    }
}


public class URI1547 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Adivinha adivinha;
        int casos = input.nextInt();
        for (int i = 0; i < casos; i++) {
            adivinha = new Adivinha(input.nextInt(), input.nextInt());
            for (int j = 0; j < adivinha.getTamanho(); j++) 
                adivinha.setNumGrupos(j, input.nextInt()); 
            System.out.println(adivinha.x());
        }
    }
}
