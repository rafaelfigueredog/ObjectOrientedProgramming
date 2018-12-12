package br.edu.ifpb.cg.Negocio;

import br.edu.ifpb.cg.TemRepresentacaoTextual;

import java.util.Objects;

public class QuartoSimples extends Quarto implements TemRepresentacaoTextual {

    private static final long serialVersionUID = 1L;
    private Boolean ehDuplo;
    private Boolean temArCondicionado;

    public QuartoSimples(Long id, Integer numero, Integer andar, Integer quantidadeMaximaPessoas, Boolean ehDuplo, Boolean temArCondicionado) {
        super(id, numero, andar, quantidadeMaximaPessoas);
        this.ehDuplo = ehDuplo;
        this.temArCondicionado = temArCondicionado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        QuartoSimples that = (QuartoSimples) o;
        return Objects.equals(ehDuplo, that.ehDuplo) &&
                Objects.equals(temArCondicionado, that.temArCondicionado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ehDuplo, temArCondicionado);
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

    public Boolean getEhDuplo() {
        return ehDuplo;
    }

    public void setEhDuplo(Boolean ehDuplo) {
        this.ehDuplo = ehDuplo;
    }

    public Boolean getTemArCondicionado() {
        return temArCondicionado;
    }

    public void setTemArCondicionado(Boolean temArCondicionado) {
        this.temArCondicionado = temArCondicionado;
    }

    @Override
    public String imprimir() {

        String representacao = "";

        representacao += "\nQuartoMaster";
        representacao += "\nId: " + super.getId();
        representacao += "\nNumero: " + super.getNumero();
        representacao += "\nAndar: " + super.getAndar();
        representacao += "\nQtdeMaxPessoas: " + super.getQuantidadeMaximaPessoas();
        representacao += "\nTemArCondicionado? " + temArCondicionado;
        representacao += "\nÉ Duplo? " + ehDuplo;

        return representacao;
    }
}
