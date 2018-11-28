package br.edu.ifpb.GestaoProdutos;

import br.edu.ifpb.PrecoInvalidoException;

public class Produto {

    private double preço;

    public Produto(double preço) {
        this.preço = preço;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "preço=" + preço +
                '}';
    }
}
