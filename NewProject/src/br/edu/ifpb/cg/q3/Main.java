package br.edu.ifpb.cg.q3;

import br.edu.ifpb.cg.q3.Menu.Menu;
import br.edu.ifpb.cg.q3.Streams.Armazenamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Armazenamento armazenamento = null;
        armazenamento = new Armazenamento("estoque.ser");

        GeradorId geradorId = null;
        geradorId = new GeradorId();

        Estoque stocks = armazenamento.recuperar(geradorId);
        Scanner input = new Scanner(System.in);




    }
}
