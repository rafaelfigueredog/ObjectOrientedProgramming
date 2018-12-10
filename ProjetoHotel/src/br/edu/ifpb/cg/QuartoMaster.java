package br.edu.ifpb.cg;

public class QuartoMaster extends Quarto {

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
