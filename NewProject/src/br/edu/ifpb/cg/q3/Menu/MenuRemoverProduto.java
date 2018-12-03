package br.edu.ifpb.cg.q3.Menu;

import br.edu.ifpb.cg.q3.Estoque;
import br.edu.ifpb.cg.q3.EstoqueException;

import java.util.Scanner;

public class MenuRemoverProduto extends AbstractMenu {

    public MenuRemoverProduto(Estoque stocks, Scanner input) {
        super(stocks, input);
    }

    @Override
    public boolean exibirMenu() throws EstoqueException {
        return false;
    }
}
