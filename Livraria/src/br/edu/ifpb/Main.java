package br.edu.ifpb;

import br.edu.ifpb.GestaoProdutos.Ebook;
import br.edu.ifpb.GestaoProdutos.Livro;

public class Main {
    public static void main(String[] args) {

        Livraria livraria = new Livraria("Rua 1");
        Livro livro1 = new Livro(10, "Python", "Alguém", "1.0", "2018");
        livraria.adicionarLivro(livro1);
        System.out.println(livraria.getLivros());

    }
}
