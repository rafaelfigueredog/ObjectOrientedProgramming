package br.edu.ifpb.Negocio;

import java.util.Objects;

public class Funcionario extends Pessoa {

    private Double salario;

    public Funcionario(String nome, Long cpf, Double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    @Override
    public void show() {
        String impressao = "";
        impressao += this.getId()   + "\n";
        impressao += this.getNome() + "\n";
        impressao += this.getCpf()  + "\n";
        impressao += "$ " + this.getSalario() + "\n";
        System.out.println(impressao);
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(salario, that.salario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salario);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salario=" + salario +
                '}';
    }
}
