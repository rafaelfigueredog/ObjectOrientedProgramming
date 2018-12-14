package br.edu.ifpb.cg.Negocio;

import br.edu.ifpb.cg.TemRepresentacaoTextual;

import java.io.Serializable;
import java.util.Objects;

public class Hospedagem implements Serializable, TemRepresentacaoTextual {

    private static final long serialVersionUID = 1L;
    private Long id;
    private Quarto quarto;
    private Funcionario funcionario;
    private Hospede hospede;
    private Periodo periodo;
    private Double valor;

    public Hospedagem(Long id, Quarto quarto, Funcionario funcionario, Hospede hospede, Periodo periodo, Double valor) {
        this.id = id;
        this.quarto = quarto;
        this.funcionario = funcionario;
        this.hospede = hospede;
        this.periodo = periodo;
        this.valor = valor;
    }

    @Override
    public String imprimir() {

        String representacao = "\nHospedagem";

        representacao += "\nHospede: " + this.hospede.getNome();
        representacao += "\nQuarto: " + quarto.getNumero() + ", " + quarto.getClass().getSimpleName();
        representacao += "\nFuncionario: " + this.funcionario.getNome();
        representacao += "\nValor: " + this.valor;
        representacao += "\nPerido: " + this.periodo.getDataInicial() + ", " + this.periodo.getDataFinal();

        return representacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Hospedagem{" +
                "id=" + id +
                ", quarto=" + quarto +
                ", funcionario=" + funcionario +
                ", hospede=" + hospede +
                ", periodo=" + periodo +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospedagem that = (Hospedagem) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(quarto, that.quarto) &&
                Objects.equals(funcionario, that.funcionario) &&
                Objects.equals(hospede, that.hospede) &&
                Objects.equals(periodo, that.periodo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quarto, funcionario, hospede, periodo);
    }
}