/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.urijudgeonline.adhoc;

import java.util.Scanner;

/**
 * 
 * @author Imaginatio
 */

interface VaretasIn {
    public int numDeVaretas(int cI, int vI);
}

class Varetas implements VaretasIn {
    private int cI, vI;

    public Varetas(int cI, int vI) {
        this.cI = cI;
        this.vI = vI;
    }

    @Override
    public int numDeVaretas(int cI, int vI) {
        
        return 0;
    }
    
}

public class URI1366 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Varetas varetas;
        while (true) {            
            int n = input.nextInt();
            if(n == 0) break;
            int cI = 0;
            int vI = 0;
            for (int i = 0; i < n; i++) {
                cI += input.nextInt();
                vI += input.nextInt();
                varetas = new Varetas(cI, vI);
            }
            System.out.println();
        }
    }
}
