package br.edu.ifpb;
import java.math.BigDecimal;

public class Cadastro {

    private String nome;
    private int idade;
    private BigDecimal salario;

    public Cadastro(String nome, int idade, double salario) throws NomeException, IdadeException, SalarioException {
        setNome(nome);
        setIdade(idade);
        setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws NomeException {

        if (nome == null) {
            throw new NomeException("Invalid Name");
        } else {
            this.nome = nome;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade( int idade ) throws IdadeException {
        if ( idade >= 130 || idade < 0 ) {
            throw new  IdadeException("Invalid Age");
        } else {
            this.idade = idade;
        }
    }

    public double getSalario() {
        return salario.doubleValue();
    }

    public void setSalario (double salario) throws SalarioException {

        if ( salario < 0 ) {
            throw new SalarioException("Invalid Salary");
        }
        BigDecimal SalarioBig = new BigDecimal(salario);
        this.salario = SalarioBig;
    }


    @Override
    public String toString() {
        return "\nCadastro" +
                "\nNome: " + nome  +
                "\nIdade: " + idade +
                "\nSalario: R$ " + salario;
    }
}
