package br.edu.ifpb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Livraria implements Serializable {

    private GeradorId geradorId;
    private List<Produto> produtos;


    public Livraria(GeradorId geradorId) {
        this.produtos = new ArrayList<Produto>();
        this.geradorId = geradorId;
    }

    public GeradorId getGeradorId() {
        return geradorId;
    }

    public void setGeradorId(GeradorId geradorId) {
        this.geradorId = geradorId;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void listarProdutos() {
        for (Produto produto: produtos) {
            System.out.println(produto.toString());
        }
    }

    public void adicionarLivro(Livro livro){
        this.produtos.add(livro);
    }

    public void adicionarEbook(Ebook ebook) {
        this.produtos.add(ebook);
    }




}
