package br.edu.ifpb;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

public class MenuPrincipal {

    private static final String LS = System.lineSeparator();
    private Scanner in;
    private Livraria livraria;


    public MenuPrincipal(Livraria livraria) {
        this.livraria = livraria;
        this.in = new Scanner(System.in);
    }

    public boolean exibirMenu() throws LivrariaException {

        int OpcaoEscolhida;
        String menu = "";
        int opcao = 0;

        menu += "------------------------------" + LS;
        menu += "           Livraria           " + LS;
        menu += "------------------------------" + LS;
        menu += ++ opcao + " - Adicionar Livro"  + LS;
        menu += ++ opcao + " - Listar Livros"    + LS;
        menu += ++ opcao + " - Remover Livro"    + LS;
        menu += ++ opcao + " - Sair"             + LS;

        while (true) {

            System.out.println(menu);
            OpcaoEscolhida = obterOpcaoEscolhida("Digite a Opção: ");

            switch (OpcaoEscolhida) {

                case 1:
                    adicionarLivro();
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    removerLivro();
                    break;
                case 4:
                    return false;
                default:
                    System.out.println();
                    System.out.println("Opcao invalida, Tente novamente!" + OpcaoEscolhida);
                    System.out.println();
                    break;
            }
        }
    }


    public void removerLivro() throws LivrariaException {

        String menu = "";
        menu += "------------------------------" + LS;
        menu += "        Remover Livro         " + LS;
        menu += "------------------------------" + LS;
        System.out.println(menu);

        Collection<Livro> livros = this.livraria.getLivros();
        if (livros.isEmpty()){
            System.out.println("Não ha livros a remover!");
        }
        else {

            for (Livro livro: livros) {
                System.out.println(livro.toString());
            }

        }
        System.out.println();
        Long id = obterValorLong("ID do Livro: ");
        this.livraria.removerLivro(id);
    }


    public void adicionarLivro() {

        String menu = "";
        menu += "------------------------------" + LS;
        menu += "       Adicionar Livro        " + LS;
        menu += "------------------------------" + LS;
        System.out.println(menu);

        String titulo = obterValorString("Titulo: ");
        Date ano = obterValorAno("Ano do Lançamento: ");
        Integer edicao = obterValorInteger("Edição: ");
        Livro livro = new Livro(titulo, ano, edicao);
        this.livraria.adicionarLivro(livro);

        System.out.println();
        System.out.println("Livro adicionado com Sucesso!");
        System.out.println();

    }


    public void listarLivros(){

        String menu = LS;
        menu += "------------------------------" + LS;
        menu += "         Listar Livros        " + LS;
        menu += "------------------------------" + LS;
        System.out.println(menu);

        Collection<Livro> livros = this.livraria.getLivros();

        if (livros.isEmpty()){
            System.out.println("Livraria zerada!");
        }
        else {

            for (Livro livro: livros) {
                System.out.println(livro.show());
            }

        }

    }


    public String obterValorString(String menssagemProUsurio) {
        String valor = null;
        while (valor == null) {
            System.out.print(menssagemProUsurio);
            valor = this.in.nextLine();

        }
        return valor;
    }

    public Long obterValorLong(String menssagemProUsurio) {
        Long valor = null;
        while (valor == null) {
            try {
                System.out.print(menssagemProUsurio);
                String line = this.in.nextLine();
                valor = Long.parseLong(line);
            } catch (NumberFormatException e) {
                System.out.println("Valor Invalido, Tente novamente.");
            }
        }
        return valor;
    }

    public Date obterValorAno(String menssagemProUsurio) {
        Date valor = null;
        while (valor == null) {
            try {
                System.out.print(menssagemProUsurio);
                String line = this.in.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
                sdf.setLenient(false);
                valor = sdf.parse(line);
            } catch (ParseException e) {
                System.err.println("Valor Invalido, Tente novamente.");
            }
        }
        return valor;
    }



    public Integer obterValorInteger(String menssagemProUsurio) {
        Integer valor = null;
        while (valor == null) {
            try {
                System.out.print(menssagemProUsurio);
                String line = this.in.nextLine();
                valor = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Valor Invalido, Tente novamente.");
            }
        }
        return valor;
    }


    public int obterOpcaoEscolhida(String menssagemProUsurio) {
        Integer valor = null;
        while (valor == null) {
            System.out.print(menssagemProUsurio);
            try {
                String line;
                line = this.in.nextLine();
                valor = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Valor Invalido, Tente novamente.");
            }
        }
        return valor;
    }

}
