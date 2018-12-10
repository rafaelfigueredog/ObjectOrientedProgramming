package br.edu.ifpb.cg.q3.GeradorID;

import java.io.Serializable;

public class GeradorId implements Serializable {

    private static final long serialVersionUID = 1L;

    public Long obterProximoId() {
        return System.nanoTime();
    }

}
