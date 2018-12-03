package br.edu.ifpb.cg.q3.Menu;

import br.edu.ifpb.cg.q3.Estoque;
import br.edu.ifpb.cg.q3.EstoqueException;
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
            for (Produto produto : produtos) {
                System.out.println(produto.toString());
            }
        }
        System.out.println();
        return true;
    }


}
