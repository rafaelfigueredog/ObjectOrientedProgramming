package br.edu.ifpb;

import java.util.ArrayList;
import java.util.Scanner;

public class Interface {

    public static void Menu() {
        boolean sair = false;

        ArrayList<ArquivoTexto> pasta;
        pasta = new ArrayList();

        while (true) {
            System.out.printf("\n==========MENU===========\n" +
                    "1. Criar Arquivo Binario\n" +
                    "2. Criar Arquivo Texto\n" +
                    "3. Escrever Arquivo\n" +
                    "4. Ler Arquivo\n" +
                    "5. Visualizar Arquivos\n" +
                    "6. Sair\n\n" +
                    "Digite a opção: ");
            Scanner in = new Scanner(System.in);
            byte opcao = in.nextByte();
            String nome;
            switch (opcao) {
                case 1:
                    System.out.printf("Digite o nome do Arquivo: ");
                    nome = in.next();
                    nome += ".txt";
                    ArquivoTexto file = new ArquivoTexto(nome);
                    final boolean add = pasta.add(file);
                    break;
                case 2:
                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    pasta.toString();
                    break;
                case 6:
                    sair = true;
                    break;
            }
            if (sair) break;
        }
    }
}
