package br.edu.ifpb.cg.q2;
import br.edu.ifpb.cg.q1.GeradorId;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class Imobiliaria implements Serializable {

    private Collection<Imovel> imoveis;
    private GeradorId geradorId;

    public Imobiliaria (GeradorId geradorId) {
        this.imoveis = new ArrayList<Imovel>();
        this.geradorId = geradorId;
    }

    public void adicionarImovel(Imovel imovel) {
        this.imoveis.add(imovel);
    }

    public void removerImovel(Long id) {
        Imovel imovelaRemover = null;

        for (Imovel imovel: imoveis) {
            if (imovel.getId().equals(id)) {
                imovelaRemover = imovel;
            }
        }
        if (imovelaRemover != null)
            this.imoveis.remove(imovelaRemover);
    }

    public Collection<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(Collection<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    public GeradorId getGeradorId() {
        return geradorId;
    }

    public void setGeradorId(GeradorId geradorId) {
        this.geradorId = geradorId;
    }

    @Override
    public String toString() {
        return "Imobiliaria{" +
                "imoveis=" + imoveis +
                "geradorId=" + geradorId +
                '}';
    }
}
