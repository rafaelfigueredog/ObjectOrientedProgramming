package br.edu.ifpb;

import br.edu.ifpb.Negocio.*;

import java.io.Serializable;
import java.util.Collection;

public class GeradorID implements Serializable {

    public GeradorID() {
    }
    public Long obterProximoIDMidias(Locadora locadora) {
        Long idMidias = 1000L;
        Collection<Midia> midias = locadora.getMidias();

        if (midias.isEmpty())
            return ++idMidias;

        for (Midia midia: midias) {

            idMidias = Math.max(idMidias, midia.getId());

        }
        return ++idMidias;
    }

    public Long obterProximoIDFuncionarios(Locadora locadora) {
        Long idMidias = 2000L;
        Collection<Funcionario> funcionarios = locadora.getFuncionarios();

        if (funcionarios.isEmpty())
            return ++idMidias;

        for (Funcionario funcionario: funcionarios) {

            idMidias = Math.max(idMidias, funcionario.getId());

        }
        return ++idMidias;
    }

    public Long obterProximoIDClientes(Locadora locadora) {
        Long idMidias = 3000L;
        Collection<Cliente> clientes = locadora.getClientes();

        if (clientes.isEmpty())
            return ++idMidias;

        for (Cliente cliente: clientes) {

            idMidias = Math.max(idMidias, cliente.getId());

        }
        return ++idMidias;
    }

    public Long obterProximoIDLocacoes(Locadora locadora) {
        Long idMidias = 4000L;
        Collection<Locacao> locacaos = locadora.getLocacoes();

        if (locacaos.isEmpty())
            return ++idMidias;

        for (Locacao locacao: locacaos) {

            idMidias = Math.max(idMidias, locacao.getId());

        }
        return ++idMidias;
    }
}
