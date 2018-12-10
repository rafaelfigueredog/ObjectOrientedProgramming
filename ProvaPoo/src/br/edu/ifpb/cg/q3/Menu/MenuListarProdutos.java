package br.edu.ifpb.cg.q3.Menu;

import br.edu.ifpb.cg.q3.Produtos.Estoque;
import br.edu.ifpb.cg.q3.Exceptions.EstoqueException;
import br.edu.ifpb.cg.q3.Produtos.Produto;

import java.util.Collection;
import java.util.Scanner;

public class MenuListarProdutos extends AbstractMenu {

    public MenuListarProdutos(Estoque stocks, Scanner input) {
        super(stocks, input);
    }

    @Override
    public boolean exibirMenu() throws EstoqueException {
        String menu = "";
        menu += "====================================" + ls;
        menu += "           Listar Produtos          " + ls;
        menu += "====================================" + ls;
        System.out.println(menu);


        Collection<Produto> produtos = this.stocks.getProdutos();
        if (produtos.isEmpty()) {
            System.out.println("Estoque Zerado!");
        } else {
            stocks.listarProdutos();
        }
        System.out.println();
        return true;
    }


}
