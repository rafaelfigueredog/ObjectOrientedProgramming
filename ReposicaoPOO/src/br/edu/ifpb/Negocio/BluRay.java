package br.edu.ifpb.Negocio;

public class BluRay extends MidiaFilme {

    private Boolean eh3D;

    public BluRay(String titulo, Integer duracao, Integer anoLancamento, Boolean temConteudoExtra, Boolean eh3D) {
        super(titulo, duracao, anoLancamento, temConteudoExtra);
        this.eh3D = eh3D;
    }

    public Boolean getEh3D() {
        return eh3D;
    }

    public void setEh3D(Boolean eh3D) {
        this.eh3D = eh3D;
    }

    @Override
    public void show() {
        super.show();
        String impressao = "\n";
        impressao += "3D? ";
        impressao += eh3D? "Sim" : "Não";
        System.out.print(impressao);
    }
}
