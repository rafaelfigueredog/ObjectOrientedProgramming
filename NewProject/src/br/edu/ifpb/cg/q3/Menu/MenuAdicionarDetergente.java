package br.edu.ifpb.cg.q3.Menu;
import br.edu.ifpb.cg.q3.Estoque;
import br.edu.ifpb.cg.q3.EstoqueException;

import java.util.Scanner;

public class MenuAdicionarDetergente extends AbstractMenu {

    public MenuAdicionarDetergente(Estoque stocks, Scanner input) {
        super(stocks, input);
    }

    @Override
    public boolean exibirMenu() throws EstoqueException {
        return false;
    }
}
