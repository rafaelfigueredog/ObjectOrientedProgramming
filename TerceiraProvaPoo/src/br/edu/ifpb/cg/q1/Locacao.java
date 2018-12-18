package br.edu.ifpb.cg.q1;
import java.util.Objects;

public class Locacao {

    private Funcionario funcionario;
    private DiscoDeMidia discoDeMidia;
    private Cliente cliente;
    private Periodo periodoLocacao;
    private Double valor;

    public Locacao(Funcionario funcionario, DiscoDeMidia discoDeMidia, Cliente cliente, Periodo periodoLocacao, Double valor) {
        this.funcionario = funcionario;
        this.discoDeMidia = discoDeMidia;
        this.cliente = cliente;
        this.periodoLocacao = periodoLocacao;
        this.valor = valor;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public DiscoDeMidia getDiscoDeMidia() {
        return discoDeMidia;
    }

    public void setDiscoDeMidia(DiscoDeMidia discoDeMidia) {
        this.discoDeMidia = discoDeMidia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Periodo getPeriodoLocacao() {
        return periodoLocacao;
    }

    public void setPeriodoLocacao(Periodo periodoLocacao) {
        this.periodoLocacao = periodoLocacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Locacao locacao = (Locacao) o;
        return Objects.equals(funcionario, locacao.funcionario) &&
                Objects.equals(discoDeMidia, locacao.discoDeMidia) &&
                Objects.equals(cliente, locacao.cliente) &&
                Objects.equals(periodoLocacao, locacao.periodoLocacao) &&
                Objects.equals(valor, locacao.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(funcionario, discoDeMidia, cliente, periodoLocacao, valor);
    }

    @Override
    public String toString() {
        return "Locacao{" +
                "funcionario=" + funcionario +
                ", discoDeMidia=" + discoDeMidia +
                ", cliente=" + cliente +
                ", periodoLocacao=" + periodoLocacao +
                ", valor=" + valor +
                '}';
    }
}
