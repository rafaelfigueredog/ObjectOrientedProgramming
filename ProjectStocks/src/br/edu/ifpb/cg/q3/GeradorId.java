package br.edu.ifpb.cg.q3;

public class GeradorId {

    public Long obterProximoId() {
        return System.nanoTime();
    }

}
