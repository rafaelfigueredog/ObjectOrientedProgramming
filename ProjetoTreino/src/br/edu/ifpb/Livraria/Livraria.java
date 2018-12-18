package br.edu.ifpb.Livraria;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class Livraria implements Serializable {

    private static final long SerialVersionUID = 1L;

    private Collection<Livro> livros;
    private GeradorID geradorID;

    public Livraria(GeradorID geradorID) {
        this.geradorID = geradorID;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro( Livro livro ) {

        Long id = this.geradorID.obterProximoId(this);
        livro.setId(id);
        this.livros.add(livro);

    }


    public boolean removerLivro( Long id ) throws LivrariaException {
        Livro livroSelecionado = null;
        for (Livro livro : this.livros ) {
            if ( livro.getId().equals(id) ) {
                livroSelecionado = livro;
            }
        }
        if (livroSelecionado == null) {
            throw new LivroNaoEncontradoException(id);
        }
        livros.remove(livroSelecionado);
        return true;
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
