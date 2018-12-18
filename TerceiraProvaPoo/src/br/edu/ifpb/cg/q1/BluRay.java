package br.edu.ifpb.cg.q1;

import java.util.Date;
import java.util.Objects;

public class BluRay extends DiscoDeMidia {

    private String temConteudoExtra;
    private boolean midia3D;

    public BluRay(Long id, String titulo, Integer duracaoemMinutos, Date anoDeLancamento, String temConteudoExtra, boolean midia3D) {
        super(id, titulo, duracaoemMinutos, anoDeLancamento);
        this.temConteudoExtra = temConteudoExtra;
        this.midia3D = midia3D;
    }

    public String getTemConteudoExtra() {
        return temConteudoExtra;
    }

    public void setTemConteudoExtra(String temConteudoExtra) {
        this.temConteudoExtra = temConteudoExtra;
    }

    public boolean isMidia3D() {
        return midia3D;
    }

    public void setMidia3D(boolean midia3D) {
        this.midia3D = midia3D;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BluRay bluRay = (BluRay) o;
        return midia3D == bluRay.midia3D &&
                Objects.equals(temConteudoExtra, bluRay.temConteudoExtra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), temConteudoExtra, midia3D);
    }

    @Override
    public String toString() {
        return "BluRay{" +
                "temConteudoExtra='" + temConteudoExtra + '\'' +
                ", midia3D=" + midia3D +
                '}';
    }


}
