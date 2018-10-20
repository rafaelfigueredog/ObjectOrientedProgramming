package br.edu.ifpb;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestarArquivos {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        String pach;
        System.out.print("Digite o número de linhas: ");
        byte linhas = in.nextByte();
        System.out.print("Digite o local do arquivo: ");
        pach = in.next();

        for (int i = 0; i < linhas; i++) {
            Arquivos.escritor(pach);
        }
        Arquivos.leitor(pach);





    }

}
