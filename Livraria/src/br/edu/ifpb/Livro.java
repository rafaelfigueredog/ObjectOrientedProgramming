package br.edu.ifpb;

public class Livro extends Produto implements Comparable<Livro> {

    private String nome;
    private String autor;
    private String edicao;
    private Integer ano;


    public Livro(double preco, String nome, String autor, String edicao, Integer ano) {
        super(preco);
        this.nome = nome;
        this.autor = autor;
        this.edicao = edicao;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override
    public int compareTo(Livro o) {
        return this.ano.compareTo(o.getAno());
    }

    @Override
    public String toString() {
        return "Livro {" +
                "nome: " + nome + "\' " +
                "autor: " + autor + "\' " +
                "edicao: " + edicao + "\' " +
                "ano: " + ano +
                '}';
    }
}
