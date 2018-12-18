package br.edu.ifpb.Negocio;

public class CD extends Midia {

    private Integer quantidadeFaixas;

    public CD(String titulo, Integer duracao, Integer anoLancamento, Integer quantidadeFaixas) {
        super(titulo, duracao, anoLancamento);
        this.quantidadeFaixas = quantidadeFaixas;
    }

    public Integer getQuantidadeFaixas() {
        return quantidadeFaixas;
    }

    public void setQuantidadeFaixas(Integer quantidadeFaixas) {
        this.quantidadeFaixas = quantidadeFaixas;
    }
}
