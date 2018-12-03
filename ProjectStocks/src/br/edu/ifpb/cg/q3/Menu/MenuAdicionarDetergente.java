package br.edu.ifpb.cg.q3.Menu;
import br.edu.ifpb.cg.q3.Data.MinhaData;
import br.edu.ifpb.cg.q3.Produtos.Detergente;
import br.edu.ifpb.cg.q3.Produtos.Estoque;
import br.edu.ifpb.cg.q3.Exceptions.EstoqueException;

import java.util.Scanner;

public class MenuAdicionarDetergente extends AbstractMenu {

    public MenuAdicionarDetergente(Estoque stocks, Scanner input) {
        super(stocks, input);
    }

    @Override
    public boolean exibirMenu() throws EstoqueException {
        String menu = "";
        menu += "====================================" + ls;
        menu += "         Adicionar Detergente       " + ls;
        menu += "====================================" + ls;
        System.out.println(menu);

        String marca = obterValorString("Informe a marca: ");
        Integer quantidade = obterValorInteger("Informe a quantidade: ");
        boolean neutro = obterValorBoolean("É neutro? ");
        MinhaData validade = obterData("Data de Validade:");

        Detergente detergente = new Detergente(marca, quantidade, validade, neutro);

        this.stocks.adicionarProduto(detergente);

        System.out.println();
        System.out.println("Detergente adicionado com sucesso!");
        System.out.println();
        return true;
    }
}
