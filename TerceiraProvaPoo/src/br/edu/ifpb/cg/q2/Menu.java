package br.edu.ifpb.cg.q2;

import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

public class Menu {

    private final String ls = System.lineSeparator();
    private String input;

    public boolean exibirMenu(Imobiliaria imobiliaria) {

        byte opcao = 0;
        String menu = "";

        menu += "       IMOBILIARIA MENU        " + ls;
        menu += ++opcao + "- Listar Imóveis" + ls;
        menu += ++opcao + "- Listar Imóveis Ordenados pela Data" + ls;
        menu += ++opcao + "- Adicionar Apartamento" + ls;
        menu += ++opcao + "- Adicionar Casa" + ls;
        menu += ++opcao + "- Informar Data da Venda" + ls;
        menu += ++opcao + "- Sair" + ls;

        boolean continuarExecutando = true;
        byte opcaoEscolhida;

        System.out.println(menu);
        System.out.printf("Digite a opção: ");
        Scanner in = new Scanner(System.in);
        opcaoEscolhida = in.nextByte();

        String endereco = null;
        Integer numero = null;
        Double preco = null;
        boolean temPiscina = false;
        Integer andar = null;
        Date dataVenda = new Date();
        Integer numeroAndar = null;
        Long id;

        switch (opcaoEscolhida) {
            case 1:
                Collection<Imovel> imoveis = imobiliaria.getImoveis();
                for (Imovel imovel : imoveis) {
                    System.out.println(imovel.toString());
                }
                break;
            case 2:
                break;
            case 3:

                System.out.println("\n    Adicionar Apartamento     \n");

                System.out.println("Digite o Endereço: ");
                endereco = in.next();

                System.out.println("Digite o Numero: ");
                numero = in.nextInt();

                System.out.println("Digite o Preço: ");
                preco = in.nextDouble();

                System.out.print("Digite o numero Andar: ");
                numeroAndar = in.nextInt();


                System.out.print("Tem Piscina: ");
                input = in.nextLine();
                if (input == "Sim") temPiscina = true;

                id = imobiliaria.getGeradorId().obterProximoId();
                Apartamento apartamento = new Apartamento(id, endereco, numero, preco, temPiscina, dataVenda, numeroAndar);
                imobiliaria.adicionarImovel(apartamento);
                break;
            case 4:
                System.out.println("\n    Adicionar Casa      \n");

                System.out.println("Digite o Endereço");
                endereco = in.nextLine();

                System.out.println("Digite o Numero: ");
                numero = in.nextInt();

                System.out.println("Digite o Preço: ");
                preco = in.nextDouble();

                System.out.println("Digite o numero Andar: ");
                Integer quantidadeAndares = in.nextInt();


                System.out.print("Tem Piscina: ");
                input = in.nextLine();

                if (input == "Sim") temPiscina = true;

                id = imobiliaria.getGeradorId().obterProximoId();
                Casa casa = new Casa(id,endereco,numero, preco, temPiscina, dataVenda, quantidadeAndares);
                imobiliaria.adicionarImovel(casa);
                break;
            case 5:
                imoveis = imobiliaria.getImoveis();
                for (Imovel imovel : imoveis) {
                    System.out.println(imovel.toString());
                }

                System.out.println("Digite o ID do Imóvel");
                break;
            case 6:
                break;
            case 7:
                continuarExecutando = false;
                break;
        }
        return continuarExecutando;
    }
}
