package br.edu.ifpb.cg.q2;

import java.util.Date;

public class Apartamento extends Imovel {

    private Integer numeroDoAndar;

    public Apartamento(Long id, String endereco, Integer numero, Double preco, boolean temPiscina, Date dataVenda, Integer numeroDoAndar) {
        super(id, endereco, numero, preco, temPiscina, dataVenda);
        this.numeroDoAndar = numeroDoAndar;
    }

    public Integer getNumeroDoAndar() {
        return numeroDoAndar;
    }

    public void setNumeroDoAndar(Integer numeroDoAndar) {
        this.numeroDoAndar = numeroDoAndar;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "numeroDoAndar=" + numeroDoAndar +
                '}';
    }
}
