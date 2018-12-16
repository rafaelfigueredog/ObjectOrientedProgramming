package br.edu.ifpb;
import java.util.Collection;


public class GeradorID {

    public Long obterProximoId(Livraria livraria) {
        Long proximoId = getMaiorId( livraria.getLivros() );
        return ++proximoId;
    }

    public Long getMaiorId(Collection<Livro> livros) {
        return (long) livros.size();
    }

}
