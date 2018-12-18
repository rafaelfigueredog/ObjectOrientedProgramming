package br.edu.ifpb.Negocio;

import java.util.Objects;

public class Cliente extends Pessoa {

    private String endereco;

    public Cliente(String nome, Long cpf, String endereco) {
        super(nome, cpf);
        this.endereco = endereco;
    }

    @Override
    public void show() {
        super.show();
        String impressao = "Endereço: "  + this.getEndereco();
        System.out.print(impressao);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(endereco, cliente.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), endereco);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "endereco='" + endereco + '\'' +
                '}';
    }
}
