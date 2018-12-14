package br.edu.ifpb.cg.Negocio;

import java.util.Objects;

public class Funcionario extends Pessoa {

    private static final long serialVersionUID = 1L;
    private Double salario;


    public Funcionario(Long id, String nome, Long cpf, Double salario) {
        super(id, nome, cpf);
        this.salario = salario;
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
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
    public Long getCpf() {
        return super.getCpf();
    }

    @Override
    public void setCpf(Long cpf) {
        super.setCpf(cpf);
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

    @Override
    public String imprimir() {

        String representacao = "";

        representacao += "\nFuncionario:";
        representacao += "\nId: " + super.getId();
        representacao += "\nNome: " + super.getNome();
        representacao += "\nCPF: " + super.getCpf();
        representacao += "\nSalário: " + salario + "\n";

        return representacao;
    }

    @Override
    public String imprimirCompacto() {

        String representacao = "";
        representacao += "\nFuncionario: " + super.getNome();
        representacao += "\nId: " + super.getId() + "\n";

        return representacao;
    }
}
