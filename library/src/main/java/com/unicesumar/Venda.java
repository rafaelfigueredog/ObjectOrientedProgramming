package com.unicesumar;

public class Venda {
    private String  codigo;
    private Cliente cliente;
    private Produto produto;
    private Double  valorSemDesconto;
    private Double  percentualDeDesconto;
    private Double  valorComDesconto;

    public Venda(String codigo, Cliente cliente, Produto produto, Double valorSemDesconto, Double percentualDeDesconto, Double valorComDesconto) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.produto = produto;
        this.valorSemDesconto = valorSemDesconto;
        this.percentualDeDesconto = percentualDeDesconto;
        this.valorComDesconto = valorComDesconto;
    }

    public Venda(Cliente cliente, Produto produto, Double valorSemDesconto, Double percentualDeDesconto, Double valorComDesconto) {
        this.cliente = cliente;
        this.produto = produto;
        this.valorSemDesconto = valorSemDesconto;
        this.percentualDeDesconto = percentualDeDesconto;
        this.valorComDesconto = valorComDesconto;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "codigo='" + codigo + '\'' +
                ", cliente=" + cliente +
                ", produto=" + produto +
                ", valorSemDesconto=" + valorSemDesconto +
                ", percentualDeDesconto=" + percentualDeDesconto +
                ", valorComDesconto=" + valorComDesconto +
                '}';
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getValorSemDesconto() {
        return valorSemDesconto;
    }

    public void setValorSemDesconto(Double valorSemDesconto) {
        this.valorSemDesconto = valorSemDesconto;
    }

    public Double getPercentualDeDesconto() {
        return percentualDeDesconto;
    }

    public void setPercentualDeDesconto(Double percentualDeDesconto) {
        this.percentualDeDesconto = percentualDeDesconto;
    }

    public Double getValorComDesconto() {
        return valorComDesconto;
    }

    public void setValorComDesconto(Double valorComDesconto) {
        this.valorComDesconto = valorComDesconto;
    }
}
