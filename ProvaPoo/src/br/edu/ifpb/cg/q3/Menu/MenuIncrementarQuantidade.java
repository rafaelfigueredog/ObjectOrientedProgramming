package br.edu.ifpb.cg.q3.Menu;

import br.edu.ifpb.cg.q3.Produtos.Estoque;
import br.edu.ifpb.cg.q3.Exceptions.EstoqueException;
import br.edu.ifpb.cg.q3.Produtos.Produto;

import java.util.Collection;
import java.util.Scanner;

public class MenuIncrementarQuantidade extends AbstractMenu {

    public MenuIncrementarQuantidade(Estoque stocks, Scanner input) {
        super(stocks, input);
    }

    @Override
    public boolean exibirMenu() throws EstoqueException {
        String menu = "";
        menu += "====================================" + ls;
        menu += "          Incrementar Quantidade    " + ls;
        menu += "====================================" + ls;
        System.out.println(menu);

        Collection<Produto> produtos = this.stocks.getProdutos();
        if (produtos.isEmpty()) {
            System.out.println("Estoque Zerado!");
            return true;
        }

        stocks.listarProdutos();
        Long id = obterValorLong("Escolha o id do produto a ser Incrementado: ");
        stocks.ModificarQuantidadeDoProduto(id, 1);

        System.out.println();
        System.out.println("Produto Incrementado com Sucesso!");
        System.out.println();
        return true;
    }
}
