package br.edu.ifpb.cg.Negocio;

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
    public String imprimir() {

        String representacao = "";

        representacao += "\nQuartoMaster";
        representacao += "\nId: " + super.getId();
        representacao += "\nNumero: " + super.getNumero();
        representacao += "\nAndar: " + super.getAndar();
        representacao += "\nQtdeMaxPessoas: " + super.getQuantidadeMaximaPessoas();
        representacao += "\nTemVistaMar? " + temVistaMar;
        representacao += "\nTemHidromassagem? " + temHidromassagem;

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
