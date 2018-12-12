package br.edu.ifpb.cg.GeradorId;

import java.io.Serializable;

public class GeradorIdNanoTime implements Serializable, GeradorId {

    private static final long serialVersionUID = 1L;
    public Long obterProximoId() {
        return System.nanoTime();
    }
}
