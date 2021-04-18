/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.urijudgeonline.adhoc;

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class URI1779 {
    private int media(ArrayList<Integer> nums) {
        int med = 0, count = 0;
        for (Integer num : nums) {
            med += num;
        }
        med /= nums.size();
        for(Integer num : nums) {
            if(num == med) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int med = 0, count = 0, t, n;
        ArrayList<Integer> nums = new ArrayList<>();
        t = input.nextInt();
        for (int i = 0; i < t; i++) {
            n = input.nextInt();
            for (int j = 0; j < n; j++) {
                nums.add(input.nextInt());
                count++;
            }
            //System.out.printf("Caso #%d: %d\n", count, media);
        }
    }
}
