package br.edu.ifpb;

import java.io.*;
import java.security.cert.TrustAnchor;
import java.util.Scanner;

public class Arquivos {

    public static void leitor (String path) throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader buffreader = new BufferedReader(fr);
        String linha = "";
        while (true) {
            if (linha != null) {
                System.out.println(linha);
            }else
                break;
            linha = buffreader.readLine();
        }
        buffreader.close();
    }

    public static void escritor (String pach) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(pach));
        String linha = "";
        Scanner in = new Scanner(System.in);
        System.out.printf("Linha: ");
        linha = in.next();
        bw.append(linha +"\n");
        bw.close();
    }

}
