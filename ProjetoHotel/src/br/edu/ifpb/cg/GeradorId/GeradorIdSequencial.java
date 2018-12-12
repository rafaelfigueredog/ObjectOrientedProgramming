package br.edu.ifpb.cg.GeradorId;
import java.io.Serializable;

public class GeradorIdSequencial implements Serializable, GeradorId {

    private static final long serialVersionUID = 1L;
    private Long id;

    public GeradorIdSequencial() {
        this.id = 100L;
    }

    @Override
    public Long obterProximoId() {
        return ++id;
    }

}
