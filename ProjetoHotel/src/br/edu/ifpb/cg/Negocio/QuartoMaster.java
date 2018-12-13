package br.edu.ifpb.cg.Negocio;

import java.util.Objects;

public class QuartoMaster extends Quarto {

    private static final long serialVersionUID = 1L;
    private Boolean temHidromassagem;
    private Boolean temVistaMar;

    public QuartoMaster(Long id, Integer numero, Integer andar, Integer quantidadeMaximaPessoas, Boolean temHidromassagem, Boolean temVistaMar) {
        super(id, numero, andar, quantidadeMaximaPessoas);
        this.temHidromassagem = temHidromassagem;
        this.temVistaMar = temVistaMar;
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public void setId(Long id) {
        super.setId(id);
    }

    @Override
    public Integer getNumero() {
        return super.getNumero();
    }

    @Override
    public void setNumero(Integer numero) {
        super.setNumero(numero);
    }

    @Override
    public Integer getAndar() {
        return super.getAndar();
    }

    @Override
    public void setAndar(Integer andar) {
        super.setAndar(andar);
    }

    @Override
    public Integer getQuantidadeMaximaPessoas() {
        return super.getQuantidadeMaximaPessoas();
    }

    @Override
    public void setQuantidadeMaximaPessoas(Integer quantidadeMaximaPessoas) {
        super.setQuantidadeMaximaPessoas(quantidadeMaximaPessoas);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        QuartoMaster that = (QuartoMaster) o;
        return Objects.equals(temHidromassagem, that.temHidromassagem) &&
                Objects.equals(temVistaMar, that.temVistaMar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), temHidromassagem, temVistaMar);
    }

    @Override
    public String imprimir() {

        String representacao = "";

        representacao += "\nTipo: Master";
        representacao += "\nId: " + super.getId();
        representacao += "\nNumero: " + super.getNumero();
        representacao += "\nAndar: " + super.getAndar();
        representacao += "\nQtdeMaxPessoas: " + super.getQuantidadeMaximaPessoas();
        representacao += "\nTemVistaMar? " +  ( temVistaMar ? "Sim" : "Não" );
        representacao += "\nTemHidromassagem? " + ( temHidromassagem ? "Sim" : "Não");

        return representacao;
    }

    @Override
    public String toString() {
        return "QuartoMaster{" +
                "temHidromassagem=" + temHidromassagem +
                ", temVistaMar=" + temVistaMar +
                '}';
    }

    public Boolean getTemHidromassagem() {
        return temHidromassagem;
    }

    public void setTemHidromassagem(Boolean temHidromassagem) {
        this.temHidromassagem = temHidromassagem;
    }

    public Boolean getTemVistaMar() {
        return temVistaMar;
    }

    public void setTemVistaMar(Boolean temVistaMar) {
        this.temVistaMar = temVistaMar;
    }
}
