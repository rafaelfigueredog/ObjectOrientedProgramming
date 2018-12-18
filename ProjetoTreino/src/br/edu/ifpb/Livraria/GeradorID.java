package br.edu.ifpb.Livraria;
import java.io.Serializable;
import java.util.Collection;


public class GeradorID implements Serializable {

    private static final long SerialVersionUID = 1L;
    private Long maiorID;

    public Long obterProximoId(Livraria livraria) {
        Long proximoId = getMaiorId( livraria.getLivros() );
        return ++proximoId;
    }

    public Long getMaiorId(Collection<Livro> livros) {
        Long maiorid = 0L;
        for (Livro livro: livros) {

            maiorid = Math.max(maiorid, livro.getId());

        }

        return maiorid;
    }

}
