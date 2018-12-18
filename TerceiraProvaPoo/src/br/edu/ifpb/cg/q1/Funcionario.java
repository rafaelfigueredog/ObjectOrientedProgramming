package br.edu.ifpb.cg.q1;


public class Funcionario extends Pessoa {

    private Double salario;

    public Funcionario(Long id, String nome, Long cpf, Double salario) {
        super(id, nome, cpf);
        this.salario = salario;
    }
}
