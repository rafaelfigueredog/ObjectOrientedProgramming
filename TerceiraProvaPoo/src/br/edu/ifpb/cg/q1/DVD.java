package br.edu.ifpb.cg.q1;

import java.util.Date;
import java.util.Objects;

public class DVD extends DiscoDeMidia {

    private String temConteudoExtra;

    public DVD(Long id, String titulo, Integer duracaoemMinutos, Date anoDeLancamento, String temConteudoExtra) {
        super(id, titulo, duracaoemMinutos, anoDeLancamento);
        this.temConteudoExtra = temConteudoExtra;
    }

    public String getTemConteudoExtra() {
        return temConteudoExtra;
    }

    public void setTemConteudoExtra(String temConteudoExtra) {
        this.temConteudoExtra = temConteudoExtra;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "temConteudoExtra='" + temConteudoExtra + '\'' +
                '}';
    }
}
