package br.com.urijudgeonline.strings;

import java.util.Scanner;

/**
 * 
 * @author Imaginatio
 */
public class URI1249 {
    private static String root13(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z') 
                sb.setCharAt(i, sb.charAt(i) + 13 > 'Z' ? (char) (sb.charAt(i) - 13) : (char) (sb.charAt(i) + 13));
            if(sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z')
                sb.setCharAt(i, sb.charAt(i) + 13 > 'z' ? (char) (sb.charAt(i) - 13) : (char) (sb.charAt(i) + 13));
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        while (input.hasNext()) {
            str = input.nextLine();
            if(str.length() > 0)
                System.out.println(root13(str));
        }
    }
}
