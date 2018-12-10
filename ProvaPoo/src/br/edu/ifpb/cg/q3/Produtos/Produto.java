package br.edu.ifpb.cg.q3.Produtos;
import br.edu.ifpb.cg.q3.Data.MinhaData;

import java.io.Serializable;

public abstract class Produto implements Comparable<Produto>, Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String marca;
    private Integer quatidade;
    private MinhaData dataValidade;

    public Produto(String marca, Integer quatidade, MinhaData dataValidade) {
        this.marca = marca;
        this.quatidade = quatidade;
        this.dataValidade = dataValidade;
    }

    @Override
    public int compareTo(Produto o) {
        return this.marca.compareTo(o.getMarca());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getQuatidade() {
        return quatidade;
    }

    public void setQuatidade(Integer quatidade) {
        this.quatidade = quatidade;
    }

    public MinhaData getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(MinhaData dataValidade) {
        this.dataValidade = dataValidade;
    }


    @Override
    public String toString() {
        return "Produto" +
                "\nId: " + id +
                "\nMarca: " + marca +
                "\nQuatidade: " + quatidade +
                "\nData de Validade: " + dataValidade;
    }
}
