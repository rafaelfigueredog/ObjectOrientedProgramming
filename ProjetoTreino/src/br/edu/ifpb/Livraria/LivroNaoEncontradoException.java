package br.edu.ifpb.Livraria;

public class LivroNaoEncontradoException extends LivrariaException {

    private static final long SerialVersionUID = 1L;

    public LivroNaoEncontradoException(Long id) {
        super("Livro não encontrado: " + id);
    }
}
