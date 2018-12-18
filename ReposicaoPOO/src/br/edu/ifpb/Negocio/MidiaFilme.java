package br.edu.ifpb.Negocio;

public class MidiaFilme extends Midia {

    private Boolean temConteudoExtra;

    public MidiaFilme(String titulo, Integer duracao, Integer anoLancamento, Boolean temConteudoExtra) {
        super(titulo, duracao, anoLancamento);
        this.temConteudoExtra = temConteudoExtra;
    }

    @Override
    public String toString() {
        return "MidiaFilme{" +
                "temConteudoExtra=" + temConteudoExtra +
                "} " + super.toString();
    }

    public void show() {
        super.show();
        String impressao = "Tem Conteudo Extra? ";
        impressao += temConteudoExtra ? "Sim" : "Não";
        System.out.print(impressao);
    }
}