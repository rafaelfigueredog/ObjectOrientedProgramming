package br.edu.ifpb.cg;

import java.io.Serializable;

public class GeradorIdNanoTime implements Serializable, GeradorID {

    public GeradorIdNanoTime() {
    }

    public Long obterProximoId() {
        return System.nanoTime();
    }
}
