package br.edu.ifpb;

public class Ebook extends Livro {

    private String extension;
    private String plataforma;

    public Ebook(double preco, String nome, String autor, String edicao, Integer ano, String extension, String plataforma) {
        super(preco, nome, autor, edicao, ano);
        this.extension = extension;
        this.plataforma = plataforma;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getAutor() {
        return super.getAutor();
    }

    @Override
    public void setAutor(String autor) {
        super.setAutor(autor);
    }

    @Override
    public String getEdicao() {
        return super.getEdicao();
    }

    @Override
    public void setEdicao(String edicao) {
        super.setEdicao(edicao);
    }

    @Override
    public Integer getAno() {
        return super.getAno();
    }

    @Override
    public void setAno(Integer ano) {
        super.setAno(ano);
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Ebook: " +
                "\nextension: " + extension +
                "\nplataforma: " + plataforma;
    }
}
