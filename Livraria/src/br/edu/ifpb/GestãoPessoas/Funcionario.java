package br.edu.ifpb.GestãoPessoas;

public class Funcionario extends Pessoa {

    private double salário;
    private int numeroDeHoras;
    private String cpf;

    public Funcionario (String nome, String telefone, byte idade, double salário, int numeroDeHoras, String cpf) {
        super(nome, telefone, idade);
        this.salário = salário;
        this.numeroDeHoras = numeroDeHoras;
        this.cpf = cpf;
    }

    public double getSalário() {
        return salário;
    }

    public void setSalário(double salário) {
        this.salário = salário;
    }

    public int getNumeroDeHoras() {
        return numeroDeHoras;
    }

    public void setNumeroDeHoras(int numeroDeHoras) {
        this.numeroDeHoras = numeroDeHoras;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
