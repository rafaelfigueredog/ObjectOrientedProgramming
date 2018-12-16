package br.edu.ifpb;

import java.util.Scanner;

public class MenuPrincipal {

    private static final String ls = System.lineSeparator();
    private Livraria livraria;
    private Scanner in;

    public MenuPrincipal(Livraria livraria) {
        this.livraria = livraria;
    }

    public boolean exibirMenu() {

        int OpcaoEscolhida;
        String menu = "";
        int opcao = 0;

        menu += "------------------------------" +  ls;
        menu += "           Livraria           " +  ls;
        menu += "------------------------------" +  ls;
        menu += ++ opcao + " - Adicionar Livro"  +  ls;
        menu += ++ opcao + " - Listar Livros"    +  ls;
        menu += ++ opcao + " - Remover Livro"    +  ls;
        menu += ++ opcao + " - Sair"             +  ls;
        menu += ls;

        while (true) {
            System.out.println(menu);
            OpcaoEscolhida = obterOpcaoEscolhida("Digite a Opção: ");

            switch (OpcaoEscolhida) {

                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    return false;
                default:
                    System.out.println();
                    System.out.println("Opcao invalida, Tente novamente!" + OpcaoEscolhida);
                    System.out.println();
                    break;
            }
        }
    }

    public void adicionarLivro(Livraria livraria) {

        String menu = "";
        menu += "------------------------------" +  ls;
        menu += "       Adicionar Livro        " +  ls;
        menu += "------------------------------" +  ls;
        System.out.println(menu);

        String titulo = obterValorString("Titulo: ");

    }

    public String obterValorString(String menssagemProUsurio) {
        String valor = null;
        while (valor == null) {
            System.out.print(menssagemProUsurio);
            valor = in.nextLine();
        }
        return valor;
    }

    public Long obterValorLong(String menssagemProUsurio) {
        Long valor = null;
        while (valor == null) {
            try {
                System.out.print(menssagemProUsurio);
                String line = this.in.nextLine();
                valor = Long.parseLong(line);
            } catch (NumberFormatException e) {
                System.out.println("Valor Invalido, Tente novamente.");
            }
        }
        return valor;
    }

    public int obterOpcaoEscolhida(String menssagemProUsurio) {
        Integer valor = null;
        while (valor == null) {
            try {
                System.out.print(menssagemProUsurio);
                String line = this.in.nextLine();
                valor = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Valor Invalido, Tente novamente.");
            }
        }
        return valor;
    }

}
