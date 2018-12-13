package br.edu.ifpb.cg.Negocio;
import br.edu.ifpb.cg.GeradorId.GeradorId;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Hotel implements Serializable  {

    private static final long serialVersionUID = 1L;
    private List<Funcionario> funcionarios;
    private List<Quarto> quartos;
    private List<Hospede> hospedes;
    private List<Hospedagem> hospedagens;
    private GeradorId geradorId;

    public Hotel(GeradorId geradorId) {
        this.funcionarios = new ArrayList<>();
        this.quartos = new ArrayList<>();
        this.hospedes = new ArrayList<>();
        this.hospedagens = new ArrayList<>();
    }

    public GeradorId getGeradorId() {
        return geradorId;
    }

    public void setGeradorId(GeradorId geradorId) {
        this.geradorId = geradorId;
    }

    public void adicionarQuarto(Quarto quarto) {
        this.quartos.add(quarto);
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void adicionarHospede(Hospede hospede) {
        this.hospedes.add(hospede);
    }

    public List getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List getQuartos() {
        return quartos;
    }

    public void setQuartos(List quartos) {
        this.quartos = quartos;
    }

    public List getHospedes() {
        return hospedes;
    }

    public void setHospedes(List hospedes) {
        this.hospedes = hospedes;
    }

    public List getHospedagens() {
        return hospedagens;
    }

    public void setHospedagens(List hospedagens) {
        this.hospedagens = hospedagens;
    }


}
