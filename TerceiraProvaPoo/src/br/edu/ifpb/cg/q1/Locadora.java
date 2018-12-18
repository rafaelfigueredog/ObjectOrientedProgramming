package br.edu.ifpb.cg.q1;
import java.util.ArrayList;
import java.util.Collection;

public class Locadora {

    private Collection<DiscoDeMidia> midias;
    private Collection<Funcionario> funcionarios;
    private Collection<Cliente> clientes;
    private Collection<Locacao> locacoes;
    private GeradorId geradorid;

    public Locadora (GeradorId geradorid) {
        this.midias = new ArrayList<DiscoDeMidia>();
        this.funcionarios = new ArrayList<Funcionario>();
        this.clientes = new ArrayList<Cliente>();
        this.locacoes = new ArrayList<Locacao>();
        this.geradorid = geradorid;
    }


    public Collection<DiscoDeMidia> getMidias() {
        return midias;
    }

    public void setMidias(Collection<DiscoDeMidia> midias) {
        this.midias = midias;
    }

    public Collection<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Collection<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Collection<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Collection<Locacao> getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(Collection<Locacao> locacoes) {
        this.locacoes = locacoes;
    }

    public GeradorId getGeradorid() {
        return geradorid;
    }

    public void setGeradorid(GeradorId geradorid) {
        this.geradorid = geradorid;
    }

    @Override
    public String toString() {
        return "Locadora{" +
                "midias=" + midias +
                ", funcionarios=" + funcionarios +
                ", clientes=" + clientes +
                ", locacoes=" + locacoes +
                ", geradorid=" + geradorid +
                '}';
    }
}
