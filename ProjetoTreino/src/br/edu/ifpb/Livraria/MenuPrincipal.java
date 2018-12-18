package br.edu.ifpb.Livraria;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MenuPrincipal {

    private static final String LS = System.lineSeparator();
    private Scanner in;
    private Livraria livraria;


    public MenuPrincipal(Livraria livraria) {
        this.livraria = livraria;
        this.in = new Scanner(System.in);
    }

    public void exibirOpcoes() {
        int opcao = 0;
        String menu = "";
        menu += ++ opcao + " - Adicionar Livro"       + LS;
        menu += ++ opcao + " - Listar Livros"         + LS;
        menu += ++ opcao + " - Livros Ord. Edição"    + LS;
        menu += ++ opcao + " - Remover Livro"         + LS;
        menu += ++ opcao + " - Sair"                  + LS;
        System.out.println(menu);

    }

    public boolean exibirMenu() throws LivrariaException {

        int OpcaoEscolhida;

        while (true) {

            exibirTitulodoMenu("Livraria");
            exibirOpcoes();
            OpcaoEscolhida = obterOpcaoEscolhida("Digite a Opção: ");
            switch (OpcaoEscolhida) {
                case 1:
                    adicionarLivro();
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    listarLivrosOrdenadosEdicao();
                    break;
                case 4:
                    removerLivro();
                    break;
                case 5:
                    return false;
                default:
                    System.out.println();
                    System.out.println("Opcao invalida, Tente novamente!" + OpcaoEscolhida);
                    System.out.println();
                    break;
            }
        }
    }

    public boolean livrariaZerada() {
        Collection<Livro> livros = this.livraria.getLivros();
        if (livros.isEmpty()){
            return true;
        }
        return false;
    }

    public void listarLivrosOrdenadosEdicao() {

        exibirTitulodoMenu("Livros Ord. Edição");
        Collection<Livro> livros = this.livraria.getLivros();
        if ( livrariaZerada() ) {
            System.out.println("Não Há Livros!");
        }
        else {
            List<Livro> livrosOrdenadosEdicao = new ArrayList<>(livros);
            livrosOrdenadosEdicao.sort(new ComparatorLivrosAnoLancamento());
            for (Livro livro: livrosOrdenadosEdicao) {
                System.out.println(livro.show());
                System.out.println();
            }
        }
    }


    public void removerLivro() throws LivrariaException {

        exibirTitulodoMenu("Remover Livro");
        Collection<Livro> livros = this.livraria.getLivros();
        if ( livrariaZerada() ) {
            System.out.println("Não Há Livros!");
        }
        else {
            for (Livro livro: livros) {
                System.out.println(livro.toString());
            }
        }
        System.out.println();
        Long id = obterValorLong("ID do Livro: ");
        if (this.livraria.removerLivro(id)) {
            System.out.println("Livro removido com sucesso!");
        }
    }


    public void adicionarLivro() {

        exibirTitulodoMenu("Adicionar Livro");
        String titulo = obterValorString("Titulo: ");
        Date ano = obterValorAno("Ano do Lançamento: ");
        Integer edicao = obterValorInteger("Edição: ");
        Livro livro = new Livro(titulo, ano, edicao);
        this.livraria.adicionarLivro(livro);
        System.out.println();
        System.out.println("Livro adicionado com Sucesso!");

    }


    public void exibirTitulodoMenu(String titulo) {

        String menu = LS;
        menu += "--------------------------------" + LS;
        menu += "           "+titulo               + LS;
        menu += "--------------------------------" + LS;
        System.out.println(menu);

    }


    public void listarLivros(){


        exibirTitulodoMenu("Listar Livros");
        Collection<Livro> livros = this.livraria.getLivros();
        if ( livrariaZerada() ) {
            System.out.println("Não Há Livros!");
        }
        else {

            for (Livro livro: livros) {
                System.out.println(livro.show());
                System.out.println();
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
