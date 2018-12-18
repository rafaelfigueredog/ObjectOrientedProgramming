package br.edu.ifpb.cg.q1;

import java.io.Serializable;

public class GeradorId implements Serializable  {

    public Long obterProximoId() {
        return System.nanoTime();
    }

}
