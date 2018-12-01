package br.edu.ifpb;

import java.util.ArrayList;
import java.util.Collections;

public class GeradorIdSequencial implements GeradorId {

    private static final long serialVersionUID = 1L;

    public Long obterProximoId(Livraria livraria) {
        Long maiorId = getMaiorId((Collections<Produto>) livraria.getProdutos());
        Long proximoId = maiorId + 1;
        return proximoId;
    }

    public Long getMaiorId( Collections<Produto> produtos ) {
        Long maiorId = -1L;
        for (Produto produto: produtos) {
            maiorId = Math.max(maiorId, produto.getId());
        return maiorId;
    }
}
