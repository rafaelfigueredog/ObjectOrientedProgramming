package br.edu.ifpb.Negocio;

import br.edu.ifpb.Imprimir;

import java.io.Serializable;
import java.util.Objects;

public class Midia implements Serializable, Imprimir {

    private Long id;
    private String titulo;
    private Integer duracao;
    private Integer anoLancamento;

    public Midia(String titulo, Integer duracao, Integer anoLancamento) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
    }

    @Override
    public void show() {
        String impressao = "";
        impressao += this.getId()             + "\n";
        impressao += this.getTitulo()         + "\n";
        impressao += this.getAnoLancamento()  + "\n";
        impressao += this.getDuracao()        + "\n";
        System.out.println(impressao);
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

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Midia midia = (Midia) o;
        return Objects.equals(id, midia.id) &&
                Objects.equals(titulo, midia.titulo) &&
                Objects.equals(duracao, midia.duracao) &&
                Objects.equals(anoLancamento, midia.anoLancamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, duracao, anoLancamento);
    }

    @Override
    public String toString() {
        return "Midia{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", duracao=" + duracao +
                ", anoLancamento=" + anoLancamento +
                '}';
    }
}
