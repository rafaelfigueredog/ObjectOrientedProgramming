package br.edu.ifpb;

import br.edu.ifpb.GestaoProdutos.Livro;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws PrecoInvalidoException {

        Livraria livraria = new Livraria("Rua 1");
        Livro livro1 = new Livro(120, "Python", "Beltrano", "1.0", 2018);
        Livro livro2 = new Livro(90, "C/C++", "Ciclano", "1.0", 2015);
        Livro livro3 = new Livro(700, "PHP", "Fulano", "1.0", 2012);
        Livro livro4 = new Livro(1100, "ArtedeProgramar", "Fulano", "1.0", 1990);
        Livro livro5 = new Livro(500, "JupyterNotebook", "Fulano", "1.0", 2014);

        livraria.adicionarLivro(livro1);
        livraria.adicionarLivro(livro2);
        livraria.adicionarLivro(livro3);
        livraria.adicionarLivro(livro4);
        livraria.adicionarLivro(livro5);

        System.out.println("Ordem de Inserção:");
        livraria.listarLivros();
        Collections.sort(livraria.getLivros());
        System.out.println("\nOrdenado por Ano:");
        livraria.listarLivros();

    }
}
