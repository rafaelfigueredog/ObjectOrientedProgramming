package br.edu.ifpb.cg.q1;

import java.util.Objects;

public class Cliente extends Pessoa {

    private String endereço;

    public Cliente(Long id, String nome, Long cpf, String endereço) {
        super(id, nome, cpf);
        this.endereço = endereço;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(endereço, cliente.endereço);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), endereço);
    }

    @Override
    public String
    toString() {
        return "Cliente{" +
                "endereço='" + endereço + '\'' +
                '}';
    }
}