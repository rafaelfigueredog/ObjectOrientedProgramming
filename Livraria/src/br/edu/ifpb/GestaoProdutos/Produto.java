package br.edu.ifpb.GestaoProdutos;
import br.edu.ifpb.Exceções.PrecoInvalidoException;

public abstract class Produto {

    private double preco;

    public Produto(double preco) {
        this.preco = preco;
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
