package br.com.urijudgeonline.iniciante;


import java.util.Scanner;

/**
 * Tesoura > Papel
 * Papel > Pedra
 * Pedra > Lagarto
 * Lagarto > Spock
 * Spock > Tesoura
 * 
 * Tesoura > Lagarto
 * Lagarto > Papel
 * Papel > Spock
 * Spock > Pedra
 * Pedra > Tesoura
 */

/**
 *
 * @author Kyoo
 */
public class URI1828 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] game = {"pedra", "papel", "tesoura","lagarto","spock"};
        
        int t = input.nextInt();       
        for (int i = 0; i < t; i++) {
            String sheldon = input.nextLine();
            String raj = input.nextLine();
            
        }
    }
}
