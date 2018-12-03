package br.edu.ifpb.cg.q3.Produtos;

import br.edu.ifpb.cg.q3.MinhaData;

public abstract class Produto {

    private Long id;
    private String marca;
    private Integer quatidade;
    private MinhaData dataValidade;

    public Produto(String marca, Integer quatidade, MinhaData dataValidade) {
        this.marca = marca;
        this.quatidade = quatidade;
        this.dataValidade = dataValidade;
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
        return "Produto{" +
                "id: " + id +
                "marca: '" + marca + '\'' +
                "quatidade: " + quatidade +
                "dataValidade: " + dataValidade +
                '}';
    }
}
