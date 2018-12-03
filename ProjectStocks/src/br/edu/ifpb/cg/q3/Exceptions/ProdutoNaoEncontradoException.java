package br.edu.ifpb.cg.q3.Exceptions;

public class ProdutoNaoEncontradoException extends EstoqueException {

    private static final long serialVersionUID = 1L;

    public ProdutoNaoEncontradoException(Long id) {
        super("Produto Não Encontrado: " + id);
    }

}
