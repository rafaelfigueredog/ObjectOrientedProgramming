package com.unicesumar;

public class Produto {
    private String  codigo;
    private String  descricao;
    private Integer quantidadeEmEstoque;
    private Double  preco;

    public Produto(String codigo, String descricao, Integer quantidadeEmEstoque, Double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.preco = preco;
    }

    public Produto(String descricao, Integer quantidadeEmEstoque, Double preco) {
        this.descricao = descricao;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                ", preco=" + preco +
                '}';
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
