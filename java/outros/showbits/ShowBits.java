/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.urijudgeonline.outros.showbits;

/**
 * 
 * @author Imaginatio
 */
public class ShowBits implements Show {
    
    @Override
    public String show(int val) {
        StringBuilder sb = new StringBuilder();
        int mask = 1;
        mask <<= 31;
        
        //int spacer = 0;
        for (; mask != 0; mask >>>= 1) {
            if((val & mask) !=0 ) sb.append("1");
            else sb.append("0");
            /*
            spacer++;
            if((spacer % 8 == 0)) {
                sb.append(" ");
                spacer = 0;
            } 
            */
        }
        return  sb.toString();
    }

}
