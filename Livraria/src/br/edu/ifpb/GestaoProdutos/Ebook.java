package br.edu.ifpb.GestaoProdutos;

public class Ebook extends Livro {

    private String extension;
    private String plataforma;

    public Ebook(double preço, String nome, String autor, String edição, String ano, String extension, String plataforma) {
        super(preço, nome, autor, edição, ano);
        this.extension = extension;
        this.plataforma = plataforma;
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
        return "Ebook{" +
                "extension='" + extension + '\'' +
                "plataforma='" + plataforma + '\'' +
                '}';
    }
}
