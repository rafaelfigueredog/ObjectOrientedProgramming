package br.edu.ifpb.GestaoProdutos;

public class Livro extends Produto {

    private String nome;
    private String autor;
    private String Edição;
    private String Ano;

    public Livro(double preço, String nome, String autor, String edição, String ano) {
        super(preço);
        this.nome = nome;
        this.autor = autor;
        Edição = edição;
        Ano = ano;
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

    public String getEdição() {
        return Edição;
    }

    public void setEdição(String edição) {
        Edição = edição;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String ano) {
        Ano = ano;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", Edição='" + Edição + '\'' +
                ", Ano='" + Ano + '\'' +
                '}';
    }
}
