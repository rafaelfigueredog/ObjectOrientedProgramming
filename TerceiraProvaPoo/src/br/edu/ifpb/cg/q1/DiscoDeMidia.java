package br.edu.ifpb.cg.q1;

import java.util.Date;
import java.util.Objects;

public abstract class DiscoDeMidia {

    private Long id;
    private String titulo;
    private Integer duracaoemMinutos;
    private Date anoDeLançamento;

    public DiscoDeMidia(Long id, String titulo, Integer duracaoemMinutos, Date anoDeLancamento) {
        this.id = id;
        this.titulo = titulo;
        this.duracaoemMinutos = duracaoemMinutos;
        this.anoDeLançamento = anoDeLancamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracaoemMinutos() {
        return duracaoemMinutos;
    }

    public void setDuracaoemMinutos(Integer duracaoemMinutos) {
        this.duracaoemMinutos = duracaoemMinutos;
    }

    public Date getAnoDeLançamento() {
        return anoDeLançamento;
    }

    public void setAnoDeLançamento(Date anoDeLançamento) {
        this.anoDeLançamento = anoDeLançamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiscoDeMidia that = (DiscoDeMidia) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(titulo, that.titulo) &&
                Objects.equals(duracaoemMinutos, that.duracaoemMinutos) &&
                Objects.equals(anoDeLançamento, that.anoDeLançamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, duracaoemMinutos, anoDeLançamento);
    }

    @Override
    public String toString() {
        return "DiscoDeMidia{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", duracaoemMinutos=" + duracaoemMinutos +
                ", anoDeLançamento=" + anoDeLançamento +
                '}';
    }
}
