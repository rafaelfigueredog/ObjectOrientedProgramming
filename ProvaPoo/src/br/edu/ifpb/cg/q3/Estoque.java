package br.edu.ifpb.cg.q3;

import br.edu.ifpb.cg.q3.Produtos.Produto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Estoque {

    private Collection<Produto> produtos;
    private GeradorId geradorId;

    public Estoque(GeradorId geradorId) {
        this.produtos = new ArrayList<Produto>();
        this.geradorId = geradorId;
    }

    public Collection<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Collection<Produto> produtos) {
        this.produtos = produtos;
    }

    public GeradorId getGeradorId() {
        return geradorId;
    }

    public void setGeradorId(GeradorId geradorId) {
        this.geradorId = geradorId;
    }

    public void adicionarProduto(Produto produto) {
        GeradorId geradorId = new GeradorId();
        Long id = geradorId.obterProximoId();
        produto.setId(id);
        this.produtos.add(produto);
    }

    public void listarProdutos() {
        for (Produto produto: produtos) {
            System.out.println(produto);
        }
    }

}
