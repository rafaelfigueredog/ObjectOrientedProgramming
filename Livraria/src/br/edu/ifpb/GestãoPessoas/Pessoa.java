package br.edu.ifpb.GestãoPessoas;

public class Pessoa {

    private String nome;
    private String telefone;
    private byte idade;

    public Pessoa(String nome, String telefone, byte idade) {
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }
}
