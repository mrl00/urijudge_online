
package br.com.urijudgeonline.strings;

import java.util.Scanner;

/**
 * 
 * @author Kyoo
 */
public class URI1024 {
    static void mais3(char[] ch) {
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] >= 65 && ch[i] <= 126) ch[i] += 3;
        }
    }
    static void menos1(char[] ch) {
        int trunc = (int) Math.floor(ch.length / 2);
        for (int i = trunc; i < ch.length; i++) {
            ch[i] -= 1;
        }
    }
    static void inverte(char[] ch) {
        char a[] = new char[ch.length];
        int tam = a.length;
        System.arraycopy(ch, 0, a, 0, a.length);
        for (int i = 0; i < a.length; i++) {
            tam--;
            ch[i] = a[tam];
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++) {
            String s = input.nextLine();
            char[] ch = s.toCharArray();
            mais3(ch);
            inverte(ch);
            menos1(ch);
            s = String.valueOf(ch);
            System.out.println(s);
        }
    }
}
