package br.edu.ifpb.cg.q1;

import java.util.Date;
import java.util.Objects;

public class CD extends DiscoDeMidia {

    private Integer quantidadeDeFaixas;

    public CD(Long id, String titulo, Integer duracaoemMinutos, Date anoDeLancamento, Integer quantidadeDeFaixas) {
        super(id, titulo, duracaoemMinutos, anoDeLancamento);
        this.quantidadeDeFaixas = quantidadeDeFaixas;
    }

    public Integer getQuantidadeDeFaixas() {
        return quantidadeDeFaixas;
    }

    public void setQuantidadeDeFaixas(Integer quantidadeDeFaixas) {
        this.quantidadeDeFaixas = quantidadeDeFaixas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CD cd = (CD) o;
        return Objects.equals(quantidadeDeFaixas, cd.quantidadeDeFaixas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quantidadeDeFaixas);
    }

    @Override
    public String toString() {
        return "CD" +
                "{" +
                "quantidadeDeFaixas=" + quantidadeDeFaixas +
                '}';
    }
}
