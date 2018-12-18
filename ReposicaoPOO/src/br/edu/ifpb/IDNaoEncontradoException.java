package br.edu.ifpb;

import br.edu.ifpb.LocadoraException;

public class IDNaoEncontradoException extends LocadoraException {

    public IDNaoEncontradoException(Long id) {
        super("ID nao Encontrado: " + id);
    }
}
