package br.edu.ifpb.cg.q3.Menu;

import br.edu.ifpb.cg.q3.Produtos.Estoque;
import br.edu.ifpb.cg.q3.Exceptions.EstoqueException;
import br.edu.ifpb.cg.q3.Produtos.Produto;
import java.util.Collection;
import java.util.Scanner;

public class MenuRemoverProduto extends AbstractMenu {

    public MenuRemoverProduto(Estoque stocks, Scanner input) {
        super(stocks, input);
    }

    @Override
    public boolean exibirMenu() throws EstoqueException {
        String menu = "";
        menu += "====================================" + ls;
        menu += "          Remover Produto           " + ls;
        menu += "====================================" + ls;
        System.out.println(menu);

        Collection<Produto> produtos = this.stocks.getProdutos();
        if (produtos.isEmpty()) {
            System.out.println("Estoque Zerado!");
            return true;
        }

        stocks.listarProdutos();
        Long id = obterValorLong("Escolha o id do produto a ser Removido: ");
        this.stocks.removerAnimal(id);

        System.out.println();
        System.out.println("Produto removido com Sucesso!");
        System.out.println();
        return true;
    }
}
