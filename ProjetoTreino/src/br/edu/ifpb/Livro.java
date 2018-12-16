package br.edu.ifpb;

import java.util.Date;

public class Livro  {

    private Long id;
    private String Titulo;
    private Date lancamento;
    private Integer edicao;

    public Livro(Long id, String titulo, Date lancamento, Integer edicao) {
        this.id = id;
        Titulo = titulo;
        this.lancamento = lancamento;
        this.edicao = edicao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public Date getLancamento() {
        return lancamento;
    }

    public void setLancamento(Date lancamento) {
        this.lancamento = lancamento;
    }

    public Integer getEdicao() {
        return edicao;
    }

    public void setEdicao(Integer edicao) {
        this.edicao = edicao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", Titulo='" + Titulo + '\'' +
                ", lancamento=" + lancamento +
                ", edicao=" + edicao +
                '}';
    }
}
