package br.edu.ifpb.cg.q3.Menu;

import java.util.Scanner;

public class MenuAdicionarDetergente implements Menu {

    public void exibirMenu() {

        String marca;
        Integer quantidade;
        String aux;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a marca: ");
        marca = in.nextLine();
        System.out.println("Digite a quantidade: ");
        aux = in.nextLine();
    }

}
