package br.edu.ifpb;

import java.io.Serializable;

public abstract class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private double preco;

    public Produto(double preco) {
        this.preco = preco;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws PrecoInvalidoException {
        if (preco < 0) {
            throw new PrecoInvalidoException("");
        }
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: " +
                "\npreço: " + preco;
    }
}
