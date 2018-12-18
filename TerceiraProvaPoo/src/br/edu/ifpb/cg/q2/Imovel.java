package br.edu.ifpb.cg.q2;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public abstract  class Imovel implements Serializable {

    private Long id;
    private String endereco;
    private Integer numero;
    private Double preco;
    private boolean temPiscina;
    private Date dataVenda;

    public Imovel(Long id, String endereco, Integer numero, Double preco, boolean temPiscina, Date dataVenda) {
        this.id = id;
        this.endereco = endereco;
        this.numero = numero;
        this.preco = preco;
        this.temPiscina = temPiscina;
        this.dataVenda = dataVenda;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public boolean isTemPiscina() {
        return temPiscina;
    }

    public void setTemPiscina(boolean temPiscina) {
        this.temPiscina = temPiscina;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Imovel imovel = (Imovel) o;
        return temPiscina == imovel.temPiscina &&
                Objects.equals(id, imovel.id) &&
                Objects.equals(endereco, imovel.endereco) &&
                Objects.equals(numero, imovel.numero) &&
                Objects.equals(preco, imovel.preco) &&
                Objects.equals(dataVenda, imovel.dataVenda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, endereco, numero, preco, temPiscina, dataVenda);
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "id=" + id +
                ", endereco='" + endereco + '\'' +
                ", numero=" + numero +
                ", preco=" + preco +
                ", temPiscina=" + temPiscina +
                ", dataVenda=" + dataVenda +
                '}';
    }
}
