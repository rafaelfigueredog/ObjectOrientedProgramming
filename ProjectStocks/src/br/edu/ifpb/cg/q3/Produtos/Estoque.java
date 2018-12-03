package br.edu.ifpb.cg.q3.Produtos;
import br.edu.ifpb.cg.q3.Exceptions.EstoqueException;
import br.edu.ifpb.cg.q3.GeradorID.GeradorId;
import br.edu.ifpb.cg.q3.Exceptions.ProdutoNaoEncontradoException;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class Estoque implements Serializable {

    private static final long serialVersionUID = 1L;

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
            System.out.println("");
        }
    }

    public void ModificarQuantidadeDoProduto(Long id, Integer quantidade) throws EstoqueException {

        Produto produtoAModificar = null;

        for (Produto produto: produtos) {
            if (produto.getId().equals(id)){
                produtoAModificar = produto;
                break;
            }
        }

        if (produtoAModificar == null) {
            throw new ProdutoNaoEncontradoException(id);
        }
        Integer novaQuatidade = produtoAModificar.getQuatidade() + quantidade;
        produtoAModificar.setQuatidade(novaQuatidade);
    }

    public void removerAnimal(Long id) throws EstoqueException {
        Produto produtoAserRemovido = null;
        for (Produto produto: produtos) {
            if (produto.getId().equals(id)){
                produtoAserRemovido = produto;
                break;
            }
        }

        if (produtoAserRemovido == null) {
            throw new ProdutoNaoEncontradoException(id);
        }
        this.produtos.remove(produtoAserRemovido);
    }

}
