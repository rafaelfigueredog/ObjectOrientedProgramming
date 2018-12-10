package br.edu.ifpb.cg.q3.Produtos;

import br.edu.ifpb.cg.q3.Data.MinhaData;

public class Detergente extends Produto {

    private static final long serialVersionUID = 1L;

    private boolean neutro;

    public Detergente(String marca, Integer quatidade, MinhaData dataValidade, boolean neutro) {
        super(marca, quatidade, dataValidade);
        this.neutro = neutro;
    }

    public boolean isNeutro() {
        return neutro;
    }

    public void setNeutro(boolean neutro) {
        this.neutro = neutro;
    }

    @Override
    public String toString() {
        return "Detergente" +
                "\nId: " + super.getId() +
                "\nMarca: " + super.getMarca() +
                "\nQuatidade: " + super.getQuatidade() +
                "\nData de Validade: " + super.getDataValidade() +
                "\nneutro: " + (neutro? "Sim" : "Não")  ;
    }
}
