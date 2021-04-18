package br.com.urijudgeonline.strings;

import java.util.Scanner;

/**
 *
 * @author houtaro
 */

class RevisaodeContrato {
    private String num;
    private final String qt;
    
    public RevisaodeContrato(String qt, String num) {
        this.qt = qt;
        this.num = num;
    }
    
    public String result() {
        this.num = this.num.replaceAll(qt, "");
        for (int i = 0; i < this.num.length(); i++) 
            if(this.num.charAt(i) != '0') {                
                this.num = this.num.substring(i, this.num.length());
                break;
            }
        if(this.num.matches("0*") || this.num.matches(qt.concat("*"))) this.num = "0";
        return this.num;
    }
}

public class URI1120 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String qt, num;
        RevisaodeContrato rdc = null;
        
        while(true) {
            qt = input.next();
            num = input.next();
            if("0".equals(qt) && "0".equals(num)) break;
            rdc = new RevisaodeContrato(qt, num);
            System.out.println(rdc.result());
        }
    }
}
