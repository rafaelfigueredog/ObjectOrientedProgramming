package br.edu.ifpb.cg.q3.Menu;
import br.edu.ifpb.cg.q3.Comparadores.ComparadorOrdemAlfbetica;
import br.edu.ifpb.cg.q3.Produtos.Estoque;
import br.edu.ifpb.cg.q3.Produtos.Produto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class MenuProdutosOrdemAlfabetica extends AbstractMenu {

    public MenuProdutosOrdemAlfabetica(Estoque stocks, Scanner input) {
        super(stocks, input);
    }

    @Override
    public boolean exibirMenu() {
        String menu = "";
        menu += "====================================" + ls;
        menu += "    Lis. Prod. Em Ordem Alfabetica  " + ls;
        menu += "====================================" + ls;
        System.out.println(menu);


        Collection<Produto> produtos = this.stocks.getProdutos();
        if (produtos.isEmpty()) {
            System.out.println("Estoque Zerado!");
        } else {
            List<Produto> produtosOrdenados = new ArrayList<>(produtos);
            produtosOrdenados.sort(new ComparadorOrdemAlfbetica());
            for (Produto produto: produtosOrdenados) {
                System.out.println(produto.toString() + "\n");
            }
        }
        System.out.println();
        return true;
    }
}
