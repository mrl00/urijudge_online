package iniciante.uri1047;

import java.util.Scanner;

/**
 *
 * @author Kyoo
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rt, rm;
        int st = input.nextInt();
        int sm = input.nextInt();
        int et = input.nextInt();
        int em = input.nextInt();

        rt = et - st;

        if (rt < 0) {
            rt = 24 + (et - st);
        }

        rm = em - sm;

        if (rm < 0) {
            rm = 60 + (em - sm);
            rt--;
        }

        if (et == st && em == sm)
            System.out.printf("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n");
        else
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", rt, rm);
    }
}
