package br.edu.ifpb.cg.q3.Produtos;

import br.edu.ifpb.cg.q3.Data.MinhaData;

public class Feijao extends Produto {

    private static final long serialVersionUID = 1L;

    private Integer kg;

    public Feijao(String marca, Integer quatidade, MinhaData dataValidade, Integer kg) {
        super(marca, quatidade, dataValidade);
        this.kg = kg;
    }

    public Integer getKg() {
        return kg;
    }

    public void setKg(Integer kg) {
        this.kg = kg;
    }

    @Override
    public String toString() {
        return "Feijao" +
                "\nId: " + super.getId() + " " +
                "\nMarca: " + super.getMarca() + " " +
                "\nQuatidade: " + super.getQuatidade() + " " +
                "\nData de Validade: " + super.getDataValidade() + " " +
                "\nKg: " + kg;
    }

}