package br.edu.ifpb.cg.q3.Produtos;

public class Feijao extends Produto {

    private Integer kg;

    public Feijao(String marca, Integer quatidade, Integer kg) {
        super(marca, quatidade);
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
        return "Feijao {" +
                "id: " + super.getId() + " " +
                "marca: '" + super.getMarca() + " " +
                "quatidade: " + super.getQuatidade() + " " +
                "dataValidade: " + super.getDataValidade() + " " +
                "kg: " + kg +
                '}';
    }
}
