package br.edu.ifpb.cg;
import java.io.Serializable;

public class GeradorIdSequencial implements Serializable, GeradorID {

    private Long id;

    public GeradorIdSequencial() {
        this.id = 100L;
    }

    @Override
    public Long obterProximoId() {
        return ++id;
    }

}
