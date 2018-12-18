package br.edu.ifpb.Negocio;
import br.edu.ifpb.GeradorID;
import br.edu.ifpb.IDNaoEncontradoException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;


public class Locadora implements Serializable {

    private Collection<Locacao> locacoes;
    private Collection<Cliente> clientes;
    private Collection<Funcionario> funcionarios;
    private Collection<Midia> midias;
    private GeradorID geradorID;

    public Locadora(GeradorID geradorID) {
        this.locacoes = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.midias = new ArrayList<>();
        this.geradorID = geradorID;
    }


    public void removerMidia(Long id) throws IDNaoEncontradoException {
        Midia midiaAremover = null;
        for (Midia midia : this.midias ) {
            if (midia.getId().equals(id)) {
                midiaAremover = midia;
            }
        }
        if (midiaAremover == null) {
            throw new IDNaoEncontradoException(id);
        }
        this.midias.remove(midiaAremover);
    }

    public void removerLocacao(Long id) throws IDNaoEncontradoException {
        Locacao locacaoAremover = null;
        for (Locacao locacao : this.locacoes ) {
            if (locacao.getId().equals(id)) {
                locacaoAremover = locacao;
            }
        }
        if (locacaoAremover == null) {
            throw new IDNaoEncontradoException(id);
        }
        this.locacoes.remove(locacaoAremover);
    }

    public void removerCliente(Long id) throws IDNaoEncontradoException {
        Cliente clienteAremover = null;
        for (Cliente cliente : this.clientes ) {
            if (cliente.getId().equals(id)) {
                clienteAremover = cliente;
            }
        }
        if (clienteAremover == null) {
            throw new IDNaoEncontradoException(id);
        }
        this.clientes.remove(clienteAremover);
    }

    public void removerFuncionario(Long id) throws IDNaoEncontradoException {
        Funcionario funcionarioAremover = null;
        for (Funcionario funcionario : this.funcionarios ) {
            if (funcionario.getId().equals(id)) {
                funcionarioAremover = funcionario;
            }
        }
        if (funcionarioAremover == null) {
            throw new IDNaoEncontradoException(id);
        }
        this.funcionarios.remove(funcionarioAremover);
    }

    public void adicionarMidia(Midia midia) {
        Long id = this.geradorID.obterProximoIDMidias(this);
        midia.setId(id);
        this.midias.add(midia);
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        Long id = this.geradorID.obterProximoIDFuncionarios(this);
        funcionario.setId(id);
        this.funcionarios.add(funcionario);
    }

    public void adicionarLocacao(Locacao locacao) {
        Long id = this.geradorID.obterProximoIDLocacoes(this);
        locacao.setId(id);
        this.locacoes.add(locacao);
    }

    public void adicionarCliente(Cliente cliente) {
        Long id = this.geradorID.obterProximoIDClientes(this);
        cliente.setId(id);
        this.clientes.add(cliente);
    }

    public Collection<Locacao> getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(Collection<Locacao> locacoes) {
        this.locacoes = locacoes;
    }

    public Collection<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Collection<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Collection<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Collection<Midia> getMidias() {
        return midias;
    }

    public void setMidias(Collection<Midia> midias) {
        this.midias = midias;
    }

    public GeradorID getGeradorID() {
        return geradorID;
    }

    public void setGeradorID(GeradorID geradorID) {
        this.geradorID = geradorID;
    }

    @Override
    public String toString() {
        return "Locadora{" +
                "locacoes=" + locacoes +
                ", clientes=" + clientes +
                ", funcionarios=" + funcionarios +
                ", midias=" + midias +
                ", geradorID=" + geradorID +
                '}';
    }

    public Cliente buscarCliente(Long id) throws IDNaoEncontradoException {
        Cliente clienteBuscado = null;
        for (Cliente cliente : this.clientes ) {
            if (cliente.getId().equals(id)) {
                clienteBuscado = cliente;
            }
        }
        if (clienteBuscado == null) {
            throw new IDNaoEncontradoException(id);
        }
        return clienteBuscado;
    }

    public Midia buscarMidia(Long id) throws IDNaoEncontradoException {
        Midia midiaBuscar = null;
        for (Midia midia : this.midias ) {
            if (midia.getId().equals(id)) {
                midiaBuscar = midia;
            }
        }
        if (midiaBuscar == null) {
            throw new IDNaoEncontradoException(id);
        }
        return midiaBuscar;
    }

    public Funcionario buscarFuncionario(Long id) throws IDNaoEncontradoException {
        Funcionario funcionarioBuscado = null;
        for (Funcionario funcionario : this.funcionarios ) {
            if (funcionario.getId().equals(id)) {
                funcionarioBuscado = funcionario;
            }
        }
        if (funcionarioBuscado == null) {
            throw new IDNaoEncontradoException(id);
        }
        return funcionarioBuscado;
    }

    public Locacao buscarLocacao(Long id) throws IDNaoEncontradoException {

        Locacao locacaoBuscada = null;
        for (Locacao locacao : this.locacoes ) {
            if (locacao.getId().equals(id)) {
                locacaoBuscada = locacao;
            }
        }
        if (locacaoBuscada == null) {
            throw new IDNaoEncontradoException(id);
        }
        return locacaoBuscada;
    }
}
