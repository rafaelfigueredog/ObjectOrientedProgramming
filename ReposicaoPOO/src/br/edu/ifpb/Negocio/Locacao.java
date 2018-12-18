package br.edu.ifpb.Negocio;

import br.edu.ifpb.Imprimir;

import java.io.Serializable;

public class Locacao implements Serializable, Imprimir {

    private Long id;
    private Cliente cliente;
    private Funcionario funcionario;
    private Midia midia;
    private Double valorAluguel;
    private Double valorMulta;
    private Periodo periodo;
    private Boolean pago;
    private Boolean gostou;

    public Locacao(Cliente cliente, Funcionario funcionario, Midia midia, Double valorAluguel, Periodo periodo) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.midia = midia;
        this.valorAluguel = valorAluguel;
        this.valorMulta = null;
        this.periodo = periodo;
        this.pago = false;
        this.gostou = null;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Midia getMidia() {
        return midia;
    }

    public void setMidia(Midia midia) {
        this.midia = midia;
    }

    public Double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(Double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public Double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(Double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public Boolean getPago() {
        return pago;
    }

    public void setPago(Boolean pago) {
        this.pago = pago;
    }

    public Boolean getGostou() {
        return gostou;
    }

    public void setGostou(Boolean gostou) {
        this.gostou = gostou;
    }

    @Override
    public String toString() {
        return "Locacao{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", funcionario=" + funcionario +
                ", midia=" + midia +
                ", valorAluguel=" + valorAluguel +
                ", valorMulta=" + valorMulta +
                ", periodo=" + periodo +
                ", pago=" + pago +
                ", gostou=" + gostou +
                '}';
    }


    @Override
    public void show() {
        String impressao = "";
        impressao += "ID: " + getId() + "\n";
        impressao += "Cliente: " + getCliente().getNome() + "\n";
        impressao += "Funcionario: " + getFuncionario().getNome() + "\n";
        impressao += "Midia: " + getMidia().getTitulo() + "\n";
        impressao += "Valor Aluguel: " + getValorAluguel() + "\n";
        impressao += "Perido: " + getPeriodo() + "\n";
        impressao += "Pago:  " + (getPago() ? "Sim" : "Não") + "\n";
        if (valorMulta != null) {
            impressao += "Valor Aluguel: " + getValorMulta() + "\n";
        }
        if ( gostou != null ) {
            impressao += "Gostou:  " +  ( getGostou() ? "Sim" : "Não" );
        }
        System.out.println(impressao);
    }
}
