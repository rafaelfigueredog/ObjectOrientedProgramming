package br.edu.ifpb.cg;

public class Funcionario extends Pessoa {

    private Double salario;


    public Funcionario(Long id, String nome, String cpf, Double salario) {
        super(id, nome, cpf);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
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
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salario=" + salario +
                '}';
    }
}
