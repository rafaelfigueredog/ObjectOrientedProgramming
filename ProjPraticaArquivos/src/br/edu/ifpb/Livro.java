package br.edu.ifpb;

import java.io.Serializable;
import java.lang.Comparable;

public class Livro implements Serializable {

    private int codigo;
    private String titulo;

    @Override
    public String toString() {
        return  "\nLivro:" +
                "\ncodigo: " + codigo +
                "\ntitulo: " + titulo;
    }

    public Livro(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
