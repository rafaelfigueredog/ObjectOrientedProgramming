package br.edu.ifpb.cg.q3.Menu;
import br.edu.ifpb.cg.q3.Estoque;
import br.edu.ifpb.cg.q3.EstoqueException;

import java.util.Scanner;


public class MenuPrincipal extends AbstractMenu {

    private MenuListarProdutos menuListarProdutos;
    private MenuProdutosOrdemAlfabetica menuProdutosOrdemAlfabetica;
    private MenuProdutosOrdemCrescenteQuantidade menuProdutosOrdemCrescenteQuantidade;
    private MenuProdutosOrdemCrescenteValidade menuProdutosOrdemCrescenteValidade;
    private MenuListarProdutosEstVencidos menuListarProdutosEstVencidos;
    private MenuAdicionarDetergente menuAdicionarDetergente;
    private MenuAdicionarFeijao menuAdicionarFeijao;
    private MenuRemoverProduto menuRemoverProduto;
    private MenuIncrementarQuantidade menuIncrementarQuantidade;
    private MenuDiminuirQuantidade menuDiminuirQuantidade;

    @Override
    public Estoque getStocks() {
        return super.getStocks();
    }

    @Override
    public void setStocks(Estoque stocks) {
        super.setStocks(stocks);
    }

    @Override
    public Scanner getInput() {
        return super.getInput();
    }

    @Override
    public void setInput(Scanner input) {
        super.setInput(input);
    }

    public MenuPrincipal(Estoque stocks, Scanner input) {
        super(stocks, input);
        this.menuListarProdutos = new MenuListarProdutos(stocks, input);
        this.menuProdutosOrdemAlfabetica = new MenuProdutosOrdemAlfabetica(stocks, input);
        this.menuProdutosOrdemCrescenteQuantidade = new MenuProdutosOrdemCrescenteQuantidade(stocks, input);
        this.menuProdutosOrdemCrescenteValidade = new MenuProdutosOrdemCrescenteValidade(stocks, input);
        this.menuListarProdutosEstVencidos = new MenuListarProdutosEstVencidos(stocks, input);
        this.menuAdicionarDetergente = new MenuAdicionarDetergente(stocks, input);
        this.menuAdicionarFeijao = new MenuAdicionarFeijao(stocks, input);
        this.menuRemoverProduto = new MenuRemoverProduto(stocks, input);
        this.menuIncrementarQuantidade = new MenuIncrementarQuantidade(stocks, input);
        this.menuDiminuirQuantidade = new MenuDiminuirQuantidade(stocks, input);
    }

    public void exibirMenu() throws EstoqueException  {
        byte opcao = 0;
        String menu = "";
        menu += "=============================================================" + ls;
        menu += "                       Menu Principal                        " + ls;
        menu += "=============================================================" + ls;
        menu += ++opcao + " - Listar Produtos" + ls;
        menu += ++opcao + " - Listar Produtos em Ordem Alfabetica" + ls;
        menu += ++opcao + " - Listar Produtos em Ordem Crescente de Quantidade" + ls;
        menu += ++opcao + " - Listar Produtos em Ordem Crescente de Validade" + ls;
        menu += ++opcao + " - Listar Produtos que Estarão Vencidos" + ls;
        menu += ++opcao + " - Adicionar Detergente" + ls;
        menu += ++opcao + " - Adicionar Feijão" + ls;
        menu += ++opcao + " - Remover Produto" + ls;
        menu += ++opcao + " - Incrementar quantidade de produto do Estoque" + ls;
        menu += ++opcao + " - Diminuuir Quantidade de Produto do Estoque" + ls;
        menu += ++opcao + " - Sair" + ls;


        while (true) {
            System.out.println(menu);
            int opcaoEscolhida = obterValorInteger("Digite a opção: ");
            Menu menuSelecionado = null;
            switch (opcaoEscolhida) {
                case 1:
                    menuSelecionado = this.menuListarProdutos;
                    break;
                case 2:
                    menuSelecionado = this.menuProdutosOrdemAlfabetica;
                    break;
                case 3:
                    menuSelecionado = this.menuProdutosOrdemCrescenteQuantidade;
                    break;
                case 4:
                    menuSelecionado = this.menuProdutosOrdemCrescenteValidade;
                    break;
                case 5:
                    menuSelecionado = this.menuListarProdutosEstVencidos;
                    break;
                case 6:
                    menuSelecionado = this.menuAdicionarDetergente;
                    break;
                case 7:
                    menuSelecionado = this.menuAdicionarFeijao;
                    break;
                case 8:
                    menuSelecionado = this.menuRemoverProduto;
                    break;
                case 9:
                    menuSelecionado = this. menuIncrementarQuantidade;
                    break;
                case 10:
                    menuSelecionado = this.menuDiminuirQuantidade;
                    break;
                case 11:
                    return false;
                default:
                    System.out.println();
                    System.out.println("Erro! Opção invalida: " + opcaoEscolhida);
                    System.out.println();
                    break;
            }
            if (menuSelecionado == null) {
                menuSelecionado.exibirMenu();
            }
        }
    }
}
