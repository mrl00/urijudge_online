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
class Match {
    private final String S;

    public Match(String S) {
        this.S = S;
    }
    
    public boolean isValid() {
        return S.length() == 3 && S.matches("([0-9][a-z][0-9]|[0-9][A-Z][0-9])");
    }
    
    public void operation() {
        if(isValid()) {
            int a = Integer.parseInt(String.valueOf(S.charAt(0)));
            int b = Integer.parseInt(String.valueOf(S.charAt(2)));
            
            if(S.charAt(0) == S.charAt(2)) System.out.println((a * b)); 
            
            else if(S.matches("[0-9][a-z][0-9]")) System.out.println(a + b);

            else if(S.matches("[0-9][A-Z][0-9]")) System.out.println(b - a);
        }
    }
}
public class URI1192 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Match ma;
        int n = Integer.parseInt(input.next());
        for (int i = 0; i < n; i++) {
            String s = input.next();
            ma = new Match(s);
            ma.operation();
        }
    }
}
