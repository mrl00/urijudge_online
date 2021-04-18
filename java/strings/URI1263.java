package br.com.urijudgeonline.strings;

import java.util.Scanner;

/**
 * 
 * @author Imaginatio
 */
class Aliteration {
    private final String s;

    public Aliteration(String s) {
        this.s = s;
    }
    
    public int numAliterations() {
        int numLetter = 0, count = 0;
        String[] s1 = s.split(" ");
        char ch = Character.toLowerCase(s1[0].charAt(0));
        for (int i = 1; i < s1.length; i++) {
            if(ch == Character.toLowerCase(s1[i].charAt(0))) 
                numLetter++;
            if(ch != Character.toLowerCase(s1[i].charAt(0))) {
                ch = Character.toLowerCase(s1[i].charAt(0));
                if(numLetter > 0) count++;
                numLetter = 0;
            }
        }
        if(numLetter > 0) count++;
        return count;
    }   
}
public class URI1263 {  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aliteration al;
        String s;
        while (input.hasNext()) {
            s = input.nextLine();
            al = new Aliteration(s);
            System.out.println(al.numAliterations());
        }
    }
}