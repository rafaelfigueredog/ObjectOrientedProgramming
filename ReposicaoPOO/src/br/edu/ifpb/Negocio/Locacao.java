package br.edu.ifpb.Negocio;

import java.io.Serializable;

public class Locacao implements Serializable {

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
}
