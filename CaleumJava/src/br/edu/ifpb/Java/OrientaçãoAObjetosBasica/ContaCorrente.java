package br.edu.ifpb.Java.OrientaçãoAObjetosBasica;

public class ContaCorrente {

    private String nome;
    private String numero;
    private double saldo;

    public ContaCorrente(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean sacar(double valor) {
        if (!(valor <= this.saldo)) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public void depositar (double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void transferir (ContaCorrente destino, double valor) {
        if (valor > 0 && valor < this.saldo)
            destino.depositar(valor);
            this.saldo -= valor;
    }

}