package br.edu.ifpb;
import br.edu.ifpb.GestaoProdutos.Ebook;
import br.edu.ifpb.GestaoProdutos.Livro;
import br.edu.ifpb.GestãoPessoas.Cliente;
import br.edu.ifpb.GestãoPessoas.Funcionario;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Livraria {

    private String endereço;
    private List<Livro> livros;
    private List<Ebook> ebooks;
    private List<Funcionario> funcionarios;
    private List<Cliente> clientes;


    public Livraria(String endereço) {
        this.endereço = endereço;
        this.livros = new ArrayList<Livro>();
        this.ebooks = new ArrayList<Ebook>();
        this.funcionarios = new ArrayList<Funcionario>();
        this.clientes = new ArrayList<Cliente>();
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<Ebook> getEbooks() {
        return ebooks;
    }

    public void setEbooks(List<Ebook> ebooks) {
        this.ebooks = ebooks;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void listarLivros() {
        for (Livro livro: livros) {
            System.out.println(livro.toString());
        }
    }

    public void adicionarLivro(Livro livro){
        this.livros.add(livro);
    }

    public void adicionarEbook(Ebook ebook) {
        this.ebooks.add(ebook);
    }




}
