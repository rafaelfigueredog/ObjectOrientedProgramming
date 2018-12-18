package br.edu.ifpb.cg.q2;

import java.util.Date;

public class Casa extends Imovel {

    private Integer quantidadeDeAndares;

    public Casa(Long id, String endereco, Integer numero, Double preco, boolean temPiscina, Date dataVenda, Integer quantidadeDeAndares) {
        super(id, endereco, numero, preco, temPiscina, dataVenda);
        this.quantidadeDeAndares = quantidadeDeAndares;
    }

    public Integer getQuantidadeDeAndares() {
        return quantidadeDeAndares;
    }

    public void setQuantidadeDeAndares(Integer quantidadeDeAndares) {
        this.quantidadeDeAndares = quantidadeDeAndares;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "quantidadeDeAndares=" + quantidadeDeAndares +
                '}';
    }
}
