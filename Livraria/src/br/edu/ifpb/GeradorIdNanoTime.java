package br.edu.ifpb;

public class GeradorIdNanoTime implements GeradorId {

    private static final long serialVersionUID = 1L;

    @Override
    public Long obterProximoId(Livraria livraria) {
        Long proximoId = new System.nanoTime();
        return proximoId;
    }
}
