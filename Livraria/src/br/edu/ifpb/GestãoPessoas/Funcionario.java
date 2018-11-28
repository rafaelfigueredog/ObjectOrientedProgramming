package br.edu.ifpb.GestãoPessoas;

public class Funcionario extends Pessoa {

    private double salário;
    private int numeroDeHoras;
    private String cpf;

    public Funcionario(String nome, String telefone, byte idade, double salário, int numeroDeHoras, String cpf) {
        super(nome, telefone, idade);
        this.salário = salário;
        this.numeroDeHoras = numeroDeHoras;
        this.cpf = cpf;
    }
}
