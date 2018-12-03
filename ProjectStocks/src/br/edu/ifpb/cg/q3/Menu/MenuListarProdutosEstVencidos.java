package br.edu.ifpb.cg.q3.Menu;

import br.edu.ifpb.cg.q3.Comparadores.ComparadorDataValidade;
import br.edu.ifpb.cg.q3.Data.MinhaData;
import br.edu.ifpb.cg.q3.Produtos.Estoque;
import br.edu.ifpb.cg.q3.Exceptions.EstoqueException;
import br.edu.ifpb.cg.q3.Produtos.Produto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class MenuListarProdutosEstVencidos extends AbstractMenu {

    public MenuListarProdutosEstVencidos(Estoque stocks, Scanner input) {
        super(stocks, input);
    }

    @Override
    public boolean exibirMenu() {
        String menu = "";
        menu += "====================================" + ls;
        menu += "   Lis. Prod. Que estaram Vencidos  " + ls;
        menu += "====================================" + ls;
        System.out.println(menu);


        Collection<Produto> produtos = this.stocks.getProdutos();
        if (produtos.isEmpty()) {
            System.out.println("Estoque Zerado!");
        } else {
            MinhaData minhaData = null;
            minhaData = obterData("Informe a Data: ");
            List<Produto> produtosOrdenados = new ArrayList<>(produtos);
            for (Produto produto: produtosOrdenados) {
                if (minhaData.compareTo(produto.getDataValidade()) == 1 ) {
                    System.out.println(produto.toString());
                    System.out.println();
                }
            }
        }
        System.out.println();
        return true;
    }
}
