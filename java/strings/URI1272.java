package br.com.urijudgeonline.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Imaginatio
 */
class MensagemOcuta {
    private String mensagem;

    public MensagemOcuta(String mensagem) {
        this.mensagem = mensagem ==  null ? "" : mensagem;
    }

    public String resultado() {
        this.mensagem = this.mensagem.trim();
        
        if (this.mensagem.length() == 0) return "";
        
        String[] m = this.mensagem.split("\\s+");
        
        StringBuilder sb = new StringBuilder();

        for (String m1 : m) sb.append(m1.charAt(0));
        return sb.toString();
    }
}

public class URI1272 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

        MensagemOcuta mo = null;
        int n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            String str = bufferRead.readLine();
            mo = new MensagemOcuta(str);
            System.out.println(mo.resultado());
        }
    }
}
