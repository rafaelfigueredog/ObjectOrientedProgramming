package br.edu.ifpb;
import java.io.Serializable;
import java.util.Collection;


public class GeradorID implements Serializable {

    private static final long SerialVersionUID = 1L;

    public Long obterProximoId(Livraria livraria) {
        Long proximoId = getMaiorId( livraria.getLivros() );
        return ++proximoId;
    }

    public Long getMaiorId(Collection<Livro> livros) {
        return (long) livros.size();
    }

}
