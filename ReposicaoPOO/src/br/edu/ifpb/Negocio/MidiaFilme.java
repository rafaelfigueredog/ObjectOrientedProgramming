package br.edu.ifpb.Negocio;

public class MidiaFilme extends Midia {

    private Boolean temConteudoExtra;

    public MidiaFilme(String titulo, Integer duracao, Integer anoLancamento, Boolean temConteudoExtra) {
        super(titulo, duracao, anoLancamento);
        this.temConteudoExtra = temConteudoExtra;
    }


}
