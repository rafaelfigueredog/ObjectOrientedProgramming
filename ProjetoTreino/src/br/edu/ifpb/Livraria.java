package br.edu.ifpb;

import java.util.ArrayList;
import java.util.Collection;

public class Livraria {

    private Collection<Livro> livros;
    private GeradorID geradorID;

    public Livraria(GeradorID geradorID) {
        this.geradorID = geradorID;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro( Livro livro ) {

        this.livros.add(livro);

    }


    public void removerLivro( Long id ) {
        Livro livroSelecionado = null;
        for (Livro livro : this.livros ) {
            if ( livro.getId().equals(id) ) {
                livroSelecionado = livro;
            }
        }
        if (livroSelecionado != null) {
            livros.remove(livroSelecionado);
        }
    }



    public Collection<Livro> getLivros() {
        return livros;
    }

    public void setLivros(Collection<Livro> livros) {
        this.livros = livros;
    }

    public GeradorID getGeradorID() {
        return geradorID;
    }

    public void setGeradorID(GeradorID geradorID) {
        this.geradorID = geradorID;
    }

    @Override
    public String toString() {
        return "Livraria{" +
                "livros=" + livros +
                "geradorID=" + geradorID +
                '}';
    }


}
