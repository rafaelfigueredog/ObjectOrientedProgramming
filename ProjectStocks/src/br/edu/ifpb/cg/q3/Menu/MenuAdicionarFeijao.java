package br.edu.ifpb.cg.q3.Menu;
import br.edu.ifpb.cg.q3.Produtos.Estoque;
import br.edu.ifpb.cg.q3.Exceptions.EstoqueException;
import br.edu.ifpb.cg.q3.Data.MinhaData;
import br.edu.ifpb.cg.q3.Produtos.Feijao;

import java.util.Scanner;

public class MenuAdicionarFeijao extends AbstractMenu {

    public MenuAdicionarFeijao(Estoque stocks, Scanner input) {
        super(stocks, input);
    }

    @Override
    public boolean exibirMenu() throws EstoqueException {
        String menu = "";
        menu += "====================================" + ls;
        menu += "           Adicionar Feijão         " + ls;
        menu += "====================================" + ls;
        System.out.println(menu);

        String marca = obterValorString("Informe a marca: ");
        Integer quantidade = obterValorInteger("Informe a quantidade: ");
        Integer kg = obterValorInteger("Informe o peso em Kg: ");
        MinhaData validade = obterData("Data de Validade:");

        Feijao feijao = new Feijao(marca, quantidade, validade, kg);

       this.stocks.adicionarProduto(feijao);

        System.out.println();
        System.out.println("Feijão adicionado com sucesso!");
        System.out.println();
        return true;
    }

}
