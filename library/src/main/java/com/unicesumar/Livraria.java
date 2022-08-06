package com.unicesumar;

import java.util.ArrayList;
import java.util.Collection;

public class Livraria {

    private Collection<Produto> produtos;
    private Collection<Cliente> clientes;
    private Collection<Venda> vendas; 
    private GeradorDeCodigo geradorDeCodigo; 



    public Livraria() {
        this.clientes = new ArrayList<Cliente>(); // []
        this.produtos = new ArrayList<Produto>(); // []
        this.vendas = new ArrayList<Venda>();     // []
        this.geradorDeCodigo = new GeradorDeCodigo();
    }
  
    
    public Produto getProdutoPorCodigo(String codigo) {
        for (Produto produto : this.produtos) {
            if (produto.getCodigo().equals(codigo)) {
                return produto; 
            }
        }
        return null;
    }


    public Cliente getClientePorCodigo(String codigo) {
        for (Cliente cliente : this.clientes) {
            if (cliente.getCodigo().equals(codigo)) {
                return cliente; 
            }
        }
        return null;
    }

    public void removerProdutoDoEstoque(String codigo) {
        for (Produto produto : this.produtos) {
            if (produto.getCodigo().equals(codigo)) {
                Integer quantidade = produto.getQuantidadeEmEstoque(); 
                quantidade = quantidade - 1; 
                produto.setQuantidadeEmEstoque(quantidade); 
            }
        }
    }
    
    
    public void addProduto(Produto produto) {
        String codigo = this.geradorDeCodigo.getProximoCodigo(); 
        produto.setCodigo(codigo); 
        produtos.add(produto); 
    }

    public void addCliente(Cliente cliente) {
        String codigo = this.geradorDeCodigo.getProximoCodigo(); 
        cliente.setCodigo(codigo); 
        clientes.add(cliente); 
    }

    public void addVenda(Venda venda) {
        String codigo = this.geradorDeCodigo.getProximoCodigo(); 
        venda.setCodigo(codigo); 
        vendas.add(venda);  
    }

    public Collection<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Collection<Produto> produtos) {
        this.produtos = produtos;
    }

    public Collection<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Collection<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(Collection<Venda> vendas) {
        this.vendas = vendas;
    }


}
