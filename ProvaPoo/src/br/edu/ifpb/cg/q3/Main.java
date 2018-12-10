package br.edu.ifpb.cg.q3;

import br.edu.ifpb.cg.q3.Exceptions.EstoqueException;
import br.edu.ifpb.cg.q3.GeradorID.GeradorId;
import br.edu.ifpb.cg.q3.Menu.MenuPrincipal;
import br.edu.ifpb.cg.q3.Produtos.Estoque;
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
        MenuPrincipal menuPrincipal = new MenuPrincipal(stocks, input);

        boolean continuarExecutando = true;
        while (continuarExecutando) {
            try {
                continuarExecutando = menuPrincipal.exibirMenu();
            } catch (EstoqueException e) {
                System.out.println();
                System.out.println(e.getMessage());
                System.out.println();
            } finally {
                armazenamento.armazenar(stocks);
            }

        }
    }
}
