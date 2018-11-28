package br.edu.ifpb;
import br.edu.ifpb.GestaoProdutos.Ebook;
import br.edu.ifpb.GestaoProdutos.Livro;
import br.edu.ifpb.GestãoPessoas.Cliente;
import br.edu.ifpb.GestãoPessoas.Funcionario;

import java.util.ArrayList;
import java.util.Collection;

public class Livraria {

    private String endereço;
    private Collection<Livro> livros;
    private Collection<Ebook> ebooks;
    private Collection<Funcionario> funcionarios;
    private Collection<Cliente> clientes;


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

    public Collection<Livro> getLivros() {
        return livros;
    }

    public Collection<Ebook> getEbooks() {
        return ebooks;
    }

    public Collection<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public Collection<Cliente> getClientes() {
        return clientes;
    }

    public void adicionarLivro(Livro livro){
        this.livros.add(livro);
    }

    public void adicionarEbook(Ebook ebook) {
        this.ebooks.add(ebook);
    }
}
